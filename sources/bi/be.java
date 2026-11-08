package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class be extends View implements org.telegram.ui.ActionBar.a6 {
    public PorterDuffColorFilter a;
    public int b;
    public final boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final Paint f;
    public final org.telegram.ui.Components.w5 h;
    public float n;
    public ae r;
    public c20 s;
    public final /* synthetic */ ce w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(ce ceVar, Context context, boolean z9) {
        super(context);
        this.w = ceVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new org.telegram.ui.Components.w5(this, 0L, 320L, xq.h);
        this.c = z9;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, ceVar.i1));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.n = this.h.e(false, arrayList.size());
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ((ae) arrayList2.get(i7)).a(canvas);
            i7++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((ae) arrayList.get(i10)).a(canvas);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((ae) arrayList.get(i7)).k.P();
            i7++;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((ae) arrayList.get(i7)).k.R();
            i7++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ae aeVar;
        c20 c20Var;
        if (motionEvent.getAction() == 0) {
            ae aeVar2 = this.r;
            if (aeVar2 != null) {
                aeVar2.q.c(false);
            }
            this.r = null;
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i7 >= arrayList.size()) {
                    break;
                }
                if (((ae) arrayList.get(i7)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.r = (ae) arrayList.get(i7);
                    break;
                }
                i7++;
            }
            ae aeVar3 = this.r;
            if (aeVar3 != null) {
                aeVar3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (aeVar = this.r) != null && !aeVar.p && aeVar.b.contains(motionEvent.getX(), motionEvent.getY()) && (c20Var = this.s) != null) {
                c20Var.a(Long.valueOf(this.r.j));
            }
            ae aeVar4 = this.r;
            if (aeVar4 != null) {
                aeVar4.q.c(false);
            }
            this.r = null;
        }
        return this.r != null;
    }

    public void setMyPrivacy(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 >= arrayList.size()) {
                return;
            }
            ae aeVar = (ae) arrayList.get(i7);
            if (aeVar.i) {
                aeVar.b(j3);
                return;
            }
            i7++;
        }
    }

    public void setOnSenderClickListener(c20 c20Var) {
        this.s = c20Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [org.telegram.ui.Components.w5] */
    /* JADX WARN: Type inference failed for: r11v4, types: [org.telegram.ui.Components.w5] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.graphics.Typeface] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [bi.ae] */
    /* JADX WARN: Type inference failed for: r9v6, types: [bi.ae, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [bi.ae, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [bi.ae] */
    public void setSenders(ArrayList<vd> arrayList) {
        ArrayList arrayList2;
        wp[] wpVarArr;
        ?? r72;
        ?? r82;
        ?? r92;
        ?? r22;
        String t6;
        ArrayList<vd> arrayList3 = arrayList;
        int i7 = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            wpVarArr = null;
            vd vdVar = null;
            r72 = this.e;
            r82 = 1;
            if (i7 >= size) {
                break;
            }
            ae aeVar = (ae) arrayList2.get(i7);
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                vd vdVar2 = arrayList3.get(i10);
                boolean z9 = vdVar2.b;
                if ((z9 && aeVar.i) || (!aeVar.i && !z9 && vdVar2.c == aeVar.j)) {
                    vdVar = arrayList3.get(i10);
                    break;
                }
            }
            if (vdVar == null) {
                aeVar.k.R();
                arrayList2.remove(i7);
                i7--;
                aeVar.a = -1;
                r72.add(aeVar);
            }
            i7++;
        }
        int i11 = 0;
        while (i11 < arrayList3.size()) {
            vd vdVar3 = arrayList3.get(i11);
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                ae aeVar2 = (ae) arrayList2.get(i12);
                boolean z10 = aeVar2.i;
                if ((z10 && vdVar3.b) || (!z10 && !vdVar3.b && aeVar2.j == vdVar3.c)) {
                    r92 = (ae) arrayList2.get(i12);
                    break;
                }
            }
            r92 = wpVarArr;
            if (r92 == null) {
                for (int i13 = 0; i13 < r72.size(); i13++) {
                    ae aeVar3 = (ae) r72.get(i13);
                    boolean z11 = aeVar3.i;
                    if ((z11 && vdVar3.b) || (!z11 && !vdVar3.b && aeVar3.j == vdVar3.c)) {
                        r92 = (ae) r72.get(i13);
                        break;
                    }
                }
                if (r92 != null) {
                    r72.remove(r92);
                    r92.k.P();
                    arrayList2.add(r92);
                }
            }
            if (r92 == null) {
                r92 = new ae(this, vdVar3.b, vdVar3.c);
                r92.d.e(r82, 0.0f);
                arrayList2.add(r92);
                r92.c.e(r82, (arrayList3.size() - r82) - i11);
            }
            be beVar = r92.w;
            ce ceVar = beVar.w;
            r92.a = (arrayList3.size() - r82) - i11;
            long j3 = vdVar3.d;
            Paint paint = r92.h;
            r92.o = new my0(dd.U0(jg.g.m(j3, ',', new StringBuilder("⭐️")), 0.85f, wpVarArr), 12.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
            boolean z12 = beVar.c;
            int i14 = ceVar.j1;
            if (z12) {
                int i15 = (int) j3;
                r92.f = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(16.0f), new int[]{di.t.b(i14, i15, 4), di.t.b(i14, i15, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r92.r = i0.a.f(0.5f, di.t.b(i14, i15, 4), di.t.b(i14, i15, 3));
                paint.setShader(r92.f);
            } else {
                paint.setShader(null);
                r92.r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = r92.s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(r92.r, PorterDuff.Mode.SRC_IN));
            }
            if (this.c) {
                int i16 = i11 + 1;
                r92.v = i16;
                r92.u = new my0(jg.g.j(i16, ""), 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
                if (i16 > 0 && r92.s == null) {
                    Drawable mutate = beVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r92.s = mutate;
                    int i17 = r92.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i17, mode));
                    Drawable mutate2 = beVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r92.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, ceVar.i1), mode));
                }
            }
            if (vdVar3.b) {
                r92.b(this.w.v1);
            } else {
                boolean z13 = vdVar3.a;
                if (!r92.i && r92.p != z13) {
                    r92.p = z13;
                    if (z13) {
                        r22 = null;
                        t6 = org.telegram.messenger.id.M0(2131745051, null);
                    } else {
                        r22 = null;
                        t6 = org.telegram.messenger.m5.t(r92.j);
                    }
                    r92.n = new my0(t6, 12.0f, r22);
                    beVar.invalidate();
                    i11++;
                    arrayList3 = arrayList;
                    wpVarArr = r22;
                    r82 = 1;
                }
            }
            r22 = null;
            i11++;
            arrayList3 = arrayList;
            wpVarArr = r22;
            r82 = 1;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:3:0x0002, B:5:0x0015, B:9:0x0028, B:11:0x002e, B:13:0x0036, B:15:0x003a, B:17:0x0042, B:19:0x0047, B:24:0x004a, B:28:0x001c), top: B:2:0x0002 }] */
    @Override // org.telegram.ui.ActionBar.a6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateColors() {
        int i7;
        Drawable drawable;
        ArrayList arrayList = this.d;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.w.i1);
            this.f.setColor(w02);
            if (this.a != null) {
                if (w02 != this.b) {
                }
                for (i7 = 0; i7 < arrayList.size(); i7++) {
                    ae aeVar = (ae) arrayList.get(i7);
                    if (aeVar != null && (drawable = aeVar.t) != null) {
                        ColorFilter colorFilter = drawable.getColorFilter();
                        PorterDuffColorFilter porterDuffColorFilter = this.a;
                        if (colorFilter != porterDuffColorFilter) {
                            aeVar.t.setColorFilter(porterDuffColorFilter);
                        }
                    }
                }
                invalidate();
            }
            this.b = w02;
            this.a = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
            while (i7 < arrayList.size()) {
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
