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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class ae extends View implements org.telegram.ui.ActionBar.p6 {
    public PorterDuffColorFilter a;
    public int b;
    public final boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final Paint f;
    public final org.telegram.ui.Components.h6 h;
    public float n;
    public zd r;
    public Utilities.Callback s;
    public final /* synthetic */ be v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(be beVar, Context context, boolean z10) {
        super(context);
        this.v = beVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new org.telegram.ui.Components.h6(this, 0L, 320L, ds.h);
        this.c = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h5, beVar.b));
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
            ((zd) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((zd) arrayList.get(i11)).a(canvas);
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
            ((zd) arrayList.get(i10)).k.onAttachedToWindow();
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
            ((zd) arrayList.get(i10)).k.onDetachedFromWindow();
            i10++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        zd zdVar;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            zd zdVar2 = this.r;
            if (zdVar2 != null) {
                zdVar2.q.c(false);
            }
            this.r = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((zd) arrayList.get(i10)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.r = (zd) arrayList.get(i10);
                    break;
                }
                i10++;
            }
            zd zdVar3 = this.r;
            if (zdVar3 != null) {
                zdVar3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (zdVar = this.r) != null && !zdVar.p && zdVar.b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.s) != null) {
                callback.run(Long.valueOf(this.r.j));
            }
            zd zdVar4 = this.r;
            if (zdVar4 != null) {
                zdVar4.q.c(false);
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
            zd zdVar = (zd) arrayList.get(i10);
            if (zdVar.i) {
                zdVar.b(j10);
                return;
            }
            i10++;
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.s = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [org.telegram.ui.Components.h6] */
    /* JADX WARN: Type inference failed for: r11v4, types: [org.telegram.ui.Components.h6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [bi.zd] */
    /* JADX WARN: Type inference failed for: r9v6, types: [bi.zd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [bi.zd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [bi.zd] */
    public void setSenders(ArrayList<ud> arrayList) {
        ArrayList arrayList2;
        zq[] zqVarArr;
        ?? r72;
        ?? r82;
        ?? r92;
        ArrayList<ud> arrayList3 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            zqVarArr = null;
            ud udVar = null;
            r72 = this.e;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            zd zdVar = (zd) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                ud udVar2 = arrayList3.get(i11);
                boolean z10 = udVar2.b;
                if ((z10 && zdVar.i) || (!zdVar.i && !z10 && udVar2.c == zdVar.j)) {
                    udVar = arrayList3.get(i11);
                    break;
                }
            }
            if (udVar == null) {
                zdVar.k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                zdVar.a = -1;
                r72.add(zdVar);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            ud udVar3 = arrayList3.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                zd zdVar2 = (zd) arrayList2.get(i13);
                boolean z11 = zdVar2.i;
                if ((z11 && udVar3.b) || (!z11 && !udVar3.b && zdVar2.j == udVar3.c)) {
                    r92 = (zd) arrayList2.get(i13);
                    break;
                }
            }
            r92 = zqVarArr;
            if (r92 == null) {
                for (int i14 = 0; i14 < r72.size(); i14++) {
                    zd zdVar3 = (zd) r72.get(i14);
                    boolean z12 = zdVar3.i;
                    if ((z12 && udVar3.b) || (!z12 && !udVar3.b && zdVar3.j == udVar3.c)) {
                        r92 = (zd) r72.get(i14);
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
                r92 = new zd(this, udVar3.b, udVar3.c);
                r92.d.d(0.0f, r82);
                arrayList2.add(r92);
                r92.c.d((arrayList3.size() - r82) - i12, r82);
            }
            ae aeVar = r92.w;
            be beVar = aeVar.v;
            r92.a = (arrayList3.size() - r82) - i12;
            long j10 = udVar3.d;
            Paint paint = r92.h;
            r92.o = new q11(dd.Q0(org.telegram.messenger.t.i(j10, ',', new StringBuilder("⭐️")), 0.85f, zqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = aeVar.c;
            int i15 = beVar.c;
            if (z13) {
                int i16 = (int) j10;
                r92.f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{di.u.b(i15, i16, 4), di.u.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r92.r = i0.a.f(0.5f, di.u.b(i15, i16, 4), di.u.b(i15, i16, 3));
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
                r92.u = new q11(ic.a.i(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && r92.s == null) {
                    Drawable mutate = aeVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r92.s = mutate;
                    int i18 = r92.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = aeVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r92.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h5, beVar.b), mode));
                }
            }
            if (udVar3.b) {
                r92.b(this.v.E);
            } else {
                boolean z14 = udVar3.a;
                if (!r92.i && r92.p != z14) {
                    r92.p = z14;
                    zqVarArr = null;
                    r92.n = new q11(z14 ? LocaleController.getString(R.string.StarsReactionAnonymous) : DialogObject.getShortName(r92.j), 12.0f, null);
                    aeVar.invalidate();
                    i12++;
                    arrayList3 = arrayList;
                    r82 = 1;
                }
            }
            zqVarArr = null;
            i12++;
            arrayList3 = arrayList;
            r82 = 1;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:3:0x0002, B:5:0x0015, B:9:0x0028, B:11:0x002e, B:13:0x0036, B:15:0x003a, B:17:0x0042, B:19:0x0047, B:24:0x004a, B:28:0x001c), top: B:2:0x0002 }] */
    @Override // org.telegram.ui.ActionBar.p6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateColors() {
        int i10;
        Drawable drawable;
        ArrayList arrayList = this.d;
        try {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h5, this.v.b);
            this.f.setColor(w02);
            if (this.a != null) {
                if (w02 != this.b) {
                }
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    zd zdVar = (zd) arrayList.get(i10);
                    if (zdVar != null && (drawable = zdVar.t) != null) {
                        ColorFilter colorFilter = drawable.getColorFilter();
                        PorterDuffColorFilter porterDuffColorFilter = this.a;
                        if (colorFilter != porterDuffColorFilter) {
                            zdVar.t.setColorFilter(porterDuffColorFilter);
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

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
