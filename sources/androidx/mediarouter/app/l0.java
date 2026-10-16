package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import s4.b1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class l0 extends s4.g0 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public j0 r;
    public final int s;
    public final AccelerateDecelerateInterpolator v;
    public final /* synthetic */ n0 w;

    public l0(n0 n0Var) {
        this.w = n0Var;
        Context context = n0Var.y;
        this.d = LayoutInflater.from(context);
        this.e = v7.a0.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = v7.a0.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = v7.a0.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = v7.a0.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.s = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.v = new AccelerateDecelerateInterpolator();
        G();
    }

    @Override // s4.g0
    public final void A(b1 b1Var) {
        this.w.L.values().remove(b1Var);
    }

    public final void D(int i10, View view) {
        m mVar = new m(view, i10, view.getLayoutParams().height, 1);
        mVar.setAnimationListener(new j(this, 2));
        mVar.setDuration(this.s);
        mVar.setInterpolator(this.v);
        view.startAnimation(mVar);
    }

    public final Drawable E(p4.v vVar) {
        Uri uri = vVar.f;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.w.y.getContentResolver().openInputStream(uri), null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException e) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e);
            }
        }
        int i10 = vVar.n;
        return i10 != 1 ? i10 != 2 ? vVar.e() ? this.n : this.e : this.h : this.f;
    }

    public final void F() {
        p4.o oVar;
        n0 n0Var = this.w;
        ArrayList arrayList = n0Var.x;
        arrayList.clear();
        ArrayList arrayList2 = n0Var.v;
        ArrayList arrayList3 = new ArrayList();
        p4.u uVar = n0Var.r.a;
        uVar.getClass();
        p4.x.b();
        for (p4.v vVar : DesugarCollections.unmodifiableList(uVar.b)) {
            m.l b10 = n0Var.r.b(vVar);
            if (b10 != null && (oVar = (p4.o) b10.a) != null && oVar.d) {
                arrayList3.add(vVar);
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        l();
    }

    public final void G() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        n0 n0Var = this.w;
        ArrayList arrayList2 = n0Var.w;
        Context context = n0Var.y;
        ArrayList arrayList3 = n0Var.v;
        this.r = new j0(n0Var.r, 1);
        ArrayList arrayList4 = n0Var.s;
        boolean z10 = false;
        if (arrayList4.isEmpty()) {
            arrayList.add(new j0(n0Var.r, 3));
        } else {
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                arrayList.add(new j0((p4.v) obj, 3));
            }
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z11 = false;
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                p4.v vVar = (p4.v) obj2;
                if (!arrayList4.contains(vVar)) {
                    if (!z11) {
                        n0Var.r.getClass();
                        p4.p a2 = p4.v.a();
                        String j10 = a2 != null ? a2.j() : null;
                        if (TextUtils.isEmpty(j10)) {
                            j10 = context.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new j0(j10, 2));
                        z11 = true;
                    }
                    arrayList.add(new j0(vVar, 3));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList2.get(i12);
                i12++;
                p4.v vVar2 = (p4.v) obj3;
                p4.v vVar3 = n0Var.r;
                if (vVar3 != vVar2) {
                    if (!z10) {
                        vVar3.getClass();
                        p4.p a10 = p4.v.a();
                        String k10 = a10 != null ? a10.k() : null;
                        if (TextUtils.isEmpty(k10)) {
                            k10 = context.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new j0(k10, 2));
                        z10 = true;
                    }
                    arrayList.add(new j0(vVar2, 4));
                }
            }
        }
        F();
    }

    @Override // s4.g0
    public final int h() {
        return this.c.size() + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        j0 j0Var;
        if (i10 == 0) {
            j0Var = this.r;
        } else {
            j0Var = (j0) this.c.get(i10 - 1);
        }
        return j0Var.b;
    }

    @Override // s4.g0
    public final void v(b1 b1Var, int i10) {
        m.l b10;
        p4.o oVar;
        ArrayList arrayList = this.c;
        int i11 = (i10 == 0 ? this.r : (j0) arrayList.get(i10 - 1)).b;
        j0 j0Var = i10 == 0 ? this.r : (j0) arrayList.get(i10 - 1);
        n0 n0Var = this.w;
        int i12 = 0;
        if (i11 == 1) {
            n0Var.L.put(((p4.v) j0Var.a).c, (f0) b1Var);
            h0 h0Var = (h0) b1Var;
            View view = h0Var.a;
            n0 n0Var2 = h0Var.B.w;
            if (n0Var2.i0 && DesugarCollections.unmodifiableList(n0Var2.r.v).size() > 1) {
                i12 = h0Var.A;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i12;
            view.setLayoutParams(layoutParams);
            p4.v vVar = (p4.v) j0Var.a;
            h0Var.t(vVar);
            h0Var.z.setText(vVar.d);
            return;
        }
        if (i11 == 2) {
            ((i0) b1Var).v.setText(j0Var.a.toString());
            return;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new IllegalStateException();
            }
            g0 g0Var = (g0) b1Var;
            View view2 = g0Var.v;
            p4.v vVar2 = (p4.v) j0Var.a;
            g0Var.A = vVar2;
            ImageView imageView = g0Var.w;
            imageView.setVisibility(0);
            g0Var.x.setVisibility(4);
            l0 l0Var = g0Var.B;
            List unmodifiableList = DesugarCollections.unmodifiableList(l0Var.w.r.v);
            view2.setAlpha((unmodifiableList.size() == 1 && unmodifiableList.get(0) == vVar2) ? g0Var.z : 1.0f);
            view2.setOnClickListener(new w(g0Var, 2));
            imageView.setImageDrawable(l0Var.E(vVar2));
            g0Var.y.setText(vVar2.d);
            return;
        }
        n0Var.L.put(((p4.v) j0Var.a).c, (f0) b1Var);
        k0 k0Var = (k0) b1Var;
        float f7 = k0Var.F;
        w wVar = k0Var.H;
        ImageView imageView2 = k0Var.A;
        View view3 = k0Var.z;
        CheckBox checkBox = k0Var.E;
        p4.v vVar3 = (p4.v) j0Var.a;
        l0 l0Var2 = k0Var.I;
        n0 n0Var3 = l0Var2.w;
        if (vVar3 == n0Var3.r && DesugarCollections.unmodifiableList(vVar3.v).size() > 0) {
            Iterator it = DesugarCollections.unmodifiableList(vVar3.v).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p4.v vVar4 = (p4.v) it.next();
                if (!n0Var3.v.contains(vVar4)) {
                    vVar3 = vVar4;
                    break;
                }
            }
        }
        k0Var.t(vVar3);
        imageView2.setImageDrawable(l0Var2.E(vVar3));
        k0Var.C.setText(vVar3.d);
        checkBox.setVisibility(0);
        boolean v = k0Var.v(vVar3);
        boolean z10 = !n0Var3.x.contains(vVar3) && (!k0Var.v(vVar3) || DesugarCollections.unmodifiableList(n0Var3.r.v).size() >= 2) && (!k0Var.v(vVar3) || ((b10 = n0Var3.r.b(vVar3)) != null && ((oVar = (p4.o) b10.a) == null || oVar.c)));
        checkBox.setChecked(v);
        k0Var.B.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z10);
        checkBox.setEnabled(z10);
        k0Var.w.setEnabled(z10 || v);
        k0Var.x.setEnabled(z10 || v);
        view3.setOnClickListener(wVar);
        checkBox.setOnClickListener(wVar);
        RelativeLayout relativeLayout = k0Var.D;
        if (v && !k0Var.v.e()) {
            i12 = k0Var.G;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i12;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z10 || v) ? 1.0f : f7);
        checkBox.setAlpha((z10 || !v) ? 1.0f : f7);
    }

    @Override // s4.g0
    public final b1 x(ViewGroup viewGroup, int i10) {
        LayoutInflater layoutInflater = this.d;
        if (i10 == 1) {
            return new h0(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i10 == 2) {
            return new i0(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        if (i10 == 3) {
            return new k0(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
        }
        if (i10 == 4) {
            return new g0(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }
        throw new IllegalStateException();
    }
}
