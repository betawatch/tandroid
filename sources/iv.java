// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class iv extends View implements eib {
    public final vg5 a;
    public final dx b;
    public bw c;
    public bw d;
    public boolean e;
    public boolean f;
    public final ImageReceiver h;
    public zw n;
    public TLObject r;
    public final int s;
    public final int w;
    public int x;

    public iv(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.s = gl.L(18.0f);
        this.w = gl.L(10.0f);
        this.a = vg5Var;
        this.b = dxVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.q0(gl.L(6.0f));
    }

    @Override // eib
    public final void k(ArrayList arrayList) {
        bw bwVar = this.c;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            arrayList.add(bwVar2);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.i(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.f(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        if (this.n != null) {
            if (this.f) {
                this.h.h(canvas, null);
            }
            canvas.save();
            canvas.translate(this.s, gl.L(10.0f));
            bw bwVar = this.c;
            vg5 vg5Var = this.a;
            int i2 = 0;
            if (bwVar != null) {
                o.s(vg5Var, canvas, this, 0);
                this.c.d(canvas, this);
                i = 1;
            } else {
                i = 0;
            }
            if (this.d != null) {
                canvas.translate(0.0f, this.x);
                o.s(vg5Var, canvas, this, i);
                this.d.d(canvas, this);
            }
            canvas.restore();
            if (this.e) {
                dx dxVar = this.b;
                float L = (dxVar == null || !dxVar.H) ? gl.L(17.0f) : 0.0f;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (dxVar != null && dxVar.H) {
                    i2 = gl.L(17.0f);
                }
                canvas.drawLine(L, measuredHeight, measuredWidth - i2, getMeasuredHeight() - 1, o.t1);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence g;
        CharSequence g2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        bw bwVar = this.c;
        dx dxVar = this.b;
        vg5 vg5Var = this.a;
        if (bwVar != null && (g2 = o.g(vg5Var, dxVar, bwVar)) != null) {
            spannableStringBuilder.append(g2);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null && (g = o.g(vg5Var, dxVar, bwVar2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(g);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) k96.M0(2131754857, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ImageReceiver imageReceiver;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        String format;
        int size = View.MeasureSpec.getSize(i);
        zw zwVar = this.n;
        this.e = zwVar.b != zwVar.a.articles.size() - 1;
        zw zwVar2 = this.n;
        TL_iv.pageRelatedArticle pagerelatedarticle = zwVar2.a.articles.get(zwVar2.b);
        int L = gl.L(gba.V0 - 16);
        long j = pagerelatedarticle.photo_id;
        dx dxVar = this.b;
        TLRPC.Photo e = j != 0 ? dxVar != null ? cx.e(dxVar.F, j) : cx.d(j, this.r) : null;
        ImageReceiver imageReceiver2 = this.h;
        if (e != null) {
            this.f = true;
            TLRPC.PhotoSize w = ba4.w(e.sizes, gl.Y0(false), false, null, false);
            TLRPC.PhotoSize w2 = ba4.w(e.sizes, 80, true, null, false);
            if (w == w2) {
                w2 = null;
            }
            imageReceiver2.Z(gl5.i(w, e), "64_64", gl5.i(w2, e), "64_64_b", null, w.size, null, this.r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f = false;
        }
        int L2 = gl.L(60.0f);
        int L3 = size - gl.L(36.0f);
        if (this.f) {
            float L4 = gl.L(44.0f);
            imageReceiver.i0((size - r5) - gl.L(8.0f), gl.L(8.0f), L4, L4);
            L3 = (int) (L3 - (imageReceiver.N0 + gl.L(6.0f)));
        }
        int L5 = gl.L(18.0f);
        String str = pagerelatedarticle.title;
        if (str != null) {
            i4 = L3;
            i5 = 1;
            i3 = L2;
            f = 6.0f;
            this.c = o.n(this.a, this, str, null, i4, this.w, this.n, Layout.Alignment.ALIGN_NORMAL, 3, this.b);
        } else {
            i3 = L2;
            i4 = L3;
            i5 = 1;
            f = 6.0f;
        }
        bw bwVar = this.c;
        int i8 = this.s;
        int i9 = this.w;
        if (bwVar != null) {
            int lineCount = bwVar.d.getLineCount();
            i6 = 4 - lineCount;
            this.x = de9.w(f, this.c.d.getHeight(), L);
            L5 = this.c.d.getHeight() + L5;
            int i10 = 0;
            while (true) {
                if (i10 >= lineCount) {
                    i7 = 0;
                    break;
                } else {
                    if (this.c.d.getLineLeft(i10) != 0.0f) {
                        i7 = i5;
                        break;
                    }
                    i10++;
                }
            }
            bw bwVar2 = this.c;
            bwVar2.s = i8;
            bwVar2.w = i9;
        } else {
            this.x = 0;
            i6 = 4;
            i7 = 0;
        }
        int i11 = i6;
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            String format2 = k96.D0().h0().format(pagerelatedarticle.published_date * 1000);
            String str2 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format2;
            objArr[i5] = str2;
            format = k96.a0(null, null, 2131754037, objArr);
        } else if (TextUtils.isEmpty(pagerelatedarticle.author)) {
            format = pagerelatedarticle.published_date != 0 ? k96.D0().h0().format(pagerelatedarticle.published_date * 1000) : !TextUtils.isEmpty(pagerelatedarticle.description) ? pagerelatedarticle.description : pagerelatedarticle.url;
        } else {
            Object[] objArr2 = new Object[i5];
            objArr2[0] = pagerelatedarticle.author;
            format = k96.a0(null, null, 2131754053, objArr2);
        }
        bw n = o.n(this.a, this, format, null, i4, this.x + i9, this.n, ((dxVar == null || !dxVar.H) && i7 == 0) ? Layout.Alignment.ALIGN_NORMAL : lwa.a(), i11, this.b);
        this.d = n;
        if (n != null) {
            int height = n.d.getHeight() + L5;
            if (this.c != null) {
                height = de9.w(f, L, height);
            }
            L5 = height;
            bw bwVar3 = this.d;
            bwVar3.s = i8;
            bwVar3.w = i9 + this.x;
        }
        setMeasuredDimension(size, Math.max(i3, L5) + (this.e ? 1 : 0));
    }
}
