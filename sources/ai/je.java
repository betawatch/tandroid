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
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class je extends View {
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final Paint d;
    public final org.telegram.ui.Components.f6 e;
    public float f;
    public ie h;
    public Utilities.Callback n;
    public final /* synthetic */ ke r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(ke keVar, Context context, boolean z10) {
        super(context);
        this.r = keVar;
        this.b = new ArrayList();
        this.c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.f6(this, 0L, 320L, bs.h);
        this.a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, keVar.b));
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
            ((ie) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ie) arrayList.get(i11)).a(canvas);
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
            ((ie) arrayList.get(i10)).k.onAttachedToWindow();
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
            ((ie) arrayList.get(i10)).k.onDetachedFromWindow();
            i10++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ie ieVar;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            ie ieVar2 = this.h;
            if (ieVar2 != null) {
                ieVar2.q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((ie) arrayList.get(i10)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (ie) arrayList.get(i10);
                    break;
                }
                i10++;
            }
            ie ieVar3 = this.h;
            if (ieVar3 != null) {
                ieVar3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (ieVar = this.h) != null && !ieVar.p && ieVar.b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.n) != null) {
                callback.run(Long.valueOf(this.h.j));
            }
            ie ieVar4 = this.h;
            if (ieVar4 != null) {
                ieVar4.q.c(false);
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
            ie ieVar = (ie) arrayList.get(i10);
            if (ieVar.i) {
                ieVar.b(j10);
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
    /* JADX WARN: Type inference failed for: r9v5, types: [ai.ie] */
    /* JADX WARN: Type inference failed for: r9v6, types: [ai.ie, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [ai.ie, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [ai.ie] */
    public void setSenders(ArrayList<de> arrayList) {
        ArrayList arrayList2;
        yq[] yqVarArr;
        ?? r72;
        ?? r82;
        ?? r92;
        ArrayList<de> arrayList3 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.b;
            int size = arrayList2.size();
            yqVarArr = null;
            de deVar = null;
            r72 = this.c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            ie ieVar = (ie) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                de deVar2 = arrayList3.get(i11);
                boolean z10 = deVar2.b;
                if ((z10 && ieVar.i) || (!ieVar.i && !z10 && deVar2.c == ieVar.j)) {
                    deVar = arrayList3.get(i11);
                    break;
                }
            }
            if (deVar == null) {
                ieVar.k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                ieVar.a = -1;
                r72.add(ieVar);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            de deVar3 = arrayList3.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                ie ieVar2 = (ie) arrayList2.get(i13);
                boolean z11 = ieVar2.i;
                if ((z11 && deVar3.b) || (!z11 && !deVar3.b && ieVar2.j == deVar3.c)) {
                    r92 = (ie) arrayList2.get(i13);
                    break;
                }
            }
            r92 = yqVarArr;
            if (r92 == null) {
                for (int i14 = 0; i14 < r72.size(); i14++) {
                    ie ieVar3 = (ie) r72.get(i14);
                    boolean z12 = ieVar3.i;
                    if ((z12 && deVar3.b) || (!z12 && !deVar3.b && ieVar3.j == deVar3.c)) {
                        r92 = (ie) r72.get(i14);
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
                r92 = new ie(this, deVar3.b, deVar3.c);
                r92.d.d(0.0f, r82);
                arrayList2.add(r92);
                r92.c.d((arrayList3.size() - r82) - i12, r82);
            }
            je jeVar = r92.w;
            ke keVar = jeVar.r;
            r92.a = (arrayList3.size() - r82) - i12;
            long j10 = deVar3.d;
            Paint paint = r92.h;
            r92.o = new d11(ld.S0(org.telegram.messenger.q.h(j10, ',', new StringBuilder("⭐️")), 0.85f, yqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = jeVar.a;
            int i15 = keVar.c;
            if (z13) {
                int i16 = (int) j10;
                r92.f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{ci.u.b(i15, i16, 4), ci.u.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r92.r = i0.b.f(0.5f, ci.u.b(i15, i16, 4), ci.u.b(i15, i16, 3));
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
                r92.u = new d11(i0.a.j(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && r92.s == null) {
                    Drawable mutate = jeVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r92.s = mutate;
                    int i18 = r92.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = jeVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r92.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, keVar.b), mode));
                }
            }
            if (deVar3.b) {
                r92.b(this.r.E);
            } else {
                boolean z14 = deVar3.a;
                if (!r92.i && r92.p != z14) {
                    r92.p = z14;
                    yqVarArr = null;
                    r92.n = new d11(z14 ? LocaleController.getString(R.string.StarsReactionAnonymous) : DialogObject.getShortName(r92.j), 12.0f, null);
                    jeVar.invalidate();
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
