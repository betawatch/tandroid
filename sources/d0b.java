// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class d0b extends View implements snb {
    public PorterDuffColorFilter a;
    public int b;
    public final boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final Paint f;
    public final mm h;
    public float n;
    public c0b r;
    public pcc s;
    public final /* synthetic */ e0b w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0b(e0b e0bVar, Context context, boolean z) {
        super(context);
        this.w = e0bVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new mm(this, 0L, 320L, k43.h);
        this.c = z;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(hl.L(3.0f));
        paint.setColor(aob.v0(aob.h5, e0bVar.l1));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.n = this.h.e(false, arrayList.size());
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i >= arrayList2.size()) {
                break;
            }
            ((c0b) arrayList2.get(i)).a(canvas);
            i++;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((c0b) arrayList.get(i2)).a(canvas);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((c0b) arrayList.get(i)).k.I();
            i++;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((c0b) arrayList.get(i)).k.K();
            i++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c0b c0bVar;
        pcc pccVar;
        if (motionEvent.getAction() == 0) {
            c0b c0bVar2 = this.r;
            if (c0bVar2 != null) {
                c0bVar2.q.c(false);
            }
            this.r = null;
            int i = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i >= arrayList.size()) {
                    break;
                }
                if (((c0b) arrayList.get(i)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.r = (c0b) arrayList.get(i);
                    break;
                }
                i++;
            }
            c0b c0bVar3 = this.r;
            if (c0bVar3 != null) {
                c0bVar3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (c0bVar = this.r) != null && !c0bVar.p && c0bVar.b.contains(motionEvent.getX(), motionEvent.getY()) && (pccVar = this.s) != null) {
                pccVar.a(Long.valueOf(this.r.j));
            }
            c0b c0bVar4 = this.r;
            if (c0bVar4 != null) {
                c0bVar4.q.c(false);
            }
            this.r = null;
        }
        return this.r != null;
    }

    public void setMyPrivacy(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            c0b c0bVar = (c0b) arrayList.get(i);
            if (c0bVar.i) {
                c0bVar.b(j);
                return;
            }
            i++;
        }
    }

    public void setOnSenderClickListener(pcc pccVar) {
        this.s = pccVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [mm] */
    /* JADX WARN: Type inference failed for: r11v4, types: [mm] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.graphics.Typeface] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [c0b] */
    /* JADX WARN: Type inference failed for: r9v6, types: [c0b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [c0b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [c0b] */
    public void setSenders(ArrayList<zza> arrayList) {
        ArrayList arrayList2;
        wm2[] wm2VarArr;
        ?? r7;
        ?? r8;
        ?? r9;
        ?? r2;
        String s;
        ArrayList<zza> arrayList3 = arrayList;
        int i = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            wm2VarArr = null;
            zza zzaVar = null;
            r7 = this.e;
            r8 = 1;
            if (i >= size) {
                break;
            }
            c0b c0bVar = (c0b) arrayList2.get(i);
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                zza zzaVar2 = arrayList3.get(i2);
                boolean z = zzaVar2.b;
                if ((z && c0bVar.i) || (!c0bVar.i && !z && zzaVar2.c == c0bVar.j)) {
                    zzaVar = arrayList3.get(i2);
                    break;
                }
            }
            if (zzaVar == null) {
                c0bVar.k.K();
                arrayList2.remove(i);
                i--;
                c0bVar.a = -1;
                r7.add(c0bVar);
            }
            i++;
        }
        int i3 = 0;
        while (i3 < arrayList3.size()) {
            zza zzaVar3 = arrayList3.get(i3);
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                c0b c0bVar2 = (c0b) arrayList2.get(i4);
                if (!c0bVar2.i) {
                    if (!zzaVar3.b && c0bVar2.j == zzaVar3.c) {
                        r9 = (c0b) arrayList2.get(i4);
                        break;
                    }
                } else {
                    if (zzaVar3.b) {
                        r9 = (c0b) arrayList2.get(i4);
                        break;
                    }
                }
            }
            r9 = wm2VarArr;
            if (r9 == null) {
                for (int i5 = 0; i5 < r7.size(); i5++) {
                    c0b c0bVar3 = (c0b) r7.get(i5);
                    if (!c0bVar3.i) {
                        if (!zzaVar3.b && c0bVar3.j == zzaVar3.c) {
                            r9 = (c0b) r7.get(i5);
                            break;
                        }
                    } else {
                        if (zzaVar3.b) {
                            r9 = (c0b) r7.get(i5);
                            break;
                        }
                    }
                }
                if (r9 != null) {
                    r7.remove(r9);
                    r9.k.I();
                    arrayList2.add(r9);
                }
            }
            if (r9 == null) {
                r9 = new c0b(this, zzaVar3.b, zzaVar3.c);
                r9.d.e(r8, 0.0f);
                arrayList2.add(r9);
                r9.c.e(r8, (arrayList3.size() - r8) - i3);
            }
            d0b d0bVar = r9.w;
            e0b e0bVar = d0bVar.w;
            r9.a = (arrayList3.size() - r8) - i3;
            long j = zzaVar3.d;
            Paint paint = r9.h;
            r9.o = new pkb(nza.U0("⭐️".concat(ob6.E(j, ',')), 0.85f, wm2VarArr), 12.0f, hl.n1("fonts/num.otf"));
            boolean z2 = d0bVar.c;
            int i6 = e0bVar.m1;
            if (z2) {
                int i7 = (int) j;
                r9.f = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(16.0f), new int[]{eg5.b(i6, i7, 4), eg5.b(i6, i7, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r9.r = vm2.f(0.5f, eg5.b(i6, i7, 4), eg5.b(i6, i7, 3));
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
                int i8 = i3 + 1;
                r9.v = i8;
                r9.u = new pkb(String.valueOf(i8), 10.0f, hl.n1("fonts/num.otf"));
                if (i8 > 0 && r9.s == null) {
                    Drawable mutate = d0bVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r9.s = mutate;
                    int i9 = r9.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i9, mode));
                    Drawable mutate2 = d0bVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r9.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.h5, e0bVar.l1), mode));
                }
            }
            if (zzaVar3.b) {
                r9.b(this.w.y1);
            } else {
                boolean z3 = zzaVar3.a;
                if (!r9.i && r9.p != z3) {
                    r9.p = z3;
                    if (z3) {
                        r2 = null;
                        s = ob6.M0(2131744705, null);
                    } else {
                        r2 = null;
                        s = wf3.s(r9.j);
                    }
                    r9.n = new pkb(s, 12.0f, r2);
                    d0bVar.invalidate();
                    i3++;
                    arrayList3 = arrayList;
                    wm2VarArr = r2;
                    r8 = 1;
                }
            }
            r2 = null;
            i3++;
            arrayList3 = arrayList;
            wm2VarArr = r2;
            r8 = 1;
        }
        invalidate();
    }

    @Override // snb
    public final void updateColors() {
        Drawable drawable;
        ArrayList arrayList = this.d;
        try {
            int v0 = aob.v0(aob.h5, this.w.l1);
            this.f.setColor(v0);
            if (this.a == null || v0 != this.b) {
                this.b = v0;
                this.a = new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                c0b c0bVar = (c0b) arrayList.get(i);
                if (c0bVar != null && (drawable = c0bVar.t) != null) {
                    ColorFilter colorFilter = drawable.getColorFilter();
                    PorterDuffColorFilter porterDuffColorFilter = this.a;
                    if (colorFilter != porterDuffColorFilter) {
                        c0bVar.t.setColorFilter(porterDuffColorFilter);
                    }
                }
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
