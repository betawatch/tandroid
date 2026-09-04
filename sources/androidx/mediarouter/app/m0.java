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
import s4.c1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class m0 extends s4.h0 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public k0 r;
    public final int s;
    public final AccelerateDecelerateInterpolator v;
    public final /* synthetic */ o0 w;

    public m0(o0 o0Var) {
        this.w = o0Var;
        Context context = o0Var.y;
        this.d = LayoutInflater.from(context);
        this.e = v7.d0.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = v7.d0.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = v7.d0.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = v7.d0.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.s = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.v = new AccelerateDecelerateInterpolator();
        G();
    }

    @Override // s4.h0
    public final void A(c1 c1Var) {
        this.w.L.values().remove(c1Var);
    }

    public final void D(int i10, View view) {
        n nVar = new n(view, i10, view.getLayoutParams().height, 1);
        nVar.setAnimationListener(new k(this, 2));
        nVar.setDuration(this.s);
        nVar.setInterpolator(this.v);
        view.startAnimation(nVar);
    }

    public final Drawable E(p4.v vVar) {
        Uri uri = vVar.f;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.w.y.getContentResolver().openInputStream(uri), null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException e7) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e7);
            }
        }
        int i10 = vVar.n;
        return i10 != 1 ? i10 != 2 ? vVar.e() ? this.n : this.e : this.h : this.f;
    }

    public final void F() {
        p4.o oVar;
        o0 o0Var = this.w;
        ArrayList arrayList = o0Var.x;
        arrayList.clear();
        ArrayList arrayList2 = o0Var.v;
        ArrayList arrayList3 = new ArrayList();
        p4.u uVar = o0Var.r.a;
        uVar.getClass();
        p4.x.b();
        for (p4.v vVar : DesugarCollections.unmodifiableList(uVar.b)) {
            mg.n b10 = o0Var.r.b(vVar);
            if (b10 != null && (oVar = (p4.o) b10.b) != null && oVar.d) {
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
        o0 o0Var = this.w;
        ArrayList arrayList2 = o0Var.w;
        Context context = o0Var.y;
        ArrayList arrayList3 = o0Var.v;
        this.r = new k0(o0Var.r, 1);
        ArrayList arrayList4 = o0Var.s;
        boolean z10 = false;
        if (arrayList4.isEmpty()) {
            arrayList.add(new k0(o0Var.r, 3));
        } else {
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                arrayList.add(new k0((p4.v) obj, 3));
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
                        o0Var.r.getClass();
                        p4.p a2 = p4.v.a();
                        String j3 = a2 != null ? a2.j() : null;
                        if (TextUtils.isEmpty(j3)) {
                            j3 = context.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new k0(j3, 2));
                        z11 = true;
                    }
                    arrayList.add(new k0(vVar, 3));
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
                p4.v vVar3 = o0Var.r;
                if (vVar3 != vVar2) {
                    if (!z10) {
                        vVar3.getClass();
                        p4.p a10 = p4.v.a();
                        String k10 = a10 != null ? a10.k() : null;
                        if (TextUtils.isEmpty(k10)) {
                            k10 = context.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new k0(k10, 2));
                        z10 = true;
                    }
                    arrayList.add(new k0(vVar2, 4));
                }
            }
        }
        F();
    }

    @Override // s4.h0
    public final int h() {
        return this.c.size() + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        k0 k0Var;
        if (i10 == 0) {
            k0Var = this.r;
        } else {
            k0Var = (k0) this.c.get(i10 - 1);
        }
        return k0Var.b;
    }

    @Override // s4.h0
    public final void v(c1 c1Var, int i10) {
        mg.n b10;
        p4.o oVar;
        ArrayList arrayList = this.c;
        int i11 = (i10 == 0 ? this.r : (k0) arrayList.get(i10 - 1)).b;
        k0 k0Var = i10 == 0 ? this.r : (k0) arrayList.get(i10 - 1);
        o0 o0Var = this.w;
        int i12 = 0;
        if (i11 == 1) {
            o0Var.L.put(((p4.v) k0Var.a).c, (g0) c1Var);
            i0 i0Var = (i0) c1Var;
            View view = i0Var.a;
            o0 o0Var2 = i0Var.B.w;
            if (o0Var2.i0 && DesugarCollections.unmodifiableList(o0Var2.r.v).size() > 1) {
                i12 = i0Var.A;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i12;
            view.setLayoutParams(layoutParams);
            p4.v vVar = (p4.v) k0Var.a;
            i0Var.t(vVar);
            i0Var.z.setText(vVar.d);
            return;
        }
        if (i11 == 2) {
            ((j0) c1Var).v.setText(k0Var.a.toString());
            return;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new IllegalStateException();
            }
            h0 h0Var = (h0) c1Var;
            View view2 = h0Var.v;
            p4.v vVar2 = (p4.v) k0Var.a;
            h0Var.A = vVar2;
            ImageView imageView = h0Var.w;
            imageView.setVisibility(0);
            h0Var.x.setVisibility(4);
            m0 m0Var = h0Var.B;
            List unmodifiableList = DesugarCollections.unmodifiableList(m0Var.w.r.v);
            view2.setAlpha((unmodifiableList.size() == 1 && unmodifiableList.get(0) == vVar2) ? h0Var.z : 1.0f);
            view2.setOnClickListener(new x(h0Var, 2));
            imageView.setImageDrawable(m0Var.E(vVar2));
            h0Var.y.setText(vVar2.d);
            return;
        }
        o0Var.L.put(((p4.v) k0Var.a).c, (g0) c1Var);
        l0 l0Var = (l0) c1Var;
        float f7 = l0Var.F;
        x xVar = l0Var.H;
        ImageView imageView2 = l0Var.A;
        View view3 = l0Var.z;
        CheckBox checkBox = l0Var.E;
        p4.v vVar3 = (p4.v) k0Var.a;
        m0 m0Var2 = l0Var.I;
        o0 o0Var3 = m0Var2.w;
        if (vVar3 == o0Var3.r && DesugarCollections.unmodifiableList(vVar3.v).size() > 0) {
            Iterator it = DesugarCollections.unmodifiableList(vVar3.v).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p4.v vVar4 = (p4.v) it.next();
                if (!o0Var3.v.contains(vVar4)) {
                    vVar3 = vVar4;
                    break;
                }
            }
        }
        l0Var.t(vVar3);
        imageView2.setImageDrawable(m0Var2.E(vVar3));
        l0Var.C.setText(vVar3.d);
        checkBox.setVisibility(0);
        boolean v = l0Var.v(vVar3);
        boolean z10 = !o0Var3.x.contains(vVar3) && (!l0Var.v(vVar3) || DesugarCollections.unmodifiableList(o0Var3.r.v).size() >= 2) && (!l0Var.v(vVar3) || ((b10 = o0Var3.r.b(vVar3)) != null && ((oVar = (p4.o) b10.b) == null || oVar.c)));
        checkBox.setChecked(v);
        l0Var.B.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z10);
        checkBox.setEnabled(z10);
        l0Var.w.setEnabled(z10 || v);
        l0Var.x.setEnabled(z10 || v);
        view3.setOnClickListener(xVar);
        checkBox.setOnClickListener(xVar);
        RelativeLayout relativeLayout = l0Var.D;
        if (v && !l0Var.v.e()) {
            i12 = l0Var.G;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i12;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z10 || v) ? 1.0f : f7);
        checkBox.setAlpha((z10 || !v) ? 1.0f : f7);
    }

    @Override // s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
        LayoutInflater layoutInflater = this.d;
        if (i10 == 1) {
            return new i0(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i10 == 2) {
            return new j0(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        if (i10 == 3) {
            return new l0(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
        }
        if (i10 == 4) {
            return new h0(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }
        throw new IllegalStateException();
    }
}
