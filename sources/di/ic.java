package di;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ic extends View implements org.telegram.ui.ActionBar.z5 {
    public PorterDuffColorFilter a;
    public int b;
    public final boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final Paint f;
    public final org.telegram.ui.Components.u5 h;
    public float n;
    public hc r;
    public z10 s;
    public final /* synthetic */ jc w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(jc jcVar, Context context, boolean z10) {
        super(context);
        this.w = jcVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new org.telegram.ui.Components.u5(this, 0L, 320L, er.h);
        this.c = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, jcVar.m1));
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
            ((hc) arrayList2.get(i7)).a(canvas);
            i7++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((hc) arrayList.get(i10)).a(canvas);
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
            ((hc) arrayList.get(i7)).k.P();
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
            ((hc) arrayList.get(i7)).k.R();
            i7++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hc hcVar;
        z10 z10Var;
        if (motionEvent.getAction() == 0) {
            hc hcVar2 = this.r;
            if (hcVar2 != null) {
                hcVar2.q.c(false);
            }
            this.r = null;
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i7 >= arrayList.size()) {
                    break;
                }
                if (((hc) arrayList.get(i7)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.r = (hc) arrayList.get(i7);
                    break;
                }
                i7++;
            }
            hc hcVar3 = this.r;
            if (hcVar3 != null) {
                hcVar3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (hcVar = this.r) != null && !hcVar.p && hcVar.b.contains(motionEvent.getX(), motionEvent.getY()) && (z10Var = this.s) != null) {
                z10Var.a(Long.valueOf(this.r.j));
            }
            hc hcVar4 = this.r;
            if (hcVar4 != null) {
                hcVar4.q.c(false);
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
            hc hcVar = (hc) arrayList.get(i7);
            if (hcVar.i) {
                hcVar.b(j3);
                return;
            }
            i7++;
        }
    }

    public void setOnSenderClickListener(z10 z10Var) {
        this.s = z10Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [org.telegram.ui.Components.u5] */
    /* JADX WARN: Type inference failed for: r11v4, types: [org.telegram.ui.Components.u5] */
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
    /* JADX WARN: Type inference failed for: r9v5, types: [di.hc] */
    /* JADX WARN: Type inference failed for: r9v6, types: [di.hc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [di.hc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [di.hc] */
    public void setSenders(ArrayList<cc> arrayList) {
        ArrayList arrayList2;
        eq[] eqVarArr;
        ?? r72;
        ?? r82;
        ?? r92;
        ?? r22;
        String t6;
        ArrayList<cc> arrayList3 = arrayList;
        int i7 = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            eqVarArr = null;
            cc ccVar = null;
            r72 = this.e;
            r82 = 1;
            if (i7 >= size) {
                break;
            }
            hc hcVar = (hc) arrayList2.get(i7);
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                cc ccVar2 = arrayList3.get(i10);
                boolean z10 = ccVar2.b;
                if ((z10 && hcVar.i) || (!hcVar.i && !z10 && ccVar2.c == hcVar.j)) {
                    ccVar = arrayList3.get(i10);
                    break;
                }
            }
            if (ccVar == null) {
                hcVar.k.R();
                arrayList2.remove(i7);
                i7--;
                hcVar.a = -1;
                r72.add(hcVar);
            }
            i7++;
        }
        int i11 = 0;
        while (i11 < arrayList3.size()) {
            cc ccVar3 = arrayList3.get(i11);
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                hc hcVar2 = (hc) arrayList2.get(i12);
                boolean z11 = hcVar2.i;
                if ((z11 && ccVar3.b) || (!z11 && !ccVar3.b && hcVar2.j == ccVar3.c)) {
                    r92 = (hc) arrayList2.get(i12);
                    break;
                }
            }
            r92 = eqVarArr;
            if (r92 == null) {
                for (int i13 = 0; i13 < r72.size(); i13++) {
                    hc hcVar3 = (hc) r72.get(i13);
                    boolean z12 = hcVar3.i;
                    if ((z12 && ccVar3.b) || (!z12 && !ccVar3.b && hcVar3.j == ccVar3.c)) {
                        r92 = (hc) r72.get(i13);
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
                r92 = new hc(this, ccVar3.b, ccVar3.c);
                r92.d.e(r82, 0.0f);
                arrayList2.add(r92);
                r92.c.e(r82, (arrayList3.size() - r82) - i11);
            }
            ic icVar = r92.w;
            jc jcVar = icVar.w;
            r92.a = (arrayList3.size() - r82) - i11;
            long j3 = ccVar3.d;
            Paint paint = r92.h;
            r92.o = new oy0(mb.U0(i5.c.l(j3, ',', new StringBuilder("⭐️")), 0.85f, eqVarArr), 12.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
            boolean z13 = icVar.c;
            int i14 = jcVar.n1;
            if (z13) {
                int i15 = (int) j3;
                r92.f = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(16.0f), new int[]{fi.t.b(i14, i15, 4), fi.t.b(i14, i15, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r92.r = i0.a.f(0.5f, fi.t.b(i14, i15, 4), fi.t.b(i14, i15, 3));
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
                r92.u = new oy0(i5.c.i(i16, ""), 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
                if (i16 > 0 && r92.s == null) {
                    Drawable mutate = icVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r92.s = mutate;
                    int i17 = r92.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i17, mode));
                    Drawable mutate2 = icVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r92.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, jcVar.m1), mode));
                }
            }
            if (ccVar3.b) {
                r92.b(this.w.z1);
            } else {
                boolean z14 = ccVar3.a;
                if (!r92.i && r92.p != z14) {
                    r92.p = z14;
                    if (z14) {
                        r22 = null;
                        t6 = hd.M0(2131745048, null);
                    } else {
                        r22 = null;
                        t6 = org.telegram.messenger.m5.t(r92.j);
                    }
                    r92.n = new oy0(t6, 12.0f, r22);
                    icVar.invalidate();
                    i11++;
                    arrayList3 = arrayList;
                    eqVarArr = r22;
                    r82 = 1;
                }
            }
            r22 = null;
            i11++;
            arrayList3 = arrayList;
            eqVarArr = r22;
            r82 = 1;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:3:0x0002, B:5:0x0015, B:9:0x0028, B:11:0x002e, B:13:0x0036, B:15:0x003a, B:17:0x0042, B:19:0x0047, B:24:0x004a, B:28:0x001c), top: B:2:0x0002 }] */
    @Override // org.telegram.ui.ActionBar.z5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateColors() {
        int i7;
        Drawable drawable;
        ArrayList arrayList = this.d;
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.w.m1);
            this.f.setColor(w02);
            if (this.a != null) {
                if (w02 != this.b) {
                }
                for (i7 = 0; i7 < arrayList.size(); i7++) {
                    hc hcVar = (hc) arrayList.get(i7);
                    if (hcVar != null && (drawable = hcVar.t) != null) {
                        ColorFilter colorFilter = drawable.getColorFilter();
                        PorterDuffColorFilter porterDuffColorFilter = this.a;
                        if (colorFilter != porterDuffColorFilter) {
                            hcVar.t.setColorFilter(porterDuffColorFilter);
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

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
