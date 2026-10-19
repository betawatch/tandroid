package ai;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class ke extends View {
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final Paint d;
    public final org.telegram.ui.Components.f6 e;
    public float f;
    public je h;
    public Utilities.Callback n;
    public final /* synthetic */ le r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke(le leVar, Context context, boolean z10) {
        super(context);
        this.r = leVar;
        this.b = new ArrayList();
        this.c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.f6(this, 0L, 320L, bs.h);
        this.a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, leVar.b));
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
            ((je) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((je) arrayList.get(i11)).a(canvas);
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
            ((je) arrayList.get(i10)).k.onAttachedToWindow();
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
            ((je) arrayList.get(i10)).k.onDetachedFromWindow();
            i10++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        je jeVar;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            je jeVar2 = this.h;
            if (jeVar2 != null) {
                jeVar2.q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((je) arrayList.get(i10)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (je) arrayList.get(i10);
                    break;
                }
                i10++;
            }
            je jeVar3 = this.h;
            if (jeVar3 != null) {
                jeVar3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (jeVar = this.h) != null && !jeVar.p && jeVar.b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.n) != null) {
                callback.run(Long.valueOf(this.h.j));
            }
            je jeVar4 = this.h;
            if (jeVar4 != null) {
                jeVar4.q.c(false);
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
            je jeVar = (je) arrayList.get(i10);
            if (jeVar.i) {
                jeVar.b(j10);
                return;
            }
            i10++;
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.n = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [org.telegram.ui.Components.f6] */
    /* JADX WARN: Type inference failed for: r11v4, types: [org.telegram.ui.Components.f6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [ai.je] */
    /* JADX WARN: Type inference failed for: r9v6, types: [ai.je, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [ai.je, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [ai.je] */
    public void setSenders(ArrayList<ee> arrayList) {
        ArrayList arrayList2;
        yq[] yqVarArr;
        ?? r72;
        ?? r82;
        ?? r92;
        ArrayList<ee> arrayList3 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.b;
            int size = arrayList2.size();
            yqVarArr = null;
            ee eeVar = null;
            r72 = this.c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            je jeVar = (je) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                ee eeVar2 = arrayList3.get(i11);
                boolean z10 = eeVar2.b;
                if ((z10 && jeVar.i) || (!jeVar.i && !z10 && eeVar2.c == jeVar.j)) {
                    eeVar = arrayList3.get(i11);
                    break;
                }
            }
            if (eeVar == null) {
                jeVar.k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                jeVar.a = -1;
                r72.add(jeVar);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            ee eeVar3 = arrayList3.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                je jeVar2 = (je) arrayList2.get(i13);
                boolean z11 = jeVar2.i;
                if ((z11 && eeVar3.b) || (!z11 && !eeVar3.b && jeVar2.j == eeVar3.c)) {
                    r92 = (je) arrayList2.get(i13);
                    break;
                }
            }
            r92 = yqVarArr;
            if (r92 == null) {
                for (int i14 = 0; i14 < r72.size(); i14++) {
                    je jeVar3 = (je) r72.get(i14);
                    boolean z12 = jeVar3.i;
                    if ((z12 && eeVar3.b) || (!z12 && !eeVar3.b && jeVar3.j == eeVar3.c)) {
                        r92 = (je) r72.get(i14);
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
                r92 = new je(this, eeVar3.b, eeVar3.c);
                r92.d.d(0.0f, r82);
                arrayList2.add(r92);
                r92.c.d((arrayList3.size() - r82) - i12, r82);
            }
            ke keVar = r92.w;
            le leVar = keVar.r;
            r92.a = (arrayList3.size() - r82) - i12;
            long j10 = eeVar3.d;
            Paint paint = r92.h;
            r92.o = new e11(md.S0(org.telegram.messenger.g0.h(j10, ',', new StringBuilder("⭐️")), 0.85f, yqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = keVar.a;
            int i15 = leVar.c;
            if (z13) {
                int i16 = (int) j10;
                r92.f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{ci.u.b(i15, i16, 4), ci.u.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r92.r = i0.a.f(0.5f, ci.u.b(i15, i16, 4), ci.u.b(i15, i16, 3));
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
                r92.u = new e11(i2.e.j(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && r92.s == null) {
                    Drawable mutate = keVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r92.s = mutate;
                    int i18 = r92.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = keVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r92.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, leVar.b), mode));
                }
            }
            if (eeVar3.b) {
                r92.b(this.r.E);
            } else {
                boolean z14 = eeVar3.a;
                if (!r92.i && r92.p != z14) {
                    r92.p = z14;
                    yqVarArr = null;
                    r92.n = new e11(z14 ? LocaleController.getString(R.string.StarsReactionAnonymous) : DialogObject.getShortName(r92.j), 12.0f, null);
                    keVar.invalidate();
                    i12++;
                    arrayList3 = arrayList;
                    r82 = 1;
                }
            }
            yqVarArr = null;
            i12++;
            arrayList3 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
