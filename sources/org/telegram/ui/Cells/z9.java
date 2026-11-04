package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import b8.mf;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class z9 extends LinearLayout {
    public final f E;
    public Drawable F;
    public boolean G;
    public final org.telegram.ui.Components.u5 H;
    public org.telegram.ui.Components.h9 a;
    public org.telegram.ui.Components.h9 b;
    public Drawable c;
    public Drawable d;
    public ColorDrawable e;
    public boolean f;
    public boolean h;
    public final q1[] n;
    public final Drawable r;
    public final org.telegram.ui.ActionBar.q4 s;
    public final int w;
    public org.telegram.ui.ActionBar.d2 x;
    public int y;

    public z9(Context context, org.telegram.ui.ActionBar.q4 q4Var, int i3) {
        this(context, q4Var, i3, 0L, null);
    }

    private Drawable getCompactBackground() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ua, false);
        ColorDrawable colorDrawable = this.e;
        if (colorDrawable == null || colorDrawable.getColor() != x02) {
            this.e = new ColorDrawable(x02);
        }
        return this.e;
    }

    public final boolean a() {
        int i3 = this.w;
        return i3 == 3 || i3 == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.w == 2 || a()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public q1[] getCells() {
        return this.n;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i3 = 0;
        while (true) {
            q1[] q1VarArr = this.n;
            if (i3 >= q1VarArr.length) {
                return;
            }
            q1VarArr[i3].invalidate();
            i3++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.F;
        if (drawable instanceof zm) {
            ((zm) drawable).f(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.h9 h9Var = this.a;
        if (h9Var != null) {
            h9Var.dispose();
            this.a = null;
        }
        org.telegram.ui.Components.h9 h9Var2 = this.b;
        if (h9Var2 != null) {
            h9Var2.dispose();
            this.b = null;
        }
        Drawable drawable = this.F;
        if (drawable instanceof zm) {
            ((zm) drawable).g(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.F;
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.k6.t0();
        }
        if (org.telegram.ui.ActionBar.k6.d != null) {
            invalidate();
        }
        boolean z10 = this.F == null && az.H0;
        if (z10) {
            drawable = getCompactBackground();
        }
        if (this.f != z10) {
            this.f = z10;
            this.h = this.c != null;
        }
        Drawable drawable2 = this.c;
        org.telegram.ui.Components.u5 u5Var = this.H;
        if (drawable != drawable2 && drawable != null) {
            if (org.telegram.ui.ActionBar.k6.h1() || this.G || this.h) {
                this.d = this.c;
                this.b = this.a;
            } else {
                org.telegram.ui.Components.h9 h9Var = this.a;
                if (h9Var != null) {
                    h9Var.dispose();
                    this.a = null;
                }
            }
            this.c = drawable;
            u5Var.e(true, 0.0f);
        }
        boolean z11 = this.G;
        org.telegram.ui.ActionBar.q4 q4Var = this.s;
        float e10 = (z11 || this.h) ? u5Var.e(false, 1.0f) : q4Var.getThemeAnimationValue();
        int i3 = 0;
        while (i3 < 2) {
            Drawable drawable3 = i3 == 0 ? this.d : this.c;
            if (drawable3 != null) {
                int i10 = (i3 != 1 || this.d == null || (q4Var == null && !this.G)) ? hs.e4 : (int) (255.0f * e10);
                if (i10 > 0) {
                    drawable3.setAlpha(i10);
                    if ((drawable3 instanceof ColorDrawable) || (drawable3 instanceof GradientDrawable) || (drawable3 instanceof la0)) {
                        drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable3 instanceof org.telegram.ui.Components.j9) {
                            this.a = ((org.telegram.ui.Components.j9) drawable3).c(canvas, this);
                        } else {
                            drawable3.draw(canvas);
                        }
                    } else if (drawable3 instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                        bitmapDrawable.setFilterBitmap(true);
                        if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f10 = 2.0f / org.telegram.messenger.g0.p;
                            canvas.scale(f10, f10);
                            drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                        } else {
                            int measuredHeight = getMeasuredHeight();
                            float max = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                            int ceil = (int) Math.ceil(drawable3.getIntrinsicWidth() * max);
                            int ceil2 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max);
                            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                            int i11 = (measuredHeight - ceil2) / 2;
                            canvas.save();
                            canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                            drawable3.setBounds(measuredWidth, i11, ceil + measuredWidth, ceil2 + i11);
                        }
                        drawable3.draw(canvas);
                        canvas.restore();
                    } else {
                        gi.f7.j(canvas, drawable3, getWidth(), getHeight());
                    }
                    if (i3 == 0 && this.d != null && e10 >= 1.0f) {
                        org.telegram.ui.Components.h9 h9Var2 = this.b;
                        if (h9Var2 != null) {
                            h9Var2.dispose();
                            this.b = null;
                        }
                        this.d = null;
                        this.h = false;
                        invalidate();
                    }
                }
            }
            i3++;
        }
        if ((getParent() instanceof tj0) && ((tj0) getParent()).b1()) {
            return;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.r;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.w == 2 || a()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.w == 2 || a()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setOverrideBackground(Drawable drawable) {
        this.F = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.F instanceof zm) && isAttachedToWindow()) {
            ((zm) this.F).f(this);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.F || drawable == this.d || super.verifyDrawable(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0489 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z9(Context context, org.telegram.ui.ActionBar.q4 q4Var, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        String str;
        zi ziVar;
        zi ziVar2;
        int i11;
        q1[] q1VarArr;
        Context context2 = context;
        int i12 = i3;
        this.n = new q1[2];
        this.y = -1;
        this.E = new f(this, 10);
        this.H = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
        this.w = i12;
        int i13 = h10.t0;
        this.s = q4Var;
        setWillNotDraw(false);
        setOrientation(1);
        setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
        this.r = org.telegram.ui.ActionBar.k6.X0(context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.b7, e6Var2));
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i12 == 3) {
            boolean z10 = j10 < 0;
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = bd.M0(z10 ? 2131752433 : 2131743761, null);
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 1;
            if (j10 == 0) {
                tL_messageReplyHeader.reply_to_peer_id = new TLRPC.TL_peerUser();
                tL_message.reply_to.reply_to_peer_id.user_id = h10.i(h10.t0).e();
            } else {
                tL_messageReplyHeader.reply_to_peer_id = new TLRPC.TL_peerChannel();
                tL_message.reply_to.reply_to_peer_id.channel_id = -j10;
            }
            TLRPC.Message message = new TLRPC.Message();
            tL_message.replyMessage = message;
            message.media = new TLRPC.TL_messageMediaEmpty();
            if (j10 == 0) {
                tL_message.replyMessage.from_id = new TLRPC.TL_peerUser();
                tL_message.replyMessage.from_id.user_id = h10.i(h10.t0).e();
                tL_message.replyMessage.peer_id = new TLRPC.TL_peerUser();
                tL_message.replyMessage.peer_id.user_id = h10.i(h10.t0).e();
            } else {
                tL_message.replyMessage.from_id = new TLRPC.TL_peerChannel();
                TLRPC.Message message2 = tL_message.replyMessage;
                long j11 = -j10;
                message2.from_id.channel_id = j11;
                message2.peer_id = new TLRPC.TL_peerChannel();
                tL_message.replyMessage.peer_id.channel_id = j11;
            }
            tL_message.replyMessage.message = bd.M0(z10 ? 2131752430 : 2131743758, null);
            TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
            tL_message.media = tL_messageMediaWebPage;
            tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
            TLRPC.WebPage webPage = tL_message.media.webpage;
            webPage.embed_url = "https://telegram.org/";
            webPage.flags |= 2;
            webPage.site_name = bd.M0(R.string.AppName, null);
            TLRPC.WebPage webPage2 = tL_message.media.webpage;
            webPage2.flags |= 4;
            webPage2.title = bd.M0(z10 ? 2131752431 : 2131743759, null);
            TLRPC.WebPage webPage3 = tL_message.media.webpage;
            webPage3.flags |= 8;
            webPage3.description = bd.M0(z10 ? 2131752432 : 2131743760, null);
            tL_message.date = currentTimeMillis - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = hs.i4;
            if (j10 == 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = h10.i(h10.t0).e();
            } else {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = -j10;
            }
            tL_message.id = 1;
            tL_message.out = false;
            if (j10 == 0) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = 0L;
            } else {
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = -j10;
            }
            zi ziVar3 = new zi(h10.t0, tL_message, true, false);
            ziVar3.u1 = true;
            ziVar3.j2 = true;
            ziVar3.Q1 = false;
            ziVar3.T = 1L;
            ziVar2 = ziVar3;
        } else if (i12 == 2) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = bd.M0(2131751354, null);
            tL_message2.date = currentTimeMillis - 3540;
            tL_message2.dialog_id = 1L;
            tL_message2.flags = hs.i4;
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_message2.from_id = tL_peerUser3;
            tL_peerUser3.user_id = h10.i(h10.t0).e();
            tL_message2.id = 1;
            tL_message2.media = new TLRPC.TL_messageMediaEmpty();
            tL_message2.out = false;
            TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
            tL_message2.peer_id = tL_peerUser4;
            tL_peerUser4.user_id = 0L;
            ziVar2 = new zi(h10.t0, tL_message2, true, false);
            ziVar2.Q1 = false;
            ziVar2.T = 1L;
            ziVar2.G = bd.M0(2131751352, null);
            ziVar2.k2 = context2.getDrawable(R.drawable.dino_pic);
            ziVar2.c1 = 5;
            ziVar2.d1 = 0L;
        } else {
            TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
            if (i12 == 0) {
                tL_message3.message = bd.M0(2131750606, null);
            } else {
                tL_message3.message = bd.M0(2131748262, null);
            }
            int indexOf = tL_message3.message.indexOf("👋");
            if (indexOf >= 0) {
                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                tL_messageEntityCustomEmoji.offset = indexOf;
                tL_messageEntityCustomEmoji.length = 2;
                tL_messageEntityCustomEmoji.document_id = 5386654653003864312L;
                tL_message3.entities.add(tL_messageEntityCustomEmoji);
            }
            int i14 = currentTimeMillis - 3540;
            tL_message3.date = i14;
            tL_message3.dialog_id = 1L;
            tL_message3.flags = hs.i4;
            TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
            tL_message3.from_id = tL_peerUser5;
            tL_peerUser5.user_id = h10.i(h10.t0).e();
            tL_message3.id = 1;
            tL_message3.media = new TLRPC.TL_messageMediaEmpty();
            tL_message3.out = true;
            TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
            tL_message3.peer_id = tL_peerUser6;
            tL_peerUser6.user_id = 0L;
            zi ziVar4 = new zi(h10.t0, tL_message3, true, false);
            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
            if (i12 == 0) {
                tL_message4.message = bd.M0(2131750608, null);
            } else {
                String M0 = bd.M0(2131748264, null);
                StringBuilder sb2 = new StringBuilder(M0);
                int indexOf2 = M0.indexOf(42);
                int lastIndexOf = M0.lastIndexOf(42);
                if (indexOf2 != -1 && lastIndexOf != -1) {
                    sb2.replace(lastIndexOf, lastIndexOf + 1, "");
                    sb2.replace(indexOf2, indexOf2 + 1, "");
                    TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                    tL_messageEntityTextUrl.offset = indexOf2;
                    tL_messageEntityTextUrl.length = (lastIndexOf - indexOf2) - 1;
                    tL_messageEntityTextUrl.url = "https://telegram.org";
                    tL_message4.entities.add(tL_messageEntityTextUrl);
                }
                tL_message4.message = sb2.toString();
            }
            int indexOf3 = tL_message4.message.indexOf("😎");
            if (indexOf3 >= 0) {
                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = new TLRPC.TL_messageEntityCustomEmoji();
                tL_messageEntityCustomEmoji2.offset = indexOf3;
                tL_messageEntityCustomEmoji2.length = 2;
                tL_messageEntityCustomEmoji2.document_id = 5373141891321699086L;
                tL_message4.entities.add(tL_messageEntityCustomEmoji2);
            }
            tL_message4.date = currentTimeMillis - 2640;
            tL_message4.dialog_id = 1L;
            tL_message4.flags = hs.i4;
            TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
            tL_message4.from_id = tL_peerUser7;
            tL_peerUser7.user_id = h10.i(h10.t0).e();
            tL_message4.id = 1;
            tL_message4.media = new TLRPC.TL_messageMediaEmpty();
            tL_message4.out = true;
            TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
            tL_message4.peer_id = tL_peerUser8;
            tL_peerUser8.user_id = 0L;
            zi ziVar5 = new zi(h10.t0, tL_message4, true, false);
            ziVar5.Q1 = false;
            ziVar5.c1 = 5;
            ziVar5.d1 = 0L;
            ziVar5.T = 1L;
            TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
            if (i12 == 0) {
                tL_message5.message = bd.M0(2131750609, null);
            } else {
                tL_message5.message = bd.M0(2131748265, null);
            }
            tL_message5.date = i14;
            tL_message5.dialog_id = 1L;
            tL_message5.flags = hs.o4;
            tL_message5.from_id = new TLRPC.TL_peerUser();
            tL_message5.id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
            tL_message5.reply_to = tL_messageReplyHeader2;
            tL_messageReplyHeader2.flags |= 16;
            tL_messageReplyHeader2.reply_to_msg_id = 5;
            tL_message5.media = new TLRPC.TL_messageMediaEmpty();
            i10 = 0;
            tL_message5.out = false;
            TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
            tL_message5.peer_id = tL_peerUser9;
            tL_peerUser9.user_id = h10.i(h10.t0).e();
            zi ziVar6 = new zi(h10.t0, tL_message5, true, false);
            if (i12 == 0) {
                str = null;
            } else {
                str = null;
                ziVar6.B0 = bd.M0(2131748263, null);
            }
            ziVar6.T = 1L;
            ziVar6.Q1 = false;
            ziVar6.C = ziVar4;
            if (i12 == 4) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                String M02 = bd.M0(2131749403, str);
                tL_user.first_name = M02;
                ziVar6.G = M02;
                ziVar6.k2 = new org.telegram.ui.Components.u8(0, tL_user);
            }
            ziVar = ziVar6;
            ziVar2 = ziVar5;
            i11 = i10;
            while (true) {
                q1VarArr = this.n;
                if (i11 < q1VarArr.length) {
                    return;
                }
                int i15 = i12;
                q1VarArr[i11] = new y9(this, context2, i13, e6Var2, context, i15);
                this.n[i11].setDelegate(new hi.d(this, 28));
                q1 q1Var = this.n[i11];
                q1Var.e6 = (i15 == 2 || i15 == 4) ? 1 : i10;
                q1Var.setFullyDraw(true);
                zi ziVar7 = i11 == 0 ? ziVar : ziVar2;
                if (ziVar7 != null) {
                    this.n[i11].u3(ziVar7, null, false, false, false, false);
                    addView(this.n[i11], mf.o(-1, -2));
                }
                i11++;
                context2 = context;
                e6Var2 = e6Var;
                i12 = i15;
            }
        }
        ziVar = null;
        i10 = 0;
        i11 = i10;
        while (true) {
            q1VarArr = this.n;
            if (i11 < q1VarArr.length) {
            }
            i11++;
            context2 = context;
            e6Var2 = e6Var;
            i12 = i15;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z10) {
    }
}
