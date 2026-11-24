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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iw extends View implements fkb {
    public final ui5 a;
    public final ey b;
    public bx c;
    public bx d;
    public boolean e;
    public boolean f;
    public final ImageReceiver h;
    public zx n;
    public TLObject r;
    public final int s;
    public final int w;
    public int x;

    public iw(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.s = gm.L(18.0f);
        this.w = gm.L(10.0f);
        this.a = ui5Var;
        this.b = eyVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.q0(gm.L(6.0f));
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            arrayList.add(bxVar2);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            bxVar2.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            bxVar2.f(this);
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
            canvas.translate(this.s, gm.L(10.0f));
            bx bxVar = this.c;
            ui5 ui5Var = this.a;
            int i2 = 0;
            if (bxVar != null) {
                o.s(ui5Var, canvas, this, 0);
                this.c.d(canvas, this);
                i = 1;
            } else {
                i = 0;
            }
            if (this.d != null) {
                canvas.translate(0.0f, this.x);
                o.s(ui5Var, canvas, this, i);
                this.d.d(canvas, this);
            }
            canvas.restore();
            if (this.e) {
                ey eyVar = this.b;
                float L = (eyVar == null || !eyVar.H) ? gm.L(17.0f) : 0.0f;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (eyVar != null && eyVar.H) {
                    i2 = gm.L(17.0f);
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
        bx bxVar = this.c;
        ey eyVar = this.b;
        ui5 ui5Var = this.a;
        if (bxVar != null && (g2 = o.g(ui5Var, eyVar, bxVar)) != null) {
            spannableStringBuilder.append(g2);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null && (g = o.g(ui5Var, eyVar, bxVar2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(g);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) jb6.M0(2131754857, null));
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
        zx zxVar = this.n;
        this.e = zxVar.b != zxVar.a.articles.size() - 1;
        zx zxVar2 = this.n;
        TL_iv.pageRelatedArticle pagerelatedarticle = zxVar2.a.articles.get(zxVar2.b);
        int L = gm.L(gda.V0 - 16);
        long j = pagerelatedarticle.photo_id;
        ey eyVar = this.b;
        TLRPC.Photo e = j != 0 ? eyVar != null ? dy.e(eyVar.F, j) : dy.d(j, this.r) : null;
        ImageReceiver imageReceiver2 = this.h;
        if (e != null) {
            this.f = true;
            TLRPC.PhotoSize w = bc4.w(e.sizes, gm.Y0(false), false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(e.sizes, 80, true, null, false);
            if (w == w2) {
                w2 = null;
            }
            imageReceiver2.Z(gn5.i(w, e), "64_64", gn5.i(w2, e), "64_64_b", null, w.size, null, this.r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f = false;
        }
        int L2 = gm.L(60.0f);
        int L3 = size - gm.L(36.0f);
        if (this.f) {
            float L4 = gm.L(44.0f);
            imageReceiver.i0((size - r5) - gm.L(8.0f), gm.L(8.0f), L4, L4);
            L3 = (int) (L3 - (imageReceiver.N0 + gm.L(6.0f)));
        }
        int L5 = gm.L(18.0f);
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
        bx bxVar = this.c;
        int i8 = this.s;
        int i9 = this.w;
        if (bxVar != null) {
            int lineCount = bxVar.d.getLineCount();
            i6 = 4 - lineCount;
            this.x = hg9.v(f, this.c.d.getHeight(), L);
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
            bx bxVar2 = this.c;
            bxVar2.s = i8;
            bxVar2.w = i9;
        } else {
            this.x = 0;
            i6 = 4;
            i7 = 0;
        }
        int i11 = i6;
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            String format2 = jb6.D0().h0().format(pagerelatedarticle.published_date * 1000);
            String str2 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format2;
            objArr[i5] = str2;
            format = jb6.a0(null, null, 2131754005, objArr);
        } else if (TextUtils.isEmpty(pagerelatedarticle.author)) {
            format = pagerelatedarticle.published_date != 0 ? jb6.D0().h0().format(pagerelatedarticle.published_date * 1000) : !TextUtils.isEmpty(pagerelatedarticle.description) ? pagerelatedarticle.description : pagerelatedarticle.url;
        } else {
            Object[] objArr2 = new Object[i5];
            objArr2[0] = pagerelatedarticle.author;
            format = jb6.a0(null, null, 2131754021, objArr2);
        }
        bx n = o.n(this.a, this, format, null, i4, this.x + i9, this.n, ((eyVar == null || !eyVar.H) && i7 == 0) ? Layout.Alignment.ALIGN_NORMAL : oya.a(), i11, this.b);
        this.d = n;
        if (n != null) {
            int height = n.d.getHeight() + L5;
            if (this.c != null) {
                height = hg9.v(f, L, height);
            }
            L5 = height;
            bx bxVar3 = this.d;
            bxVar3.s = i8;
            bxVar3.w = i9 + this.x;
        }
        setMeasuredDimension(size, Math.max(i3, L5) + (this.e ? 1 : 0));
    }
}
