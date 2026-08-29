package jh;

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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class cb extends View {
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final Paint d;
    public final org.telegram.ui.Components.d6 e;
    public float f;
    public bb h;
    public Utilities.Callback n;
    public final /* synthetic */ db r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(db dbVar, Context context, boolean z10) {
        super(context);
        this.r = dbVar;
        this.b = new ArrayList();
        this.c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.d6(this, 0L, 320L, jr.h);
        this.a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, dbVar.b));
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
            ((bb) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((bb) arrayList.get(i11)).a(canvas);
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
            ((bb) arrayList.get(i10)).k.onAttachedToWindow();
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
            ((bb) arrayList.get(i10)).k.onDetachedFromWindow();
            i10++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bb bbVar;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            bb bbVar2 = this.h;
            if (bbVar2 != null) {
                bbVar2.q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((bb) arrayList.get(i10)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (bb) arrayList.get(i10);
                    break;
                }
                i10++;
            }
            bb bbVar3 = this.h;
            if (bbVar3 != null) {
                bbVar3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (bbVar = this.h) != null && !bbVar.p && bbVar.b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.n) != null) {
                callback.run(Long.valueOf(this.h.j));
            }
            bb bbVar4 = this.h;
            if (bbVar4 != null) {
                bbVar4.q.c(false);
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
            bb bbVar = (bb) arrayList.get(i10);
            if (bbVar.i) {
                bbVar.b(j10);
                return;
            }
            i10++;
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.n = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [org.telegram.ui.Components.d6] */
    /* JADX WARN: Type inference failed for: r11v4, types: [org.telegram.ui.Components.d6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [jh.bb] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, jh.bb] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, jh.bb] */
    /* JADX WARN: Type inference failed for: r9v9, types: [jh.bb] */
    public void setSenders(ArrayList<wa> arrayList) {
        ArrayList arrayList2;
        iq[] iqVarArr;
        ?? r72;
        ?? r82;
        ?? r9;
        ArrayList<wa> arrayList3 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.b;
            int size = arrayList2.size();
            iqVarArr = null;
            wa waVar = null;
            r72 = this.c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            bb bbVar = (bb) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                wa waVar2 = arrayList3.get(i11);
                boolean z10 = waVar2.b;
                if ((z10 && bbVar.i) || (!bbVar.i && !z10 && waVar2.c == bbVar.j)) {
                    waVar = arrayList3.get(i11);
                    break;
                }
            }
            if (waVar == null) {
                bbVar.k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                bbVar.a = -1;
                r72.add(bbVar);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            wa waVar3 = arrayList3.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                bb bbVar2 = (bb) arrayList2.get(i13);
                boolean z11 = bbVar2.i;
                if ((z11 && waVar3.b) || (!z11 && !waVar3.b && bbVar2.j == waVar3.c)) {
                    r9 = (bb) arrayList2.get(i13);
                    break;
                }
            }
            r9 = iqVarArr;
            if (r9 == null) {
                for (int i14 = 0; i14 < r72.size(); i14++) {
                    bb bbVar3 = (bb) r72.get(i14);
                    boolean z12 = bbVar3.i;
                    if ((z12 && waVar3.b) || (!z12 && !waVar3.b && bbVar3.j == waVar3.c)) {
                        r9 = (bb) r72.get(i14);
                        break;
                    }
                }
                if (r9 != null) {
                    r72.remove(r9);
                    r9.k.onAttachedToWindow();
                    arrayList2.add(r9);
                }
            }
            if (r9 == null) {
                r9 = new bb(this, waVar3.b, waVar3.c);
                r9.d.d(0.0f, r82);
                arrayList2.add(r9);
                r9.c.d((arrayList3.size() - r82) - i12, r82);
            }
            cb cbVar = r9.w;
            db dbVar = cbVar.r;
            r9.a = (arrayList3.size() - r82) - i12;
            long j10 = waVar3.d;
            Paint paint = r9.h;
            r9.o = new zz0(ia.R0(j7.l1.m(j10, ',', new StringBuilder("⭐️")), 0.85f, iqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = cbVar.a;
            int i15 = dbVar.c;
            if (z13) {
                int i16 = (int) j10;
                r9.f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{lh.s.b(i15, i16, 4), lh.s.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r9.r = i0.a.d(0.5f, lh.s.b(i15, i16, 4), lh.s.b(i15, i16, 3));
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
            if (this.a) {
                int i17 = i12 + 1;
                r9.v = i17;
                r9.u = new zz0(j7.l1.k(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && r9.s == null) {
                    Drawable mutate = cbVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r9.s = mutate;
                    int i18 = r9.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = cbVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r9.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, dbVar.b), mode));
                }
            }
            if (waVar3.b) {
                r9.b(this.r.A);
            } else {
                boolean z14 = waVar3.a;
                if (!r9.i && r9.p != z14) {
                    r9.p = z14;
                    iqVarArr = null;
                    r9.n = new zz0(z14 ? LocaleController.getString(R.string.StarsReactionAnonymous) : DialogObject.getShortName(r9.j), 12.0f, null);
                    cbVar.invalidate();
                    i12++;
                    arrayList3 = arrayList;
                    r82 = 1;
                }
            }
            iqVarArr = null;
            i12++;
            arrayList3 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
