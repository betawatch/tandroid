package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sc extends View implements org.telegram.ui.ActionBar.z5 {
    public PorterDuffColorFilter a;
    public int b;
    public final boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final Paint f;
    public final org.telegram.ui.Components.u5 h;
    public float n;
    public rc r;
    public u10 s;
    public final /* synthetic */ tc w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(tc tcVar, Context context, boolean z10) {
        super(context);
        this.w = tcVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new org.telegram.ui.Components.u5(this, 0L, 320L, xq.h);
        this.c = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, tcVar.j1));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.n = this.h.e(false, arrayList.size());
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i3 >= arrayList2.size()) {
                break;
            }
            ((rc) arrayList2.get(i3)).a(canvas);
            i3++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((rc) arrayList.get(i10)).a(canvas);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((rc) arrayList.get(i3)).k.P();
            i3++;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((rc) arrayList.get(i3)).k.R();
            i3++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rc rcVar;
        u10 u10Var;
        if (motionEvent.getAction() == 0) {
            rc rcVar2 = this.r;
            if (rcVar2 != null) {
                rcVar2.q.c(false);
            }
            this.r = null;
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i3 >= arrayList.size()) {
                    break;
                }
                if (((rc) arrayList.get(i3)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.r = (rc) arrayList.get(i3);
                    break;
                }
                i3++;
            }
            rc rcVar3 = this.r;
            if (rcVar3 != null) {
                rcVar3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (rcVar = this.r) != null && !rcVar.p && rcVar.b.contains(motionEvent.getX(), motionEvent.getY()) && (u10Var = this.s) != null) {
                u10Var.a(Long.valueOf(this.r.j));
            }
            rc rcVar4 = this.r;
            if (rcVar4 != null) {
                rcVar4.q.c(false);
            }
            this.r = null;
        }
        return this.r != null;
    }

    public void setMyPrivacy(long j10) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 >= arrayList.size()) {
                return;
            }
            rc rcVar = (rc) arrayList.get(i3);
            if (rcVar.i) {
                rcVar.b(j10);
                return;
            }
            i3++;
        }
    }

    public void setOnSenderClickListener(u10 u10Var) {
        this.s = u10Var;
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
    /* JADX WARN: Type inference failed for: r9v5, types: [ci.rc] */
    /* JADX WARN: Type inference failed for: r9v6, types: [ci.rc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [ci.rc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [ci.rc] */
    public void setSenders(ArrayList<mc> arrayList) {
        ArrayList arrayList2;
        wp[] wpVarArr;
        ?? r72;
        ?? r82;
        ?? r9;
        ?? r22;
        String t10;
        ArrayList<mc> arrayList3 = arrayList;
        int i3 = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            wpVarArr = null;
            mc mcVar = null;
            r72 = this.e;
            r82 = 1;
            if (i3 >= size) {
                break;
            }
            rc rcVar = (rc) arrayList2.get(i3);
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                mc mcVar2 = arrayList3.get(i10);
                boolean z10 = mcVar2.b;
                if ((z10 && rcVar.i) || (!rcVar.i && !z10 && mcVar2.c == rcVar.j)) {
                    mcVar = arrayList3.get(i10);
                    break;
                }
            }
            if (mcVar == null) {
                rcVar.k.R();
                arrayList2.remove(i3);
                i3--;
                rcVar.a = -1;
                r72.add(rcVar);
            }
            i3++;
        }
        int i11 = 0;
        while (i11 < arrayList3.size()) {
            mc mcVar3 = arrayList3.get(i11);
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                rc rcVar2 = (rc) arrayList2.get(i12);
                boolean z11 = rcVar2.i;
                if ((z11 && mcVar3.b) || (!z11 && !mcVar3.b && rcVar2.j == mcVar3.c)) {
                    r9 = (rc) arrayList2.get(i12);
                    break;
                }
            }
            r9 = wpVarArr;
            if (r9 == null) {
                for (int i13 = 0; i13 < r72.size(); i13++) {
                    rc rcVar3 = (rc) r72.get(i13);
                    boolean z12 = rcVar3.i;
                    if ((z12 && mcVar3.b) || (!z12 && !mcVar3.b && rcVar3.j == mcVar3.c)) {
                        r9 = (rc) r72.get(i13);
                        break;
                    }
                }
                if (r9 != null) {
                    r72.remove(r9);
                    r9.k.P();
                    arrayList2.add(r9);
                }
            }
            if (r9 == null) {
                r9 = new rc(this, mcVar3.b, mcVar3.c);
                r9.d.e(r82, 0.0f);
                arrayList2.add(r9);
                r9.c.e(r82, (arrayList3.size() - r82) - i11);
            }
            sc scVar = r9.w;
            tc tcVar = scVar.w;
            r9.a = (arrayList3.size() - r82) - i11;
            long j10 = mcVar3.d;
            Paint paint = r9.h;
            r9.o = new ly0(wb.U0(k2.p1.l(j10, ',', new StringBuilder("⭐️")), 0.85f, wpVarArr), 12.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
            boolean z13 = scVar.c;
            int i14 = tcVar.k1;
            if (z13) {
                int i15 = (int) j10;
                r9.f = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(16.0f), new int[]{ei.u.b(i14, i15, 4), ei.u.b(i14, i15, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r9.r = i0.a.f(0.5f, ei.u.b(i14, i15, 4), ei.u.b(i14, i15, 3));
                paint.setShader(r9.f);
            } else {
                paint.setShader(null);
                r9.r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = r9.s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(r9.r, PorterDuff.Mode.SRC_IN));
            }
            if (this.c) {
                int i16 = i11 + 1;
                r9.v = i16;
                r9.u = new ly0(k2.p1.i(i16, ""), 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
                if (i16 > 0 && r9.s == null) {
                    Drawable mutate = scVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r9.s = mutate;
                    int i17 = r9.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i17, mode));
                    Drawable mutate2 = scVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r9.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, tcVar.j1), mode));
                }
            }
            if (mcVar3.b) {
                r9.b(this.w.w1);
            } else {
                boolean z14 = mcVar3.a;
                if (!r9.i && r9.p != z14) {
                    r9.p = z14;
                    if (z14) {
                        r22 = null;
                        t10 = bd.M0(2131745058, null);
                    } else {
                        r22 = null;
                        t10 = org.telegram.messenger.m5.t(r9.j);
                    }
                    r9.n = new ly0(t10, 12.0f, r22);
                    scVar.invalidate();
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
    @Override // org.telegram.ui.ActionBar.z5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateColors() {
        int i3;
        Drawable drawable;
        ArrayList arrayList = this.d;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.w.j1);
            this.f.setColor(w02);
            if (this.a != null) {
                if (w02 != this.b) {
                }
                for (i3 = 0; i3 < arrayList.size(); i3++) {
                    rc rcVar = (rc) arrayList.get(i3);
                    if (rcVar != null && (drawable = rcVar.t) != null) {
                        ColorFilter colorFilter = drawable.getColorFilter();
                        PorterDuffColorFilter porterDuffColorFilter = this.a;
                        if (colorFilter != porterDuffColorFilter) {
                            rcVar.t.setColorFilter(porterDuffColorFilter);
                        }
                    }
                }
                invalidate();
            }
            this.b = w02;
            this.a = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
            while (i3 < arrayList.size()) {
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
