// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class hf4 extends FrameLayout implements snb {
    public TL_chatlists.TL_exportedChatlistInvite E;
    public final e a;
    public final int b;
    public final int c;
    public final Drawable d;
    public final Drawable e;
    public final in f;
    public final in h;
    public final Paint n;
    public final Paint r;
    public float s;
    public boolean w;
    public ValueAnimator x;
    public String y;

    public hf4(Context context, e eVar, int i, int i2) {
        super(context);
        this.a = eVar;
        this.b = i;
        this.c = i2;
        setImportantForAccessibility(1);
        in inVar = new in(context, true, true, false);
        this.f = inVar;
        inVar.setTextSize(hl.L(15.66f));
        yob.U(inVar, aob.G6, null);
        inVar.setGravity(ob6.a0 ? 5 : 3);
        inVar.setEllipsizeByGradient(true);
        boolean z = ob6.a0;
        addView(inVar, tre.d(-1, 20.0f, 55, z ? 56.0f : 64.0f, 10.33f, z ? 64.0f : 56.0f, 0.0f));
        in inVar2 = new in(context, false, false, false);
        this.h = inVar2;
        inVar2.setTextSize(hl.L(13.0f));
        yob.U(inVar2, aob.z6, null);
        inVar2.setGravity(ob6.a0 ? 5 : 3);
        boolean z2 = ob6.a0;
        addView(inVar2, tre.d(-1, 16.0f, 55, z2 ? 56.0f : 64.0f, 33.33f, z2 ? 64.0f : 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = aob.i6;
        hf0 f0 = aob.f0(aob.w0(null, i3, false), 1, -1);
        uob M = yob.M(i3);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, null);
        int i4 = aob.Li;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(imageView, i4, null, mode);
        imageView.setOnClickListener(new mh3(this, (byte) 14));
        imageView.setContentDescription(ob6.M0(2131754834, null));
        boolean z3 = ob6.a0;
        addView(imageView, tre.d(40, 40.0f, (z3 ? 3 : 5) | 16, z3 ? 8.0f : 4.0f, 4.0f, z3 ? 4.0f : 8.0f, 4.0f));
        Paint paint = new Paint();
        this.n = paint;
        paint.setColor(aob.w0(null, aob.Fi, false));
        Paint paint2 = new Paint();
        this.r = paint2;
        paint2.setColor(aob.w0(null, aob.nk, false));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_link_1).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_link_2).mutate();
        this.e = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        setWillNotDraw(false);
    }

    public final void a() {
        String str = this.y;
        String substring = str == null ? null : str.substring(str.lastIndexOf(47) + 1);
        if (substring == null) {
            return;
        }
        TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.c;
        tL_chatlists_deleteExportedInvite.slug = substring;
        ff4 ff4Var = new ff4(this, (byte) 2);
        ConnectionsManager.getInstance(this.b).sendRequest(tL_chatlists_deleteExportedInvite, new mw3(this, ff4Var, (byte) 3));
        hl.d3(ff4Var, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        e eVar = this.a;
        if (eVar instanceof nf4) {
            gu guVar = ((nf4) eVar).a;
            fu5 I = fu5.I(eVar, this);
            I.X(guVar.W0(this, false));
            I.b(R.drawable.msg_qrcode, ob6.M0(2131750433, null), new ff4(this, (byte) 0), false);
            I.b(R.drawable.msg_delete, ob6.M0(2131751499, null), new ff4(this, (byte) 1), true);
            if (ob6.a0) {
                I.i = (byte) 3;
            }
            I.a0();
        }
    }

    public final void d() {
        if (this.y == null) {
            return;
        }
        ky8 ky8Var = new ky8(getContext(), ob6.M0(2131748924, null), this.y, ob6.M0(2131746233, null), false);
        ky8Var.E0();
        ky8Var.show();
    }

    public final void e(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z) {
        byte b = 0;
        boolean z2 = this.E == tL_exportedChatlistInvite;
        this.E = tL_exportedChatlistInvite;
        String str = tL_exportedChatlistInvite.url;
        this.y = str;
        if (str.startsWith("http://")) {
            str = str.substring(7);
        }
        if (str.startsWith("https://")) {
            str = str.substring(8);
        }
        boolean isEmpty = TextUtils.isEmpty(tL_exportedChatlistInvite.title);
        in inVar = this.f;
        if (isEmpty) {
            inVar.c(str, z2, true);
        } else {
            inVar.c(tL_exportedChatlistInvite.title, z2, true);
        }
        this.h.c(ob6.G(tL_exportedChatlistInvite.peers.size(), "FilterInviteChats", new Object[0]), z2, true);
        if (this.w != z) {
            this.w = z;
            invalidate();
        }
        boolean z3 = tL_exportedChatlistInvite.revoked;
        if ((z3 ? 1.0f : 0.0f) != this.s) {
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.x = null;
            }
            if (!z2) {
                this.s = z3 ? 1.0f : 0.0f;
                invalidate();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z3 ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new az1(this, (byte) 27));
            this.x.addListener(new gf4(b, this, z3));
            this.x.setInterpolator(k43.h);
            this.x.setDuration(350L);
            this.x.start();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = ob6.a0 ? getMeasuredWidth() - hl.L(32.0f) : hl.L(32.0f);
        float f = measuredWidth;
        canvas.drawCircle(f, getMeasuredHeight() / 2.0f, hl.L(16.0f), this.n);
        if (this.s > 0.0f) {
            canvas.drawCircle(f, getMeasuredHeight() / 2.0f, hl.L(16.0f) * this.s, this.r);
        }
        float f2 = this.s;
        if (f2 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f2) * 255.0f));
            drawable.setBounds(measuredWidth - hl.L(14.0f), (getMeasuredHeight() / 2) - hl.L(14.0f), hl.L(14.0f) + measuredWidth, hl.L(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f3 = this.s;
        if (f3 > 0.0f) {
            Drawable drawable2 = this.e;
            drawable2.setAlpha((int) (f3 * 255.0f));
            drawable2.setBounds(measuredWidth - hl.L(14.0f), (getMeasuredHeight() / 2) - hl.L(14.0f), hl.L(14.0f) + measuredWidth, hl.L(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.w) {
            canvas.drawRect(ob6.a0 ? 0.0f : hl.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(64.0f) : 0), getMeasuredHeight(), aob.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.E;
        String str = "";
        StringBuilder sb = new StringBuilder((tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) ? "" : c00.k(new StringBuilder(), this.E.title, "\n "));
        sb.append(ob6.M0(2131748903, null));
        sb.append(", ");
        sb.append((Object) this.h.getText());
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = this.E;
        if (tL_exportedChatlistInvite2 != null && TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
            str = "\n\n" + this.E.url;
        }
        sb.append(str);
        accessibilityNodeInfo.setContentDescription(sb.toString());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(60.0f), TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.n.setColor(aob.w0(null, aob.Fi, false));
            this.r.setColor(aob.w0(null, aob.nk, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
