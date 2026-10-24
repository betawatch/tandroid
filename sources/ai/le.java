package ai;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class le extends View implements org.telegram.ui.ActionBar.b6 {
    public PorterDuffColorFilter a;
    public int b;
    public final boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final Paint f;
    public final org.telegram.ui.Components.f6 h;
    public float n;
    public ke r;
    public Utilities.Callback s;
    public final /* synthetic */ me v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(me meVar, Context context, boolean z10) {
        super(context);
        this.v = meVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new org.telegram.ui.Components.f6(this, 0L, 320L, bs.h);
        this.c = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, meVar.b));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.n = this.h.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((ke) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ke) arrayList.get(i11)).a(canvas);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((ke) arrayList.get(i10)).k.onAttachedToWindow();
            i10++;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((ke) arrayList.get(i10)).k.onDetachedFromWindow();
            i10++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ke keVar;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            ke keVar2 = this.r;
            if (keVar2 != null) {
                keVar2.q.c(false);
            }
            this.r = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((ke) arrayList.get(i10)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.r = (ke) arrayList.get(i10);
                    break;
                }
                i10++;
            }
            ke keVar3 = this.r;
            if (keVar3 != null) {
                keVar3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (keVar = this.r) != null && !keVar.p && keVar.b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.s) != null) {
                callback.run(Long.valueOf(this.r.j));
            }
            ke keVar4 = this.r;
            if (keVar4 != null) {
                keVar4.q.c(false);
            }
            this.r = null;
        }
        return this.r != null;
    }

    public void setMyPrivacy(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                return;
            }
            ke keVar = (ke) arrayList.get(i10);
            if (keVar.i) {
                keVar.b(j10);
                return;
            }
            i10++;
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.s = callback;
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
    /* JADX WARN: Type inference failed for: r9v5, types: [ai.ke] */
    /* JADX WARN: Type inference failed for: r9v6, types: [ai.ke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [ai.ke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [ai.ke] */
    public void setSenders(ArrayList<fe> arrayList) {
        ArrayList arrayList2;
        xq[] xqVarArr;
        ?? r72;
        ?? r82;
        ?? r92;
        ArrayList<fe> arrayList3 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            xqVarArr = null;
            fe feVar = null;
            r72 = this.e;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            ke keVar = (ke) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                fe feVar2 = arrayList3.get(i11);
                boolean z10 = feVar2.b;
                if ((z10 && keVar.i) || (!keVar.i && !z10 && feVar2.c == keVar.j)) {
                    feVar = arrayList3.get(i11);
                    break;
                }
            }
            if (feVar == null) {
                keVar.k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                keVar.a = -1;
                r72.add(keVar);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            fe feVar3 = arrayList3.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                ke keVar2 = (ke) arrayList2.get(i13);
                boolean z11 = keVar2.i;
                if ((z11 && feVar3.b) || (!z11 && !feVar3.b && keVar2.j == feVar3.c)) {
                    r92 = (ke) arrayList2.get(i13);
                    break;
                }
            }
            r92 = xqVarArr;
            if (r92 == null) {
                for (int i14 = 0; i14 < r72.size(); i14++) {
                    ke keVar3 = (ke) r72.get(i14);
                    boolean z12 = keVar3.i;
                    if ((z12 && feVar3.b) || (!z12 && !feVar3.b && keVar3.j == feVar3.c)) {
                        r92 = (ke) r72.get(i14);
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
                r92 = new ke(this, feVar3.b, feVar3.c);
                r92.d.d(0.0f, r82);
                arrayList2.add(r92);
                r92.c.d((arrayList3.size() - r82) - i12, r82);
            }
            le leVar = r92.w;
            me meVar = leVar.v;
            r92.a = (arrayList3.size() - r82) - i12;
            long j10 = feVar3.d;
            Paint paint = r92.h;
            r92.o = new i11(nd.S0(i2.o1.m(j10, ',', new StringBuilder("⭐️")), 0.85f, xqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = leVar.c;
            int i15 = meVar.c;
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
            if (this.c) {
                int i17 = i12 + 1;
                r92.v = i17;
                r92.u = new i11(i2.o1.k(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && r92.s == null) {
                    Drawable mutate = leVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r92.s = mutate;
                    int i18 = r92.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = leVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r92.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, meVar.b), mode));
                }
            }
            if (feVar3.b) {
                r92.b(this.v.E);
            } else {
                boolean z14 = feVar3.a;
                if (!r92.i && r92.p != z14) {
                    r92.p = z14;
                    xqVarArr = null;
                    r92.n = new i11(z14 ? LocaleController.getString(R.string.StarsReactionAnonymous) : DialogObject.getShortName(r92.j), 12.0f, null);
                    leVar.invalidate();
                    i12++;
                    arrayList3 = arrayList;
                    r82 = 1;
                }
            }
            xqVarArr = null;
            i12++;
            arrayList3 = arrayList;
            r82 = 1;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:3:0x0002, B:5:0x0015, B:9:0x0028, B:11:0x002e, B:13:0x0036, B:15:0x003a, B:17:0x0042, B:19:0x0047, B:24:0x004a, B:28:0x001c), top: B:2:0x0002 }] */
    @Override // org.telegram.ui.ActionBar.b6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateColors() {
        int i10;
        Drawable drawable;
        ArrayList arrayList = this.d;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.v.b);
            this.f.setColor(w02);
            if (this.a != null) {
                if (w02 != this.b) {
                }
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    ke keVar = (ke) arrayList.get(i10);
                    if (keVar != null && (drawable = keVar.t) != null) {
                        ColorFilter colorFilter = drawable.getColorFilter();
                        PorterDuffColorFilter porterDuffColorFilter = this.a;
                        if (colorFilter != porterDuffColorFilter) {
                            keVar.t.setColorFilter(porterDuffColorFilter);
                        }
                    }
                }
                invalidate();
            }
            this.b = w02;
            this.a = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
            while (i10 < arrayList.size()) {
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
