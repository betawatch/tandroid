package androidx.mediarouter.app;

import a8.b7;
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
import v4.d1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class l0 extends v4.g0 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public j0 r;
    public final int s;
    public final AccelerateDecelerateInterpolator w;
    public final /* synthetic */ n0 x;

    public l0(n0 n0Var) {
        this.x = n0Var;
        Context context = n0Var.D;
        this.d = LayoutInflater.from(context);
        this.e = b7.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = b7.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = b7.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = b7.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.s = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.w = new AccelerateDecelerateInterpolator();
        G();
    }

    @Override // v4.g0
    public final void A(d1 d1Var) {
        this.x.L.values().remove(d1Var);
    }

    public final void D(int i7, View view) {
        m mVar = new m(view, i7, view.getLayoutParams().height, 1);
        mVar.setAnimationListener(new f0(this, 0));
        mVar.setDuration(this.s);
        mVar.setInterpolator(this.w);
        view.startAnimation(mVar);
    }

    public final Drawable E(s4.v vVar) {
        Uri uri = vVar.f;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.x.D.getContentResolver().openInputStream(uri), null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException e10) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e10);
            }
        }
        int i7 = vVar.n;
        return i7 != 1 ? i7 != 2 ? vVar.e() ? this.n : this.e : this.h : this.f;
    }

    public final void F() {
        s4.o oVar;
        n0 n0Var = this.x;
        ArrayList arrayList = n0Var.y;
        arrayList.clear();
        ArrayList arrayList2 = n0Var.w;
        ArrayList arrayList3 = new ArrayList();
        s4.u uVar = n0Var.r.a;
        uVar.getClass();
        s4.x.b();
        for (s4.v vVar : DesugarCollections.unmodifiableList(uVar.b)) {
            org.telegram.ui.Components.n b10 = n0Var.r.b(vVar);
            if (b10 != null && (oVar = (s4.o) b10.a) != null && oVar.d) {
                arrayList3.add(vVar);
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        f();
    }

    public final void G() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        n0 n0Var = this.x;
        ArrayList arrayList2 = n0Var.x;
        Context context = n0Var.D;
        ArrayList arrayList3 = n0Var.w;
        this.r = new j0(n0Var.r, 1);
        ArrayList arrayList4 = n0Var.s;
        boolean z9 = false;
        if (arrayList4.isEmpty()) {
            arrayList.add(new j0(n0Var.r, 3));
        } else {
            int size = arrayList4.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList4.get(i7);
                i7++;
                arrayList.add(new j0((s4.v) obj, 3));
            }
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z10 = false;
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                s4.v vVar = (s4.v) obj2;
                if (!arrayList4.contains(vVar)) {
                    if (!z10) {
                        n0Var.r.getClass();
                        s4.p a10 = s4.v.a();
                        String j3 = a10 != null ? a10.j() : null;
                        if (TextUtils.isEmpty(j3)) {
                            j3 = context.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new j0(j3, 2));
                        z10 = true;
                    }
                    arrayList.add(new j0(vVar, 3));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                s4.v vVar2 = (s4.v) obj3;
                s4.v vVar3 = n0Var.r;
                if (vVar3 != vVar2) {
                    if (!z9) {
                        vVar3.getClass();
                        s4.p a11 = s4.v.a();
                        String k10 = a11 != null ? a11.k() : null;
                        if (TextUtils.isEmpty(k10)) {
                            k10 = context.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new j0(k10, 2));
                        z9 = true;
                    }
                    arrayList.add(new j0(vVar2, 4));
                }
            }
        }
        F();
    }

    @Override // v4.g0
    public final int b() {
        return this.c.size() + 1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        j0 j0Var;
        if (i7 == 0) {
            j0Var = this.r;
        } else {
            j0Var = (j0) this.c.get(i7 - 1);
        }
        return j0Var.b;
    }

    @Override // v4.g0
    public final void t(d1 d1Var, int i7) {
        org.telegram.ui.Components.n b10;
        s4.o oVar;
        ArrayList arrayList = this.c;
        int i10 = (i7 == 0 ? this.r : (j0) arrayList.get(i7 - 1)).b;
        j0 j0Var = i7 == 0 ? this.r : (j0) arrayList.get(i7 - 1);
        n0 n0Var = this.x;
        int i11 = 0;
        if (i10 == 1) {
            n0Var.L.put(((s4.v) j0Var.a).c, (e0) d1Var);
            h0 h0Var = (h0) d1Var;
            View view = h0Var.a;
            n0 n0Var2 = h0Var.B.x;
            if (n0Var2.i0 && DesugarCollections.unmodifiableList(n0Var2.r.v).size() > 1) {
                i11 = h0Var.A;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i11;
            view.setLayoutParams(layoutParams);
            s4.v vVar = (s4.v) j0Var.a;
            h0Var.t(vVar);
            h0Var.z.setText(vVar.d);
            return;
        }
        if (i10 == 2) {
            ((i0) d1Var).v.setText(j0Var.a.toString());
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            g0 g0Var = (g0) d1Var;
            View view2 = g0Var.v;
            s4.v vVar2 = (s4.v) j0Var.a;
            g0Var.A = vVar2;
            ImageView imageView = g0Var.w;
            imageView.setVisibility(0);
            g0Var.x.setVisibility(4);
            l0 l0Var = g0Var.B;
            List unmodifiableList = DesugarCollections.unmodifiableList(l0Var.x.r.v);
            view2.setAlpha((unmodifiableList.size() == 1 && unmodifiableList.get(0) == vVar2) ? g0Var.z : 1.0f);
            view2.setOnClickListener(new w(g0Var, 2));
            imageView.setImageDrawable(l0Var.E(vVar2));
            g0Var.y.setText(vVar2.d);
            return;
        }
        n0Var.L.put(((s4.v) j0Var.a).c, (e0) d1Var);
        k0 k0Var = (k0) d1Var;
        float f10 = k0Var.F;
        w wVar = k0Var.H;
        ImageView imageView2 = k0Var.A;
        View view3 = k0Var.z;
        CheckBox checkBox = k0Var.E;
        s4.v vVar3 = (s4.v) j0Var.a;
        l0 l0Var2 = k0Var.I;
        n0 n0Var3 = l0Var2.x;
        if (vVar3 == n0Var3.r && DesugarCollections.unmodifiableList(vVar3.v).size() > 0) {
            Iterator it = DesugarCollections.unmodifiableList(vVar3.v).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s4.v vVar4 = (s4.v) it.next();
                if (!n0Var3.w.contains(vVar4)) {
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
        boolean z9 = !n0Var3.y.contains(vVar3) && (!k0Var.v(vVar3) || DesugarCollections.unmodifiableList(n0Var3.r.v).size() >= 2) && (!k0Var.v(vVar3) || ((b10 = n0Var3.r.b(vVar3)) != null && ((oVar = (s4.o) b10.a) == null || oVar.c)));
        checkBox.setChecked(v);
        k0Var.B.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z9);
        checkBox.setEnabled(z9);
        k0Var.w.setEnabled(z9 || v);
        k0Var.x.setEnabled(z9 || v);
        view3.setOnClickListener(wVar);
        checkBox.setOnClickListener(wVar);
        RelativeLayout relativeLayout = k0Var.D;
        if (v && !k0Var.v.e()) {
            i11 = k0Var.G;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i11;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z9 || v) ? 1.0f : f10);
        checkBox.setAlpha((z9 || !v) ? 1.0f : f10);
    }

    @Override // v4.g0
    public final d1 x(ViewGroup viewGroup, int i7) {
        LayoutInflater layoutInflater = this.d;
        if (i7 == 1) {
            return new h0(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i7 == 2) {
            return new i0(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        if (i7 == 3) {
            return new k0(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
        }
        if (i7 == 4) {
            return new g0(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }
        throw new IllegalStateException();
    }
}
