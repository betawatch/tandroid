package mh;

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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class db extends View {
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final Paint d;
    public final org.telegram.ui.Components.z5 e;
    public float f;
    public cb h;
    public Utilities.Callback n;
    public final /* synthetic */ eb r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(eb ebVar, Context context, boolean z4) {
        super(context);
        this.r = ebVar;
        this.b = new ArrayList();
        this.c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.z5(this, 0L, 320L, pr.h);
        this.a = z4;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, ebVar.b));
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
            ((cb) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((cb) arrayList.get(i11)).a(canvas);
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
            ((cb) arrayList.get(i10)).k.onAttachedToWindow();
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
            ((cb) arrayList.get(i10)).k.onDetachedFromWindow();
            i10++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cb cbVar;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            cb cbVar2 = this.h;
            if (cbVar2 != null) {
                cbVar2.q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((cb) arrayList.get(i10)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (cb) arrayList.get(i10);
                    break;
                }
                i10++;
            }
            cb cbVar3 = this.h;
            if (cbVar3 != null) {
                cbVar3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (cbVar = this.h) != null && !cbVar.p && cbVar.b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.n) != null) {
                callback.run(Long.valueOf(this.h.j));
            }
            cb cbVar4 = this.h;
            if (cbVar4 != null) {
                cbVar4.q.c(false);
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
            cb cbVar = (cb) arrayList.get(i10);
            if (cbVar.i) {
                cbVar.b(j10);
                return;
            }
            i10++;
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.n = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [org.telegram.ui.Components.z5] */
    /* JADX WARN: Type inference failed for: r11v4, types: [org.telegram.ui.Components.z5] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [mh.cb] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, mh.cb] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, mh.cb] */
    /* JADX WARN: Type inference failed for: r9v9, types: [mh.cb] */
    public void setSenders(ArrayList<xa> arrayList) {
        ArrayList arrayList2;
        oq[] oqVarArr;
        ?? r72;
        ?? r82;
        ?? r92;
        ArrayList<xa> arrayList3 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.b;
            int size = arrayList2.size();
            oqVarArr = null;
            xa xaVar = null;
            r72 = this.c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            cb cbVar = (cb) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                xa xaVar2 = arrayList3.get(i11);
                boolean z4 = xaVar2.b;
                if ((z4 && cbVar.i) || (!cbVar.i && !z4 && xaVar2.c == cbVar.j)) {
                    xaVar = arrayList3.get(i11);
                    break;
                }
            }
            if (xaVar == null) {
                cbVar.k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                cbVar.a = -1;
                r72.add(cbVar);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            xa xaVar3 = arrayList3.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                cb cbVar2 = (cb) arrayList2.get(i13);
                boolean z10 = cbVar2.i;
                if ((z10 && xaVar3.b) || (!z10 && !xaVar3.b && cbVar2.j == xaVar3.c)) {
                    r92 = (cb) arrayList2.get(i13);
                    break;
                }
            }
            r92 = oqVarArr;
            if (r92 == null) {
                for (int i14 = 0; i14 < r72.size(); i14++) {
                    cb cbVar3 = (cb) r72.get(i14);
                    boolean z11 = cbVar3.i;
                    if ((z11 && xaVar3.b) || (!z11 && !xaVar3.b && cbVar3.j == xaVar3.c)) {
                        r92 = (cb) r72.get(i14);
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
                r92 = new cb(this, xaVar3.b, xaVar3.c);
                r92.d.d(0.0f, r82);
                arrayList2.add(r92);
                r92.c.d((arrayList3.size() - r82) - i12, r82);
            }
            db dbVar = r92.w;
            eb ebVar = dbVar.r;
            r92.a = (arrayList3.size() - r82) - i12;
            long j10 = xaVar3.d;
            Paint paint = r92.h;
            r92.o = new k01(ja.R0(l.d.l(j10, ',', new StringBuilder("⭐️")), 0.85f, oqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z12 = dbVar.a;
            int i15 = ebVar.c;
            if (z12) {
                int i16 = (int) j10;
                r92.f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{oh.s.b(i15, i16, 4), oh.s.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r92.r = i0.a.d(0.5f, oh.s.b(i15, i16, 4), oh.s.b(i15, i16, 3));
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
                r92.u = new k01(l.d.j(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && r92.s == null) {
                    Drawable mutate = dbVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r92.s = mutate;
                    int i18 = r92.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = dbVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r92.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, ebVar.b), mode));
                }
            }
            if (xaVar3.b) {
                r92.b(this.r.B);
            } else {
                boolean z13 = xaVar3.a;
                if (!r92.i && r92.p != z13) {
                    r92.p = z13;
                    oqVarArr = null;
                    r92.n = new k01(z13 ? LocaleController.getString(R.string.StarsReactionAnonymous) : DialogObject.getShortName(r92.j), 12.0f, null);
                    dbVar.invalidate();
                    i12++;
                    arrayList3 = arrayList;
                    r82 = 1;
                }
            }
            oqVarArr = null;
            i12++;
            arrayList3 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
