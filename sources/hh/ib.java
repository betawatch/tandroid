package hh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pz0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class ib extends View {
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final Paint d;
    public final org.telegram.ui.Components.y5 e;
    public float f;
    public hb h;
    public Utilities.Callback n;
    public final /* synthetic */ jb r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(jb jbVar, Context context, boolean z10) {
        super(context);
        this.r = jbVar;
        this.b = new ArrayList();
        this.c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.y5(this, 0L, 320L, er.h);
        this.a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, jbVar.b));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.b;
        this.f = this.e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((hb) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((hb) arrayList.get(i11)).a(canvas);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((hb) arrayList.get(i10)).k.onAttachedToWindow();
            i10++;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((hb) arrayList.get(i10)).k.onDetachedFromWindow();
            i10++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hb hbVar;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            hb hbVar2 = this.h;
            if (hbVar2 != null) {
                hbVar2.q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((hb) arrayList.get(i10)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (hb) arrayList.get(i10);
                    break;
                }
                i10++;
            }
            hb hbVar3 = this.h;
            if (hbVar3 != null) {
                hbVar3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (hbVar = this.h) != null && !hbVar.p && hbVar.b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.n) != null) {
                callback.run(Long.valueOf(this.h.j));
            }
            hb hbVar4 = this.h;
            if (hbVar4 != null) {
                hbVar4.q.c(false);
            }
            this.h = null;
        }
        return this.h != null;
    }

    public void setMyPrivacy(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return;
            }
            hb hbVar = (hb) arrayList.get(i10);
            if (hbVar.i) {
                hbVar.b(j10);
                return;
            }
            i10++;
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.n = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [org.telegram.ui.Components.y5] */
    /* JADX WARN: Type inference failed for: r11v4, types: [org.telegram.ui.Components.y5] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [hh.hb] */
    /* JADX WARN: Type inference failed for: r9v6, types: [hh.hb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [hh.hb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [hh.hb] */
    public void setSenders(ArrayList<cb> arrayList) {
        ArrayList arrayList2;
        cq[] cqVarArr;
        ?? r72;
        ?? r82;
        ?? r92;
        ArrayList<cb> arrayList3 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.b;
            int size = arrayList2.size();
            cqVarArr = null;
            cb cbVar = null;
            r72 = this.c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            hb hbVar = (hb) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                cb cbVar2 = arrayList3.get(i11);
                boolean z10 = cbVar2.b;
                if ((z10 && hbVar.i) || (!hbVar.i && !z10 && cbVar2.c == hbVar.j)) {
                    cbVar = arrayList3.get(i11);
                    break;
                }
            }
            if (cbVar == null) {
                hbVar.k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                hbVar.a = -1;
                r72.add(hbVar);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            cb cbVar3 = arrayList3.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                hb hbVar2 = (hb) arrayList2.get(i13);
                boolean z11 = hbVar2.i;
                if ((z11 && cbVar3.b) || (!z11 && !cbVar3.b && hbVar2.j == cbVar3.c)) {
                    r92 = (hb) arrayList2.get(i13);
                    break;
                }
            }
            r92 = cqVarArr;
            if (r92 == null) {
                for (int i14 = 0; i14 < r72.size(); i14++) {
                    hb hbVar3 = (hb) r72.get(i14);
                    boolean z12 = hbVar3.i;
                    if ((z12 && cbVar3.b) || (!z12 && !cbVar3.b && hbVar3.j == cbVar3.c)) {
                        r92 = (hb) r72.get(i14);
                        break;
                    }
                }
                if (r92 != null) {
                    r72.remove(r92);
                    r92.k.onAttachedToWindow();
                    arrayList2.add(r92);
                }
            }
            if (r92 == null) {
                r92 = new hb(this, cbVar3.b, cbVar3.c);
                r92.d.d(0.0f, r82);
                arrayList2.add(r92);
                r92.c.d((arrayList3.size() - r82) - i12, r82);
            }
            ib ibVar = r92.w;
            jb jbVar = ibVar.r;
            r92.a = (arrayList3.size() - r82) - i12;
            long j10 = cbVar3.d;
            Paint paint = r92.h;
            r92.o = new pz0(oa.R0(i0.a.m(j10, ',', new StringBuilder("⭐️")), 0.85f, cqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = ibVar.a;
            int i15 = jbVar.c;
            if (z13) {
                int i16 = (int) j10;
                r92.f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{jh.s.b(i15, i16, 4), jh.s.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r92.r = i0.b.d(0.5f, jh.s.b(i15, i16, 4), jh.s.b(i15, i16, 3));
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
            if (this.a) {
                int i17 = i12 + 1;
                r92.v = i17;
                r92.u = new pz0(i0.a.k(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && r92.s == null) {
                    Drawable mutate = ibVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r92.s = mutate;
                    int i18 = r92.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = ibVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r92.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, jbVar.b), mode));
                }
            }
            if (cbVar3.b) {
                r92.b(this.r.A);
            } else {
                boolean z14 = cbVar3.a;
                if (!r92.i && r92.p != z14) {
                    r92.p = z14;
                    cqVarArr = null;
                    r92.n = new pz0(z14 ? LocaleController.getString(R.string.StarsReactionAnonymous) : DialogObject.getShortName(r92.j), 12.0f, null);
                    ibVar.invalidate();
                    i12++;
                    arrayList3 = arrayList;
                    r82 = 1;
                }
            }
            cqVarArr = null;
            i12++;
            arrayList3 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
