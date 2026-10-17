package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class sg extends FrameLayout {
    public final Drawable E;
    public final Drawable F;
    public final rg G;
    public int H;
    public final RectF I;
    public final RectF J;
    public long K;
    public final Path L;
    public final float[] M;
    public final float[] N;
    public final f6 O;
    public eh.b P;
    public boolean Q;
    public dh.d R;
    public dh.d S;
    public boolean T;
    public boolean U;
    public final /* synthetic */ ChatActivityEnterView V;
    public ei.x3 a;
    public ei.x3 b;
    public ShapeDrawable c;
    public final Drawable d;
    public final String e;
    public StaticLayout f;
    public float h;
    public final TextPaint n;
    public final Paint r;
    public final Paint s;
    public final Paint v;
    public final Path w;
    public final Paint x;
    public final ei.l y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.V = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.n = textPaint;
        this.r = new Paint(1);
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new Path();
        this.x = new Paint(1);
        this.I = new RectF();
        this.J = new RectF();
        this.L = new Path();
        this.M = new float[]{r14, r14, 0.0f, 0.0f, 0.0f, 0.0f, r14, r14};
        this.N = new float[]{0.0f, 0.0f, r13, r13, r13, r13, 0.0f, 0.0f};
        this.O = new f6(this, 0L, 350L, bs.h);
        rg rgVar = new rg(this, this);
        this.G = rgVar;
        r0.i0.j(this, rgVar);
        ei.l lVar = new ei.l(5);
        this.y = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.O, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.V3 = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.be), PorterDuff.Mode.MULTIPLY));
        this.c = org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(5.0f), chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.qf));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.e = LocaleController.getString("SlideUpToLock", R.string.SlideUpToLock);
        float dp = AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(3.0f);
        this.E = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.F = getResources().getDrawable(R.drawable.input_video).mutate();
        setWillNotDraw(false);
        c();
    }

    public final void a() {
        ei.x3 x3Var = this.a;
        if (x3Var != null) {
            x3Var.l0 = new qg(this, x3Var, 1);
            x3Var.e(true);
            this.a = null;
        }
        ei.x3 x3Var2 = this.b;
        if (x3Var2 != null) {
            x3Var2.l0 = new qg(this, x3Var2, 2);
            x3Var2.e(true);
            this.b = null;
        }
    }

    public final void b() {
        a();
        ei.x3 x3Var = new ei.x3(getContext(), 2);
        this.b = x3Var;
        x3Var.l(1.0f, 0.0f);
        this.b.p(true);
        ChatActivityEnterView chatActivityEnterView = this.V;
        this.b.s(AndroidUtilities.replaceTags(LocaleController.getString(chatActivityEnterView.c1 ? chatActivityEnterView.O ? R.string.VideoSetOnceHintEnabled : R.string.VideoSetOnceHint : chatActivityEnterView.O ? R.string.VoiceSetOnceHintEnabled : R.string.VoiceSetOnceHint)));
        ei.x3 x3Var2 = this.b;
        x3Var2.h = ei.x3.a(x3Var2.getText(), this.b.getTextPaint());
        if (chatActivityEnterView.O) {
            ei.x3 x3Var3 = this.b;
            int i10 = R.raw.fire_on;
            x3Var3.getClass();
            uj0 uj0Var = new uj0(i10, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
            uj0Var.start();
            x3Var3.j(uj0Var);
        } else {
            MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.b, w7.z5.a(-1.0f, 0.0f, 0.0f, 54.0f, 58.0f, -1, 119));
        ei.x3 x3Var4 = this.b;
        x3Var4.l0 = new qg(this, x3Var4, 0);
        x3Var4.u();
    }

    public final void c() {
        eh.b bVar = this.P;
        if (bVar != null) {
            bVar.b();
        }
        dh.d dVar = this.R;
        if (dVar != null) {
            dVar.v();
        }
        dh.d dVar2 = this.S;
        if (dVar2 != null) {
            dVar2.v();
        }
        int i10 = this.Q ? org.telegram.ui.ActionBar.h6.Wk : org.telegram.ui.ActionBar.h6.Zd;
        ChatActivityEnterView chatActivityEnterView = this.V;
        this.y.e(chatActivityEnterView.g0(i10), chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.cf), -1);
        this.n.setColor(chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.pf));
        int dp = AndroidUtilities.dp(5.0f);
        int i11 = org.telegram.ui.ActionBar.h6.qf;
        this.c = org.telegram.ui.ActionBar.h6.c0(dp, chatActivityEnterView.g0(i11));
        int g02 = chatActivityEnterView.g0(i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.d.setColorFilter(new PorterDuffColorFilter(g02, mode));
        this.r.setColor(chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.ae));
        this.s.setColor(chatActivityEnterView.g0(this.Q ? org.telegram.ui.ActionBar.h6.Wk : org.telegram.ui.ActionBar.h6.Zd));
        this.v.setColor(chatActivityEnterView.g0(this.Q ? org.telegram.ui.ActionBar.h6.Wk : org.telegram.ui.ActionBar.h6.Zd));
        this.E.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(this.Q ? org.telegram.ui.ActionBar.h6.Wk : org.telegram.ui.ActionBar.h6.Zd), mode));
        this.F.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(this.Q ? org.telegram.ui.ActionBar.h6.Wk : org.telegram.ui.ActionBar.h6.Zd), mode));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent) || this.G.f(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x077c, code lost:
    
        r1.drawCircle(r2, r45, org.telegram.messenger.AndroidUtilities.dpf2(2.0f) * r29, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0789, code lost:
    
        r1.restore();
        r1.restore();
        r3 = (org.telegram.messenger.AndroidUtilities.dp(38.0f) * r10) + (org.telegram.messenger.AndroidUtilities.lerp(r41, getMeasuredHeight() - org.telegram.messenger.AndroidUtilities.dp(118.0f), java.lang.Math.max(r8.m4, java.lang.Math.min(r38, r8.q4))) + r24);
        r12.set(r35 - org.telegram.messenger.AndroidUtilities.dpf2(18.0f), r3, org.telegram.messenger.AndroidUtilities.dpf2(18.0f) + r35, r3 + r21);
        r2 = r8.Z2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x07ce, code lost:
    
        if (r2 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x07d4, code lost:
    
        if (r2.j1() == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x07d6, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x07db, code lost:
    
        r8.P = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x07dd, code lost:
    
        if (r11 == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x07df, code lost:
    
        r2 = org.telegram.messenger.AndroidUtilities.dpf2(12.0f);
        r12.set(r12.left, (r12.top - org.telegram.messenger.AndroidUtilities.dpf2(36.0f)) - r2, r12.right, r12.top - r2);
        r2 = r46.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x07f9, code lost:
    
        if (r2 == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x07fb, code lost:
    
        r2.m(0.0f, r12.centerY());
        r46.b.invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0808, code lost:
    
        r46.J.set(r12);
        r1.save();
        r9 = (((1.0f - r8.m4) * r8.i4) * r8.q4) * r8.n4;
        r1.scale(r9, r9, r12.centerX(), r12.centerY());
        r2 = r46.S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x082c, code lost:
    
        if (r2 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x082e, code lost:
    
        r2.setBounds((int) (r12.left - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (r12.top - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.right), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.bottom));
        r46.S.draw(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x088c, code lost:
    
        r46.y.setBounds((int) r12.left, (int) r12.top, (int) r12.right, (int) r12.bottom);
        r46.y.draw(r1);
        r1.restore();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x08a5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0857, code lost:
    
        r8.V3.setBounds((int) (r12.left - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (r12.top - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.right), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.bottom));
        r8.V3.draw(r1);
        r1.drawRoundRect(r12, org.telegram.messenger.AndroidUtilities.dpf2(18.0f), org.telegram.messenger.AndroidUtilities.dpf2(18.0f), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x07d9, code lost:
    
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x066c, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x070f, code lost:
    
        r29 = r5;
        r5 = r4;
        r26 = false;
        r1.drawRoundRect(r12, org.telegram.messenger.AndroidUtilities.dpf2(3.0f), org.telegram.messenger.AndroidUtilities.dpf2(3.0f), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0652, code lost:
    
        r2 = r46.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0655, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0643, code lost:
    
        r45 = r3;
        r19 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0437, code lost:
    
        r34 = r7;
        r35 = r9;
        r8.V3.setBounds((int) (r12.left - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (r12.top - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.right), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.bottom));
        r8.V3.draw(r47);
        r47.drawRoundRect(r12, org.telegram.messenger.AndroidUtilities.dpf2(18.0f), org.telegram.messenger.AndroidUtilities.dpf2(18.0f), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03da, code lost:
    
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03a1, code lost:
    
        r8.e4 = false;
        r4 = r8.q4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03a8, code lost:
    
        if (r4 == 0.0f) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03aa, code lost:
    
        r4 = r4 - 0.12f;
        r8.q4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03af, code lost:
    
        if (r4 >= 0.0f) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03b1, code lost:
    
        r8.q4 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0310, code lost:
    
        r3 = 0.0f;
        r2 = java.lang.Math.max(0.0f, (r2 - 0.38f) / 0.25f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0303, code lost:
    
        r4 = r2 / 0.38f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0325, code lost:
    
        r2 = r8.m4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x032a, code lost:
    
        if (r2 == 0.0f) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0331, code lost:
    
        if (r2 <= 0.6f) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0333, code lost:
    
        r4 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x033a, code lost:
    
        if (r8.g0 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x033d, code lost:
    
        r2 = java.lang.Math.max(0.0f, (r2 - 0.6f) / 0.4f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0345, code lost:
    
        r3 = org.telegram.ui.Components.bs.j;
        r4 = r3.getInterpolation(r4);
        r2 = r3.getInterpolation(r2);
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0336, code lost:
    
        r4 = r2 / 0.6f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0351, code lost:
    
        r2 = 0.0f;
        r14 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02e6, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02d3, code lost:
    
        r21 = r2;
        r30 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x019b, code lost:
    
        r4 = r8.g4 - (r3 / 150.0f);
        r8.g4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01a4, code lost:
    
        if (r4 >= 0.0f) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01a6, code lost:
    
        r8.g4 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x017b, code lost:
    
        r8.e4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0162, code lost:
    
        if (r8.g4 != 0.0f) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0157, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r8.f4) <= 200) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0169, code lost:
    
        if (r33 < 0.8f) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x016d, code lost:
    
        if (r8.s4 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0173, code lost:
    
        if (r8.m4 != 0.0f) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0179, code lost:
    
        if (r8.p4 == 0.0f) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0182, code lost:
    
        if (r8.e4 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0184, code lost:
    
        r5 = r8.g4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0188, code lost:
    
        if (r5 == r32) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x018a, code lost:
    
        r3 = (r3 / 150.0f) + r5;
        r8.g4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0191, code lost:
    
        if (r3 < r32) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0193, code lost:
    
        r8.g4 = r32;
        org.telegram.messenger.SharedConfig.increaseLockRecordAudioVideoHintShowed();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01aa, code lost:
    
        r3 = (int) (r8.g4 * 255.0f);
        r46.c.setAlpha(r3);
        r4 = r46.d;
        r4.setAlpha(r3);
        r46.n.setAlpha(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01c0, code lost:
    
        if (r46.f == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01c2, code lost:
    
        r47.save();
        r12.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        r47.translate((getMeasuredWidth() - r46.h) - org.telegram.messenger.AndroidUtilities.dp(44.0f), org.telegram.messenger.AndroidUtilities.dpf2(16.0f) + r14);
        r21 = r2;
        r30 = r6;
        r46.c.setBounds(-org.telegram.messenger.AndroidUtilities.dp(8.0f), -org.telegram.messenger.AndroidUtilities.dp(r25), (int) (r46.h + org.telegram.messenger.AndroidUtilities.dp(36.0f)), (int) (org.telegram.messenger.AndroidUtilities.dpf2(4.0f) + r46.f.getHeight()));
        r46.c.draw(r47);
        r46.f.draw(r47);
        r47.restore();
        r47.save();
        r47.translate(getMeasuredWidth() - org.telegram.messenger.AndroidUtilities.dp(26.0f), ((r46.f.getHeight() / r25) + (org.telegram.messenger.AndroidUtilities.dpf2(17.0f) + r14)) - (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) * r8.o4));
        r2 = r46.w;
        r2.reset();
        r2.setLastPoint(-org.telegram.messenger.AndroidUtilities.dpf2(5.0f), org.telegram.messenger.AndroidUtilities.dpf2(4.0f));
        r2.lineTo(0.0f, 0.0f);
        r2.lineTo(org.telegram.messenger.AndroidUtilities.dpf2(5.0f), org.telegram.messenger.AndroidUtilities.dpf2(4.0f));
        r6 = r46.x;
        r6.setColor(-1);
        r6.setAlpha(r3);
        r6.setStyle(android.graphics.Paint.Style.STROKE);
        r6.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        r6.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        r6.setStrokeWidth(org.telegram.messenger.AndroidUtilities.dpf2(1.5f));
        r47.drawPath(r2, r6);
        r47.restore();
        r47.save();
        r4.setBounds(r7 - (r4.getIntrinsicWidth() / 2), (int) (org.telegram.messenger.AndroidUtilities.dpf2(20.0f) + (r46.f.getHeight() + r14)), org.telegram.ui.Cells.t0.B(2, r7, r4), r4.getIntrinsicHeight() + ((int) (org.telegram.messenger.AndroidUtilities.dpf2(20.0f) + (r46.f.getHeight() + r14))));
        r4.draw(r47);
        r47.restore();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02d9, code lost:
    
        if (r8.c1 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02e2, code lost:
    
        if (r8.i1 < 59000) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02e4, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02e7, code lost:
    
        r10 = r46.O.e(r2);
        r2 = r8.p4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02f3, code lost:
    
        if (r2 == 0.0f) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02f7, code lost:
    
        if (r8.h1 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02fe, code lost:
    
        if (r2 <= 0.38f) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0300, code lost:
    
        r4 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x030a, code lost:
    
        if (r2 <= 0.63f) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x030c, code lost:
    
        r2 = 1.0f;
        r3 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0318, code lost:
    
        r5 = org.telegram.ui.Components.bs.j;
        r19 = r5.getInterpolation(r4);
        r5.getInterpolation(r2);
        r2 = r3;
        r14 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0353, code lost:
    
        r47.save();
        r47.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - r8.z1.getMeasuredHeight());
        r3 = 1.0f - r8.i4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0373, code lost:
    
        if (r3 == 0.0f) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0378, code lost:
    
        if (r2 == 0.0f) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x037a, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x037c, code lost:
    
        r3 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0387, code lost:
    
        if (r8.j4 < 0.7f) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x038b, code lost:
    
        if (r8.r4 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x038f, code lost:
    
        r4 = r8.q4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0395, code lost:
    
        if (r4 == 1.0f) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0397, code lost:
    
        r4 = r4 + 0.12f;
        r8.q4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x039c, code lost:
    
        if (r4 <= 1.0f) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x039e, code lost:
    
        r8.q4 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03b3, code lost:
    
        r4 = org.telegram.messenger.AndroidUtilities.dpf2(72.0f);
        r3 = com.google.android.gms.internal.cast.a6.x(1.0f, r3, org.telegram.messenger.AndroidUtilities.dpf2(24.0f) * r14, r4 * r3);
        r5 = r8.q4;
        r3 = com.google.android.gms.internal.cast.a6.x(1.0f, r5, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03d5, code lost:
    
        if (r3 <= r4) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x03d7, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x03dc, code lost:
    
        r2 = org.telegram.messenger.q.z(1.0f, r2, (1.0f - r10) * r8.i4, r5);
        r9 = r7;
        r6 = r30 + r24;
        r47.scale(r2, r2, r9, r6);
        r4 = r11 + r24;
        r12.set(r9 - org.telegram.messenger.AndroidUtilities.dpf2(18.0f), r4, org.telegram.messenger.AndroidUtilities.dpf2(18.0f) + r9, r4 + r15);
        r3 = r46.R;
        r4 = r46.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0405, code lost:
    
        if (r3 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0407, code lost:
    
        r34 = r7;
        r35 = r9;
        r3.setBounds((int) (r12.left - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (r12.top - org.telegram.messenger.AndroidUtilities.dpf2(3.0f)), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.right), (int) (org.telegram.messenger.AndroidUtilities.dpf2(3.0f) + r12.bottom));
        r46.R.draw(r47);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0471, code lost:
    
        r8.S3.set(r12);
        r3 = r8.S3;
        r5 = r3.centerX();
        r6 = r3.centerY();
        r3.left = org.telegram.messenger.AndroidUtilities.lerp(r5, r3.left, r2);
        r3.right = org.telegram.messenger.AndroidUtilities.lerp(r5, r3.right, r2);
        r3.top = org.telegram.messenger.AndroidUtilities.lerp(r6, r3.top, r2);
        r3.bottom = org.telegram.messenger.AndroidUtilities.lerp(r6, r3.bottom, r2);
        r2 = r46.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x04a2, code lost:
    
        if (r2 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x04a4, code lost:
    
        r2.m(0.0f, r12.centerY());
        r46.a.invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x04b1, code lost:
    
        r5 = 1.0f - r21;
        r7 = r25;
        r12.set((r35 - org.telegram.messenger.AndroidUtilities.dpf2(6.0f)) - (org.telegram.messenger.AndroidUtilities.dpf2(r25) * r5), r6 - (org.telegram.messenger.AndroidUtilities.dpf2(r25) * r5), org.telegram.ui.Cells.t0.b(r7, r5, org.telegram.messenger.AndroidUtilities.dp(6.0f) + r34), org.telegram.ui.Cells.t0.b(r7, r5, r6 + org.telegram.messenger.AndroidUtilities.dp(12.0f)));
        r9 = r12.bottom;
        r2 = r12.centerX();
        r3 = r12.centerY();
        r47.save();
        r31 = org.telegram.messenger.Utilities.clamp(r8.p4 * r7, 1.0f, 0.0f);
        r1 = r46.s;
        r6 = r1.getAlpha();
        r41 = r11;
        r38 = r14;
        r9 = r21;
        r21 = r15;
        r1 = r47;
        r7 = r1.saveLayerAlpha(r2 - org.telegram.messenger.AndroidUtilities.dp(24.0f), r3 - org.telegram.messenger.AndroidUtilities.dp(24.0f), org.telegram.messenger.AndroidUtilities.dp(24.0f) + r2, org.telegram.messenger.AndroidUtilities.dp(24.0f) + r3, (int) (r6 * (1.0f - r31)), 31);
        r6 = r46.v;
        r6.setAlpha(255);
        r1.setAlpha(255);
        r3 = 1.0f - r33;
        r1.translate(0.0f, org.telegram.messenger.AndroidUtilities.dpf2(2.0f) * r3);
        r1.rotate(r13, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0578, code lost:
    
        if (r9 == 1.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x057a, code lost:
    
        r2 = org.telegram.messenger.AndroidUtilities.rectTmp;
        r2.set(0.0f, 0.0f, org.telegram.messenger.AndroidUtilities.dpf2(8.0f), org.telegram.messenger.AndroidUtilities.dpf2(8.0f));
        r1.save();
        r1.clipRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.ui.Cells.t0.b(2.0f, r3, r24 + r9));
        r45 = r3;
        r11 = r33;
        r1.translate(r35 - org.telegram.messenger.AndroidUtilities.dpf2(4.0f), (org.telegram.messenger.AndroidUtilities.dpf2(2.0f) * r8.n4) + org.telegram.ui.Cells.t0.b(12.0f, r9, (r12.top - org.telegram.messenger.AndroidUtilities.dp(6.0f)) - org.telegram.messenger.AndroidUtilities.lerp(org.telegram.messenger.AndroidUtilities.dpf2(2.0f), (1.0f - r8.o4) * org.telegram.messenger.AndroidUtilities.dpf2(1.5f), r11)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x05dc, code lost:
    
        if (r13 <= 0.0f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x05de, code lost:
    
        r1.rotate(r13, org.telegram.messenger.AndroidUtilities.dp(8.0f), org.telegram.messenger.AndroidUtilities.dp(8.0f));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x05eb, code lost:
    
        r6 = r6;
        r1.drawLine(org.telegram.messenger.AndroidUtilities.dpf2(8.0f), org.telegram.messenger.AndroidUtilities.dpf2(4.0f), org.telegram.messenger.AndroidUtilities.dpf2(8.0f), org.telegram.ui.Cells.t0.b(4.0f, r5, org.telegram.messenger.AndroidUtilities.dpf2(6.0f)), r6);
        r47.drawArc(r2, 0.0f, -180.0f, false, r6);
        r1 = r47;
        r1.drawLine(0.0f, org.telegram.messenger.AndroidUtilities.dpf2(4.0f), 0.0f, com.google.android.gms.internal.cast.a6.t(org.telegram.messenger.AndroidUtilities.dpf2(4.0f), r8.n4, r3, (((org.telegram.messenger.AndroidUtilities.dpf2(4.0f) * r8.o4) * r11) * (!r8.s4 ? 1 : 0)) + org.telegram.messenger.AndroidUtilities.dpf2(4.0f)), r6);
        r1.restore();
        r19 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0649, code lost:
    
        if (r31 <= r19) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x064d, code lost:
    
        if (r8.c1 == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x064f, code lost:
    
        r2 = r46.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0658, code lost:
    
        if (r9 <= r19) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x065c, code lost:
    
        if (r46.S != null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x065e, code lost:
    
        r5 = r4;
        r1.drawRoundRect(r12, org.telegram.messenger.AndroidUtilities.dpf2(3.0f), org.telegram.messenger.AndroidUtilities.dpf2(3.0f), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x066e, code lost:
    
        r3 = r46.L;
        r3.rewind();
        r4 = org.telegram.messenger.AndroidUtilities.rectTmp;
        r4.set(r12);
        r4.right = r12.centerX() - (org.telegram.messenger.AndroidUtilities.dp(1.66f) * r9);
        r11 = org.telegram.messenger.AndroidUtilities.lerp(org.telegram.messenger.AndroidUtilities.dp(3.0f), org.telegram.messenger.AndroidUtilities.dp(1.5f), r9);
        r13 = r46.M;
        r13[7] = r11;
        r13[6] = r11;
        r13[1] = r11;
        r13[0] = r11;
        r11 = org.telegram.messenger.AndroidUtilities.dp(1.5f) * r9;
        r13[5] = r11;
        r13[4] = r11;
        r13[3] = r11;
        r13[2] = r11;
        r11 = android.graphics.Path.Direction.CW;
        r3.addRoundRect(r4, r13, r11);
        r4.set(r12);
        r29 = r5;
        r4.left = (org.telegram.messenger.AndroidUtilities.dp(1.66f) * r9) + r12.centerX();
        r10 = org.telegram.messenger.AndroidUtilities.lerp(org.telegram.messenger.AndroidUtilities.dp(3.0f), org.telegram.messenger.AndroidUtilities.dp(1.5f), r9);
        r13 = r46.N;
        r13[5] = r10;
        r13[4] = r10;
        r13[3] = r10;
        r13[2] = r10;
        r10 = org.telegram.messenger.AndroidUtilities.dp(1.5f) * r9;
        r13[7] = r10;
        r13[6] = r10;
        r13[1] = r10;
        r26 = false;
        r13[0] = r10;
        r3.addRoundRect(r4, r13, r11);
        r1.drawPath(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0721, code lost:
    
        r1.setAlpha(r6);
        r6.setAlpha(r6);
        r1.restoreToCount(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x072a, code lost:
    
        if (r2 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x072c, code lost:
    
        r3 = org.telegram.messenger.AndroidUtilities.rectTmp2;
        r3.set((int) (r12.centerX() - ((r2.getIntrinsicWidth() / 2) * 0.9285f)), (int) (r12.centerY() - ((r2.getIntrinsicHeight() / 2) * 0.9285f)), (int) (((r2.getIntrinsicWidth() / 2) * 0.9285f) + r12.centerX()), (int) (((r2.getIntrinsicHeight() / 2) * 0.9285f) + r12.centerY()));
        r2.setBounds(r3);
        r2.setAlpha((int) (r31 * 255.0f));
        r2.draw(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x077a, code lost:
    
        if (r9 == 1.0f) goto L147;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float dp;
        float dpf2;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        ChatActivityEnterView chatActivityEnterView = this.V;
        float f16 = chatActivityEnterView.h4;
        float f17 = f16 <= 0.5f ? f16 / 0.5f : f16 <= 0.75f ? 1.0f - (((f16 - 0.5f) / 0.25f) * 0.1f) : (((f16 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        long currentTimeMillis = System.currentTimeMillis() - this.K;
        this.K = System.currentTimeMillis();
        float f18 = chatActivityEnterView.l4;
        if (f18 != 10000.0f) {
            f7 = Math.max(0, (int) (chatActivityEnterView.k4 - f18));
            if (f7 > AndroidUtilities.dp(57.0f)) {
                f7 = AndroidUtilities.dp(57.0f);
            }
        } else {
            f7 = 0.0f;
        }
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp2(26.0f);
        float dp2 = 1.0f - (f7 / AndroidUtilities.dp(57.0f));
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(194.0f);
        if (chatActivityEnterView.s4) {
            dp = AndroidUtilities.dp(36.0f);
            f10 = 2.0f;
            float b10 = org.telegram.ui.Cells.t0.b(14.0f, dp2, (((1.0f - f17) * AndroidUtilities.dpf2(30.0f)) + (AndroidUtilities.dp(60.0f) + measuredHeight)) - f7);
            dpf2 = AndroidUtilities.dpf2(2.0f) + (((dp / 2.0f) + b10) - AndroidUtilities.dpf2(8.0f));
            AndroidUtilities.dpf2(16.0f);
            AndroidUtilities.dpf2(2.0f);
            float f19 = dp2 > 0.4f ? 1.0f : dp2 / 0.4f;
            float f20 = chatActivityEnterView.n4;
            f11 = com.google.android.gms.internal.cast.a6.D(1.0f, f19, f20 * 15.0f, (1.0f - dp2) * 9.0f * (1.0f - f20));
            f12 = b10;
            f13 = dp2;
        } else {
            f10 = 2.0f;
            dp = AndroidUtilities.dp(36.0f) + ((int) (AndroidUtilities.dp(14.0f) * dp2));
            float dp3 = (chatActivityEnterView.o4 * dp2 * (-AndroidUtilities.dp(8.0f))) + (((AndroidUtilities.dp(60.0f) + measuredHeight) + ((int) ((1.0f - f17) * AndroidUtilities.dp(30.0f)))) - ((int) f7));
            dpf2 = AndroidUtilities.dpf2(2.0f) + (((dp / 2.0f) + dp3) - AndroidUtilities.dpf2(8.0f)) + (AndroidUtilities.dpf2(2.0f) * dp2);
            AndroidUtilities.dpf2(16.0f);
            AndroidUtilities.dpf2(2.0f);
            AndroidUtilities.dpf2(2.0f);
            f11 = (1.0f - dp2) * 9.0f;
            chatActivityEnterView.n4 = 0.0f;
            f12 = dp3;
            f13 = 0.0f;
        }
        float f21 = f11;
        boolean z10 = chatActivityEnterView.e4;
        RectF rectF = this.I;
        if (z10) {
            f14 = 1.0f;
            f15 = dp2;
        } else {
            f14 = 1.0f;
            f15 = dp2;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(250.0f);
        if (this.H != size) {
            this.H = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.n, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                float lineWidth = this.f.getLineWidth(i12);
                if (lineWidth > this.h) {
                    this.h = lineWidth;
                }
            }
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i10) {
        return super.onSetAlpha(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.V;
        RectF rectF = chatActivityEnterView.S3;
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.J;
        if (action == 0) {
            if (chatActivityEnterView.s4) {
                this.U = rectF.contains(x10, y3);
            }
            if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.n4 > 0.1f) {
                this.T = rectF2.contains(x10, y3);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.U && rectF.contains(x10, y3)) {
                if (chatActivityEnterView.c1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.Z2.i1();
                } else {
                    pg pgVar = new pg(this, 0);
                    ei.x3 x3Var = this.a;
                    if (x3Var != null && x3Var.V) {
                        a();
                    }
                    dl0 dl0Var = chatActivityEnterView.h1;
                    if (dl0Var != null) {
                        dl0Var.setPlaying(false);
                    }
                    if (!MediaController.getInstance().isRecordingPaused() || (chatActivityEnterView.h1.getAudioLeft() <= 0.01f && chatActivityEnterView.h1.getAudioRight() >= 0.99f)) {
                        pgVar.run();
                    } else {
                        ee eeVar = new ee(2, this, pgVar);
                        if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, chatActivityEnterView.W3);
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.RecordingTrimTitle);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.RecordingTrimText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new s(eeVar, 19));
                            i0.a.r(R.string.Cancel, alertDialog$Builder, null);
                        } else {
                            eeVar.run();
                        }
                    }
                }
                this.T = false;
                this.U = false;
                return true;
            }
            if (this.T && rectF2.contains(x10, y3)) {
                boolean z10 = !chatActivityEnterView.O;
                chatActivityEnterView.O = z10;
                this.y.d(1, z10, true);
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                long j10 = chatActivityEnterView.Q2;
                org.telegram.ui.sn snVar = chatActivityEnterView.P2;
                mediaDataController.toggleDraftVoiceOnce(j10, (snVar == null || !snVar.h4) ? 0L : snVar.d(), chatActivityEnterView.O);
                if (chatActivityEnterView.O) {
                    b();
                } else {
                    a();
                }
                invalidate();
                this.T = false;
                this.U = false;
                return true;
            }
            this.T = false;
            this.U = false;
        } else if (motionEvent.getAction() == 3) {
            this.T = false;
            this.U = false;
        }
        return this.U || this.T;
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
    }

    public void setBlurredBackgroundFactory(bh.b bVar) {
        this.Q = true;
        if (this.P == null) {
            this.P = new eh.b(org.telegram.ui.ActionBar.h6.ae, this.V.W3);
        }
        dh.d c10 = bVar.c(this, this.P, false);
        this.R = c10;
        c10.q(AndroidUtilities.dp(18.0f));
        this.R.p(AndroidUtilities.dp(3.0f));
        dh.d c11 = bVar.c(this, this.P, false);
        this.S = c11;
        c11.q(AndroidUtilities.dp(18.0f));
        this.S.p(AndroidUtilities.dp(3.0f));
        c();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.y || super.verifyDrawable(drawable);
    }
}
