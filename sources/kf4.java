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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class kf4 extends FrameLayout implements vlb {
    public TL_chatlists.TL_exportedChatlistInvite E;
    public final d a;
    public final int b;
    public final int c;
    public final Drawable d;
    public final Drawable e;
    public final io f;
    public final io h;
    public final Paint n;
    public final Paint r;
    public float s;
    public boolean w;
    public ValueAnimator x;
    public String y;

    public kf4(Context context, d dVar, int i, int i2) {
        super(context);
        this.a = dVar;
        this.b = i;
        this.c = i2;
        setImportantForAccessibility(1);
        io ioVar = new io(context, true, true, false);
        this.f = ioVar;
        ioVar.setTextSize(gm.L(15.66f));
        anb.U(ioVar, cmb.F6, null);
        ioVar.setGravity(jb6.a0 ? 5 : 3);
        ioVar.setEllipsizeByGradient(true);
        boolean z = jb6.a0;
        addView(ioVar, qoe.d(-1, 20.0f, 55, z ? 56.0f : 64.0f, 10.33f, z ? 64.0f : 56.0f, 0.0f));
        io ioVar2 = new io(context, false, false, false);
        this.h = ioVar2;
        ioVar2.setTextSize(gm.L(13.0f));
        anb.U(ioVar2, cmb.y6, null);
        ioVar2.setGravity(jb6.a0 ? 5 : 3);
        boolean z2 = jb6.a0;
        addView(ioVar2, qoe.d(-1, 16.0f, 55, z2 ? 56.0f : 64.0f, 33.33f, z2 ? 64.0f : 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.w0(null, i3, false), 1, -1);
        wmb M = anb.M(i3);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, null);
        int i4 = cmb.Ki;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(imageView, i4, null, mode);
        imageView.setOnClickListener(new sf3(this, (byte) 15));
        imageView.setContentDescription(jb6.M0(2131754838, null));
        boolean z3 = jb6.a0;
        addView(imageView, qoe.d(40, 40.0f, (z3 ? 3 : 5) | 16, z3 ? 8.0f : 4.0f, 4.0f, z3 ? 4.0f : 8.0f, 4.0f));
        Paint paint = new Paint();
        this.n = paint;
        paint.setColor(cmb.w0(null, cmb.Ei, false));
        Paint paint2 = new Paint();
        this.r = paint2;
        paint2.setColor(cmb.w0(null, cmb.mk, false));
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
        hf4 hf4Var = new hf4(this, (byte) 2);
        ConnectionsManager.getInstance(this.b).sendRequest(tL_chatlists_deleteExportedInvite, new cx3(this, hf4Var, (byte) 3));
        gm.d3(hf4Var, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        d dVar = this.a;
        if (dVar instanceof qf4) {
            fv fvVar = ((qf4) dVar).a;
            bu5 I = bu5.I(dVar, this);
            I.X(fvVar.V0(this, false));
            I.b(R.drawable.msg_qrcode, jb6.M0(2131750405, null), new hf4(this, (byte) 0), false);
            I.b(R.drawable.msg_delete, jb6.M0(2131751471, null), new hf4(this, (byte) 1), true);
            if (jb6.a0) {
                I.i = (byte) 3;
            }
            I.a0();
        }
    }

    public final void d() {
        if (this.y == null) {
            return;
        }
        ax8 ax8Var = new ax8(getContext(), jb6.M0(2131748927, null), this.y, jb6.M0(2131746239, null), false);
        ax8Var.D0();
        ax8Var.show();
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
        io ioVar = this.f;
        if (isEmpty) {
            ioVar.c(str, z2, true);
        } else {
            ioVar.c(tL_exportedChatlistInvite.title, z2, true);
        }
        this.h.c(jb6.G(tL_exportedChatlistInvite.peers.size(), "FilterInviteChats", new Object[0]), z2, true);
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
            ofFloat.addUpdateListener(new et1(this, (byte) 27));
            this.x.addListener(new jf4(b, this, z3));
            this.x.setInterpolator(d53.h);
            this.x.setDuration(350L);
            this.x.start();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = jb6.a0 ? getMeasuredWidth() - gm.L(32.0f) : gm.L(32.0f);
        float f = measuredWidth;
        canvas.drawCircle(f, getMeasuredHeight() / 2.0f, gm.L(16.0f), this.n);
        if (this.s > 0.0f) {
            canvas.drawCircle(f, getMeasuredHeight() / 2.0f, gm.L(16.0f) * this.s, this.r);
        }
        float f2 = this.s;
        if (f2 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f2) * 255.0f));
            drawable.setBounds(measuredWidth - gm.L(14.0f), (getMeasuredHeight() / 2) - gm.L(14.0f), gm.L(14.0f) + measuredWidth, gm.L(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f3 = this.s;
        if (f3 > 0.0f) {
            Drawable drawable2 = this.e;
            drawable2.setAlpha((int) (f3 * 255.0f));
            drawable2.setBounds(measuredWidth - gm.L(14.0f), (getMeasuredHeight() / 2) - gm.L(14.0f), gm.L(14.0f) + measuredWidth, gm.L(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.w) {
            canvas.drawRect(jb6.a0 ? 0.0f : gm.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(64.0f) : 0), getMeasuredHeight(), cmb.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.E;
        String str = "";
        StringBuilder sb = new StringBuilder((tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) ? "" : b10.j(new StringBuilder(), this.E.title, "\n "));
        sb.append(jb6.M0(2131748906, null));
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(60.0f), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.n.setColor(cmb.w0(null, cmb.Ei, false));
            this.r.setColor(cmb.w0(null, cmb.mk, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
