// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bv8 extends jf0 implements fn7, snb {
    public final v41 A0;
    public final RectF B0;
    public final og2 C0;
    public boolean D0;
    public TLRPC.User E;
    public pcc E0;
    public TLRPC.Chat F;
    public icc F0;
    public TLRPC.EncryptedChat G;
    public boolean G0;
    public iv2 H;
    public TextPaint H0;
    public long I;
    public TextPaint I0;
    public String J;
    public boolean J0;
    public int K;
    public final v41 K0;
    public TLRPC.FileLocation L;
    public final Paint L0;
    public boolean M;
    public final RectF M0;
    public boolean N;
    public pkb N0;
    public final int O;
    public boolean O0;
    public int P;
    public boolean P0;
    public int Q;
    public al8 Q0;
    public StaticLayout R;
    public Drawable R0;
    public boolean S;
    public int S0;
    public int T;
    public int U;
    public int V;
    public za1 W;
    public StaticLayout a0;
    public int b0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f;
    public int f0;
    public final int g0;
    public e88 h;
    public int h0;
    public int i0;
    public StaticLayout j0;
    public boolean[] k0;
    public boolean l0;
    public boolean m0;
    public CharSequence n;
    public boolean n0;
    public final mm o0;
    public boolean p0;
    public long q0;
    public final ImageReceiver r;
    public boolean r0;
    public final rb0 s;
    public int s0;
    public StaticLayout t0;
    public final ul u0;
    public final ul v0;
    public CharSequence w;
    public final q6b w0;
    public final vnb x;
    public final RectF x0;
    public TLRPC.TL_sponsoredPeer y;
    public pkb y0;
    public Paint z0;

    public bv8(Context context, vnb vnbVar) {
        super(context);
        this.O = yac.t0;
        this.g0 = hl.L(19.0f);
        this.o0 = new mm(this, 0L, 350L, k43.h);
        this.w0 = new q6b(null, false);
        this.x0 = new RectF();
        this.A0 = new v41(this);
        this.B0 = new RectF();
        this.J0 = true;
        this.K0 = new v41(this);
        this.L0 = new Paint(1);
        this.M0 = new RectF();
        this.S0 = yob.b;
        this.x = vnbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.q0(hl.L(23.0f));
        this.s = new rb0((vnb) null);
        og2 og2Var = new og2(21, vnbVar, context);
        this.C0 = og2Var;
        og2Var.b(-1, aob.d6, aob.k7);
        og2Var.setDrawUnchecked(false);
        og2Var.setDrawBackgroundAsArc(3);
        addView(og2Var);
        ul ulVar = new ul(hl.L(20.0f), this);
        this.u0 = ulVar;
        ulVar.setCallback(this);
        ul ulVar2 = new ul(hl.L(20.0f), this);
        this.v0 = ulVar2;
        ulVar2.setCallback(this);
    }

    public final void A(boolean z, boolean z2) {
        og2 og2Var = this.C0;
        if (og2Var == null) {
            return;
        }
        og2Var.a(z, z2);
    }

    public final void C(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.n = charSequence;
        boolean z3 = obj instanceof TLRPC.User;
        int i = this.O;
        TL_account.RequirementToContact requirementToContact = null;
        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
        requirementToContact = null;
        if (z3) {
            this.E = (TLRPC.User) obj;
            this.F = null;
            this.H = null;
            TL_account.RequirementToContact P2 = this.n0 ? uc7.s1(i).P2(this.E.id) : null;
            this.p0 = P2 instanceof TL_account.requirementToContactPremium;
            this.q0 = wf3.j(P2);
            setOpenBotButton(this.D0 && this.E.bot_has_main_app);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.F = chat;
            this.E = null;
            this.H = null;
            if (chat.send_paid_messages_stars != 0) {
                requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
            }
            this.p0 = false;
            this.q0 = wf3.j(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof iv2) {
            iv2 iv2Var = (iv2) obj;
            this.H = iv2Var;
            this.F = null;
            this.E = null;
            if (this.n0 && iv2Var.m != null) {
                requirementToContact = uc7.s1(i).P2(this.H.m.id);
            }
            this.p0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.q0 = wf3.j(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.G = encryptedChat;
        this.w = charSequence2;
        this.e0 = z;
        this.M = z2;
        D(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(int i) {
        Drawable drawable;
        TLRPC.FileLocation fileLocation;
        int L;
        TLRPC.Dialog dialog;
        String j;
        boolean z;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation2;
        Drawable drawable2;
        TLRPC.User user2 = this.E;
        ImageReceiver imageReceiver = this.r;
        int i2 = this.O;
        rb0 rb0Var = this.s;
        TLRPC.FileLocation fileLocation3 = null;
        if (user2 != null) {
            rb0Var.q(user2);
            if (lbc.B(this.E)) {
                rb0Var.f(12);
                imageReceiver.d0(null, null, rb0Var, null, null, 0);
            } else if (this.M) {
                rb0Var.f(1);
                imageReceiver.d0(null, null, rb0Var, null, null, 0);
            } else {
                TLRPC.User user3 = this.E;
                TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                if (userProfilePhoto != null) {
                    fileLocation3 = userProfilePhoto.photo_small;
                    Drawable drawable3 = userProfilePhoto.strippedBitmap;
                    if (drawable3 != null) {
                        drawable2 = drawable3;
                        fileLocation = fileLocation3;
                        imageReceiver.a0(jn5.m(i2, 1, user3), "50_50", jn5.m(yac.t0, 2, this.E), "50_50", drawable2, this.E, 0);
                        fileLocation3 = fileLocation;
                    }
                }
                drawable2 = rb0Var;
                fileLocation = fileLocation3;
                imageReceiver.a0(jn5.m(i2, 1, user3), "50_50", jn5.m(yac.t0, 2, this.E), "50_50", drawable2, this.E, 0);
                fileLocation3 = fileLocation;
            }
        } else {
            TLRPC.Chat chat = this.F;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    fileLocation3 = chatPhoto.photo_small;
                    Drawable drawable4 = chatPhoto.strippedBitmap;
                    if (drawable4 != null) {
                        drawable = drawable4;
                        fileLocation = fileLocation3;
                        if (chat.monoforum) {
                            rb0Var.p(chat);
                            imageReceiver.a0(jn5.m(i2, 1, this.F), "50_50", jn5.m(yac.t0, 2, this.F), "50_50", drawable, this.F, 0);
                        } else {
                            ro4.p(i2, chat, rb0Var, imageReceiver);
                        }
                        fileLocation3 = fileLocation;
                    }
                }
                drawable = rb0Var;
                fileLocation = fileLocation3;
                if (chat.monoforum) {
                }
                fileLocation3 = fileLocation;
            } else {
                iv2 iv2Var = this.H;
                if (iv2Var != null) {
                    rb0Var.j(0L, iv2Var.i, iv2Var.j, null);
                    imageReceiver.d0(null, null, rb0Var, null, null, 0);
                } else {
                    rb0Var.j(0L, null, null, null);
                    imageReceiver.d0(null, null, rb0Var, null, null, 0);
                }
            }
        }
        if (xc2.Y(this.F)) {
            int L2 = hl.L(46.0f);
            Rect rect = br3.a;
            L = (L2 * 20) / 72;
        } else {
            TLRPC.Chat chat2 = this.F;
            if (chat2 == null || !chat2.monoforum) {
                L = hl.L(this.P0 ? 10.0f : (chat2 == null || !chat2.forum) ? 23.0f : 16.0f);
            } else {
                L = 0;
            }
        }
        imageReceiver.q0(L);
        if (i != 0) {
            int i3 = uc7.s5;
            boolean z2 = !(((i & 2) == 0 || this.E == null) && ((i & 8) == 0 || this.F == null)) && ((fileLocation2 = this.L) == null ? fileLocation3 != null : !(fileLocation3 != null && fileLocation2.volume_id == fileLocation3.volume_id && fileLocation2.local_id == fileLocation3.local_id));
            if (!z2 && (i & 4) != 0 && (user = this.E) != null) {
                TLRPC.UserStatus userStatus = user.status;
                if ((userStatus != null ? userStatus.expires : 0) != this.K) {
                    z2 = true;
                }
            }
            if (!z2 && (524288 & i) != 0) {
                TLRPC.User user4 = this.E;
                if (user4 == null) {
                    TLRPC.Chat chat3 = this.F;
                    if (chat3 != null) {
                        z = chat3.verified;
                    }
                } else {
                    z = user4.verified;
                }
                E(z, user4, this.F, true);
            }
            if ((!z2 && (i & 1) != 0 && this.E != null) || ((i & 16) != 0 && this.F != null)) {
                if (this.E != null) {
                    j = this.E.first_name + this.E.last_name;
                } else {
                    TLRPC.Chat chat4 = this.F;
                    j = chat4.monoforum ? ro4.j(i2, chat4, false) : chat4.title;
                }
                if (!j.equals(this.J)) {
                    z2 = true;
                }
            }
            if (!((z2 || !this.e0 || (i & 256) == 0 || (dialog = (TLRPC.Dialog) uc7.s1(i2).R.f(this.I)) == null || uc7.s1(i2).V0(dialog) == this.f0) ? z2 : true)) {
                return;
            }
        }
        TLRPC.User user5 = this.E;
        if (user5 != null) {
            TLRPC.UserStatus userStatus2 = user5.status;
            if (userStatus2 != null) {
                this.K = userStatus2.expires;
            } else {
                this.K = 0;
            }
            this.J = this.E.first_name + this.E.last_name;
        } else {
            TLRPC.Chat chat5 = this.F;
            if (chat5 != null) {
                this.J = chat5.monoforum ? ro4.j(i2, chat5, false) : chat5.title;
            }
        }
        this.L = fileLocation3;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            requestLayout();
        } else {
            y();
        }
        postInvalidate();
    }

    public final void E(boolean z, TLRPC.User user, TLRPC.Chat chat, boolean z2) {
        boolean z3 = ob6.a0;
        ul ulVar = this.v0;
        ulVar.a = z3;
        int i = this.O;
        vnb vnbVar = this.x;
        if (user == null || this.G != null || this.M || !uc7.s1(i).r2(user.id)) {
            if (this.J0) {
                if (z) {
                    ulVar.g(new zm2(aob.e1, aob.i1, 0, 0), z2);
                    ulVar.k(null);
                } else if (user != null && !this.M && wf3.f(user.emoji_status) != 0) {
                    ulVar.j(wf3.f(user.emoji_status), z2);
                    ulVar.k(Integer.valueOf(aob.v0(aob.z9, vnbVar)));
                }
            }
            if (!this.J0 || chat == null || this.M || wf3.f(chat.emoji_status) == 0) {
                if (this.J0 && user != null && !this.M) {
                    uc7.s1(i);
                    if (uc7.F2(user)) {
                        ulVar.g(bl8.d().e, z2);
                        ulVar.k(Integer.valueOf(aob.v0(aob.z9, vnbVar)));
                    }
                }
                ulVar.g(null, z2);
                ulVar.k(Integer.valueOf(aob.v0(aob.z9, vnbVar)));
            } else {
                ulVar.j(wf3.f(chat.emoji_status), z2);
                ulVar.k(Integer.valueOf(aob.v0(aob.z9, vnbVar)));
            }
        } else {
            ulVar.g(null, z2);
            ulVar.k(Integer.valueOf(aob.v0(aob.z9, vnbVar)));
        }
        long c = user != null ? wf3.c(user) : chat != null ? wf3.c(chat) : 0L;
        ul ulVar2 = this.u0;
        if (c == 0 || this.M) {
            ulVar2.g(null, z2);
        } else {
            ulVar2.j(c, z2);
        }
        ulVar2.k(Integer.valueOf(aob.v0(aob.z9, vnbVar)));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.z9));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.Z8));
        hashSet.add(Integer.valueOf(aob.X8));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.p6));
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            invalidate();
            return;
        }
        if (i == jn7.k3) {
            TLRPC.User user = this.E;
            TL_account.RequirementToContact requirementToContact = null;
            requirementToContact = null;
            requirementToContact = null;
            requirementToContact = null;
            int i3 = this.O;
            if (user == null) {
                TLRPC.Chat chat = this.F;
                if (chat == null) {
                    iv2 iv2Var = this.H;
                    if (iv2Var == null) {
                        return;
                    }
                    if (this.n0 && iv2Var.m != null) {
                        requirementToContact = uc7.s1(i3).P2(this.H.m.id);
                    }
                } else if (chat.send_paid_messages_stars != 0) {
                    TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                    requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
                    requirementToContact = requirementtocontactpaidmessages;
                }
            } else if (this.n0) {
                requirementToContact = uc7.s1(i3).P2(this.E.id);
            }
            boolean z = requirementToContact instanceof TL_account.requirementToContactPremium;
            if (this.p0 == z && this.q0 == wf3.j(requirementToContact)) {
                return;
            }
            this.p0 = z;
            this.q0 = wf3.j(requirementToContact);
            invalidate();
        }
    }

    public TLRPC.Chat getChat() {
        return this.F;
    }

    public long getDialogId() {
        return this.I;
    }

    public TLRPC.User getUser() {
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.I();
        jn7.e().b(this, jn7.l4);
        if (this.n0) {
            jn7.e().b(this, jn7.k3);
        }
        this.v0.a();
        this.u0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.K();
        jn7.e().n(this, jn7.l4);
        if (this.n0) {
            jn7.e().n(this, jn7.k3);
        }
        this.v0.b();
        this.u0.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        al8 al8Var;
        int ceil;
        if (this.E == null && this.F == null && this.G == null && this.H == null) {
            return;
        }
        boolean z = this.N;
        vnb vnbVar = this.x;
        if (z) {
            Paint d = (!this.G0 || vnbVar == null) ? null : vnbVar.d("paintDivider");
            if (d == null) {
                d = aob.j0;
            }
            Paint paint = d;
            if (ob6.a0) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - hl.L(hl.C), getMeasuredHeight() - 1, paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(hl.L(hl.C), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
            }
        } else {
            canvas2 = canvas;
        }
        if (this.S) {
            jf0.u(this.T, this.U, aob.Z0);
            aob.Z0.draw(canvas2);
        }
        StaticLayout staticLayout = this.R;
        if (staticLayout != null) {
            boolean z2 = ob6.a0;
            ul ulVar = this.u0;
            if (z2) {
                ceil = (int) (staticLayout.getLineRight(0) + this.P + hl.L(6.0f));
            } else if (staticLayout.getLineLeft(0) == 0.0f) {
                ceil = (this.P - hl.L(3.0f)) - ulVar.s;
            } else {
                f = 6.0f;
                ceil = (int) ((((this.P + this.V) - Math.ceil(this.R.getLineWidth(0))) - hl.L(3.0f)) - ulVar.s);
                jf0.w(ulVar, ceil, ((this.R.getHeight() - ulVar.s) / 2.0f) + this.Q);
                ulVar.draw(canvas2);
                canvas2.save();
                canvas2.translate(this.P, this.Q);
                this.R.draw(canvas2);
                canvas2.restore();
                boolean z3 = ob6.a0;
                ul ulVar2 = this.v0;
                jf0.w(ulVar2, !z3 ? this.R.getLineLeft(0) == 0.0f ? (this.P - hl.L(3.0f)) - ulVar2.s : (int) ((((this.P + this.V) - Math.ceil(this.R.getLineWidth(0))) - hl.L(3.0f)) - ulVar2.s) : (int) (this.R.getLineRight(0) + this.P + hl.L(f)), ((this.R.getHeight() - ulVar2.s) / 2.0f) + this.Q);
                ulVar2.draw(canvas2);
                if (this.m0) {
                    yt9 yt9Var = aob.h1;
                    int L = ob6.a0 ? this.R.getLineLeft(0) == 0.0f ? (this.P - hl.L(f)) - yt9Var.getIntrinsicWidth() : (int) ((((this.P + this.V) - Math.ceil(this.R.getLineWidth(0))) - hl.L(f)) - yt9Var.getIntrinsicWidth()) : (int) (this.R.getLineRight(0) + this.P + hl.L(f));
                    float f6 = this.Q;
                    int height = this.R.getHeight();
                    yt9Var.getClass();
                    jf0.w(yt9Var, L, ((height - hl.L(16.0f)) / 2.0f) + f6);
                    yt9Var.draw(canvas2);
                }
            }
            f = 6.0f;
            jf0.w(ulVar, ceil, ((this.R.getHeight() - ulVar.s) / 2.0f) + this.Q);
            ulVar.draw(canvas2);
            canvas2.save();
            canvas2.translate(this.P, this.Q);
            this.R.draw(canvas2);
            canvas2.restore();
            boolean z32 = ob6.a0;
            ul ulVar22 = this.v0;
            jf0.w(ulVar22, !z32 ? this.R.getLineLeft(0) == 0.0f ? (this.P - hl.L(3.0f)) - ulVar22.s : (int) ((((this.P + this.V) - Math.ceil(this.R.getLineWidth(0))) - hl.L(3.0f)) - ulVar22.s) : (int) (this.R.getLineRight(0) + this.P + hl.L(f)), ((this.R.getHeight() - ulVar22.s) / 2.0f) + this.Q);
            ulVar22.draw(canvas2);
            if (this.m0) {
            }
        } else {
            f = 6.0f;
        }
        if (this.y == null || this.y0 == null || this.z0 == null) {
            f2 = 16.0f;
            f3 = 2.0f;
        } else {
            int v0 = aob.v0(aob.Fi, vnbVar);
            this.z0.setColor(aob.p1(0.1f, v0));
            int L2 = hl.L(12.66f) + ((int) this.y0.j());
            int L3 = hl.L(17.33f);
            float L4 = ob6.a0 ? hl.L(12.0f) : qu6.x(12.0f, getWidth(), L2);
            int i = this.Q;
            f2 = 16.0f;
            f3 = 2.0f;
            RectF rectF = this.x0;
            rectF.set(L4, i, r6 + L2, i + L3);
            rectF.inset(-hl.L(f), -hl.L(f));
            canvas2.save();
            float a = this.A0.a(0.1f);
            canvas2.scale(a, a, rectF.centerX(), rectF.centerY());
            canvas2.translate(L4, this.Q);
            RectF rectF2 = hl.P;
            float f7 = L3;
            rectF2.set(0.0f, 0.0f, L2, f7);
            float f8 = f7 / 2.0f;
            canvas2.drawRoundRect(rectF2, f8, f8, this.z0);
            this.y0.c(hl.L(6.33f), f8, 1.0f, v0, canvas);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.t0 != null) {
            canvas2.save();
            canvas2.translate(this.s0 + this.c0, hl.L(this.O0 ? 35.0f : 33.0f) + this.d0);
            this.t0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.j0;
        int i2 = this.g0;
        if (staticLayout2 != null) {
            int L5 = this.h0 - hl.L(5.5f);
            float L6 = hl.L(11.0f) + L5 + this.i0;
            float L7 = hl.L(23.0f) + i2;
            RectF rectF3 = this.B0;
            rectF3.set(L5, i2, L6, L7);
            float f9 = hl.p * 11.5f;
            f4 = 23.0f;
            f5 = 4.0f;
            canvas2.drawRoundRect(rectF3, f9, f9, uc7.s1(this.O).p2(this.I, 0L, null) ? aob.x0 : aob.v0);
            canvas2.save();
            canvas2.translate(this.h0, hl.L(4.0f) + i2);
            this.j0.draw(canvas2);
            canvas2.restore();
        } else {
            f4 = 23.0f;
            f5 = 4.0f;
        }
        if (this.a0 != null) {
            za1 za1Var = this.W;
            int w0 = aob.w0(null, aob.U8, false);
            int w02 = aob.w0(null, aob.W8, false);
            za1Var.g.setColor(w0);
            hf0 hf0Var = za1Var.e;
            if (hf0Var != null) {
                aob.F1(hf0Var, w02, true);
            }
            RectF rectF4 = hl.P;
            rectF4.set(this.b0, i2, this.a0.getWidth() + r4, hl.L(f4) + i2);
            rectF4.inset(-hl.L(f2), -hl.L(f5));
            za1 za1Var2 = this.W;
            za1Var2.i = false;
            za1Var2.c = 0;
            za1Var2.a(rectF4);
            za1 za1Var3 = this.W;
            za1Var3.n = true;
            za1Var3.c(canvas2, za1Var3.g);
            hf0 hf0Var2 = za1Var3.e;
            if (hf0Var2 != null) {
                hf0Var2.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate(this.b0, hl.L(f5) + i2);
            this.a0.draw(canvas2);
            canvas2.restore();
        }
        boolean z4 = this.f;
        ImageReceiver imageReceiver = this.r;
        if (!z4) {
            TLRPC.Chat chat = this.F;
            q6b q6bVar = this.w0;
            if (chat == null || !chat.monoforum) {
                TLRPC.User user = this.E;
                if (user != null) {
                    t6b.h(user.id, canvas2, imageReceiver, q6bVar);
                } else if (chat != null) {
                    if (xc2.Y(chat)) {
                        Drawable drawable = aob.R0;
                        RectF rectF5 = q6bVar.F;
                        RectF rectF6 = q6bVar.F;
                        br3.a(canvas2, drawable, rectF5.centerX(), rectF6.centerY(), rectF6.width());
                    }
                    t6b.h(-this.F.id, canvas2, imageReceiver, q6bVar);
                } else {
                    imageReceiver.k0(q6bVar.F);
                    imageReceiver.h(canvas2, null);
                }
            } else {
                e88 e88Var = this.h;
                if (e88Var == null) {
                    e88Var = new e88();
                    this.h = e88Var;
                }
                RectF rectF7 = q6bVar.F;
                RectF rectF8 = q6bVar.F;
                e88Var.a((int) rectF7.centerX(), (int) rectF8.centerY(), (int) (rectF8.width() / f3));
                canvas2.save();
                canvas2.clipPath(this.h);
                imageReceiver.k0(rectF8);
                imageReceiver.h(canvas2, null);
                canvas2.restore();
            }
        }
        float d2 = this.o0.d(this.p0);
        if (d2 > 0.0f) {
            float s = imageReceiver.s() + hl.L(14.0f);
            float r = imageReceiver.r() + hl.L(f2);
            canvas2.save();
            aob.s0.setColor(aob.v0(aob.d6, vnbVar));
            canvas2.drawCircle(r, s, hl.L(11.33f) * d2, aob.s0);
            al8 al8Var2 = this.Q0;
            if (al8Var2 == null) {
                al8Var = new al8(aob.Ck, aob.Dk, -1, -1, this.x);
                this.Q0 = al8Var;
            } else {
                al8Var = al8Var2;
            }
            al8Var.d((int) (r - hl.L(10.0f)), 0.0f, (int) (s - hl.L(10.0f)), (int) (hl.L(10.0f) + r), 0.0f, (int) (hl.L(10.0f) + s));
            canvas2.drawCircle(r, s, hl.L(10.0f) * d2, this.Q0.f);
            if (this.R0 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.R0 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.R0.setBounds((int) (r - (((r6.getIntrinsicWidth() / f3) * 0.875f) * d2)), (int) (s - (((this.R0.getIntrinsicHeight() / f3) * 0.875f) * d2)), (int) (((this.R0.getIntrinsicWidth() / f3) * 0.875f * d2) + r), (int) (((this.R0.getIntrinsicHeight() / f3) * 0.875f * d2) + s));
            this.R0.setAlpha((int) (d2 * 255.0f));
            this.R0.draw(canvas2);
            canvas2.restore();
        }
        if (!this.r0 || this.N0 == null) {
            return;
        }
        float L8 = hl.L(28.0f) + this.N0.c;
        float L9 = ob6.a0 ? hl.L(15.0f) : (getWidth() - L8) - hl.L(15.0f);
        float L10 = hl.L(28.0f);
        int w03 = aob.w0(null, aob.Fi, false);
        Paint paint2 = this.L0;
        paint2.setColor(w03);
        float height2 = (getHeight() + L10) / f3;
        RectF rectF9 = this.M0;
        rectF9.set(L9, (getHeight() - L10) / f3, L8 + L9, height2);
        canvas2.save();
        float a2 = this.K0.a(0.06f);
        canvas2.scale(a2, a2, rectF9.centerX(), rectF9.centerY());
        canvas2.drawRoundRect(rectF9, rectF9.height() / f3, rectF9.height() / f3, paint2);
        this.N0.c(L9 + hl.L(14.0f), getHeight() / f3, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        StaticLayout staticLayout = this.R;
        if (staticLayout != null) {
            sb.append(staticLayout.getText());
        }
        if (this.l0) {
            sb.append(", ");
            sb.append(ob6.M0(2131754734, null));
            sb.append("\n");
        }
        if (this.t0 != null) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(this.t0.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
        og2 og2Var = this.C0;
        if (og2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(og2Var.a.q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.E == null && this.F == null && this.G == null && this.H == null) {
            return;
        }
        og2 og2Var = this.C0;
        if (og2Var != null) {
            int L = ob6.a0 ? (i3 - i) - hl.L(42.0f) : hl.L(42.0f);
            int L2 = hl.L(36.0f);
            og2Var.layout(L, L2, og2Var.getMeasuredWidth() + L, og2Var.getMeasuredHeight() + L2);
        }
        if (z) {
            y();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        og2 og2Var = this.C0;
        if (og2Var != null) {
            og2Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.O0 ? hl.L(56.0f) : hl.L(60.0f) + (this.N ? 1 : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r6.i == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009f, code lost:
    
        if (r6.i == false) goto L51;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        za1 za1Var;
        if (this.r0 && this.E0 != null && this.E != null) {
            boolean contains = this.M0.contains(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            v41 v41Var = this.K0;
            if (action == 0 || motionEvent.getAction() == 2) {
                v41Var.c(contains);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (v41Var.i) {
                        this.E0.a(this.E);
                    }
                    v41Var.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    v41Var.c(false);
                    return true;
                }
            }
            if (!contains) {
            }
            return true;
        }
        if (this.y != null && this.F0 != null) {
            boolean contains2 = this.x0.contains(motionEvent.getX(), motionEvent.getY());
            int action2 = motionEvent.getAction();
            v41 v41Var2 = this.A0;
            if (action2 == 0 || motionEvent.getAction() == 2) {
                v41Var2.c(contains2);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (v41Var2.i) {
                        this.F0.a(this, this.y);
                    }
                    v41Var2.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    v41Var2.c(false);
                    return true;
                }
            }
            if (!contains2) {
            }
            return true;
        }
        if (((this.E == null && this.F == null) || !this.w0.a(this, motionEvent)) && ((za1Var = this.W) == null || !za1Var.b(motionEvent))) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.y = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z) {
        this.J0 = z;
    }

    public void setOnSponsoredOptionsClick(icc iccVar) {
        this.F0 = iccVar;
    }

    public void setOpenBotButton(boolean z) {
        int i;
        int i2;
        if (this.r0 == z) {
            return;
        }
        pkb pkbVar = this.N0;
        if (pkbVar == null) {
            pkbVar = new pkb(ob6.M0(2131753004, null), 14.0f, hl.o());
            this.N0 = pkbVar;
        }
        if (z) {
            i = hl.L(30.0f) + ((int) pkbVar.c);
        } else {
            i = 0;
        }
        if (ob6.a0) {
            i2 = i;
            i = 0;
        } else {
            i2 = 0;
        }
        setPadding(i2, 0, i, 0);
        this.r0 = z;
        this.K0.c(false);
    }

    public void setRectangularAvatar(boolean z) {
        this.P0 = z;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.w = charSequence;
        D(0);
    }

    @Override // snb
    public final void updateColors() {
        int i = this.S0;
        int i2 = yob.b;
        if (i == i2) {
            if (this.R == null || getMeasuredWidth() <= 0) {
                return;
            }
            y();
            return;
        }
        this.S0 = i2;
        try {
            D(0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.v0 == drawable || this.u0 == drawable || super.verifyDrawable(drawable);
    }

    public final void y() {
        TLRPC.Chat M0;
        TextPaint textPaint;
        int measuredWidth;
        CharSequence charSequence;
        TLRPC.UserStatus userStatus;
        int i;
        int L;
        this.S = false;
        this.l0 = false;
        this.m0 = false;
        TLRPC.EncryptedChat encryptedChat = this.G;
        int i2 = this.O;
        if (encryptedChat != null) {
            this.S = true;
            this.I = wf3.E(encryptedChat.id);
            if (ob6.a0) {
                this.T = (getMeasuredWidth() - hl.L(hl.C + 2)) - aob.Z0.getIntrinsicWidth();
                this.P = hl.L(11.0f);
            } else {
                this.T = hl.L(hl.C);
                this.P = aob.Z0.getIntrinsicWidth() + hl.L(r2 + 4);
            }
            this.U = hl.L(22.0f);
            E(false, null, null, false);
        } else {
            TLRPC.Chat chat = this.F;
            if (chat != null) {
                this.I = -chat.id;
                this.l0 = chat.verified;
                if (chat.monoforum && (M0 = uc7.s1(i2).M0(Long.valueOf(this.F.linked_monoforum_id))) != null) {
                    this.l0 = M0.verified;
                }
                if (ob6.a0) {
                    this.P = hl.L(11.0f);
                } else {
                    this.P = hl.L(hl.C);
                }
                E(this.l0, null, this.F, false);
            } else {
                TLRPC.User user = this.E;
                if (user != null) {
                    this.I = user.id;
                    if (ob6.a0) {
                        this.P = hl.L(11.0f);
                    } else {
                        this.P = hl.L(hl.C);
                    }
                    this.U = hl.L(21.0f);
                    TLRPC.User user2 = this.E;
                    boolean z = user2 != null && this.G == null && !this.M && uc7.s1(i2).r2(user2.id);
                    this.m0 = z;
                    this.l0 = !z && this.E.verified;
                    if (!z && !this.M) {
                        uc7.s1(i2);
                    }
                    E(this.l0, this.E, null, false);
                    if (this.m0) {
                        aob.h1.a();
                    }
                } else if (this.H != null) {
                    this.I = 0L;
                    if (ob6.a0) {
                        this.P = hl.L(11.0f);
                    } else {
                        this.P = hl.L(hl.C);
                    }
                    if (this.W == null) {
                        za1 za1Var = new za1(this);
                        this.W = za1Var;
                        za1Var.h = new uk8(this, (byte) 15);
                    }
                }
            }
        }
        if (ob6.a0) {
            this.s0 = hl.L(11.0f);
        } else {
            this.s0 = hl.L(hl.C);
        }
        if (this.y != null) {
            if (this.y0 == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(ob6.M0(2131745563, null)).append((CharSequence) " i");
                wm2 wm2Var = new wm2(R.drawable.ic_ab_other, 0);
                wm2Var.I = 0.55f;
                wm2Var.J = 0.55f;
                wm2Var.H = 0.7f;
                wm2Var.r = -hl.L(2.0f);
                wm2Var.s = 0.0f;
                append.setSpan(wm2Var, append.length() - 1, append.length(), 33);
                this.y0 = new pkb(append, 12.0f, null);
            }
            if (this.z0 == null) {
                this.z0 = new Paint(1);
            }
        }
        CharSequence charSequence2 = this.n;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence3 = null;
        }
        TLRPC.Chat chat2 = this.F;
        vnb vnbVar = this.x;
        CharSequence charSequence4 = charSequence3;
        if (chat2 != null) {
            charSequence4 = charSequence3;
            if (chat2.monoforum) {
                TLRPC.Chat M02 = uc7.s1(i2).M0(Long.valueOf(this.F.linked_monoforum_id));
                charSequence4 = charSequence3;
                if (M02 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hl.U(M02.title));
                    spannableStringBuilder.append((CharSequence) " ");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) ob6.M0(2131748101, null));
                    spannableStringBuilder.setSpan(new mf4(ob6.M0(2131748101, null), aob.y6, vnbVar), length, spannableStringBuilder.length(), 33);
                    charSequence4 = spannableStringBuilder;
                } else if (charSequence3 == null) {
                    charSequence4 = hl.C2(hl.A2(this.F.title));
                }
            } else if (charSequence3 == null) {
                charSequence4 = hl.C2(hl.A2(chat2.title));
            }
        } else if (charSequence3 == null) {
            TLRPC.User user3 = this.E;
            charSequence4 = charSequence3;
            if (user3 != null) {
                charSequence4 = hl.C2(hl.A2(lbc.r(user3)));
            }
        }
        CharSequence J2 = hl.J2(charSequence4);
        if (TextUtils.isEmpty(J2)) {
            TLRPC.User user4 = this.E;
            J2 = (user4 == null || TextUtils.isEmpty(user4.phone)) ? ob6.M0(2131749082, null) : xnb.k(new StringBuilder("+"), this.E.phone, f78.f());
        }
        if (this.G0) {
            if (this.H0 == null) {
                TextPaint textPaint2 = new TextPaint(1);
                this.H0 = textPaint2;
                textPaint2.setTypeface(hl.o());
            }
            this.H0.setTextSize(hl.L(this.O0 ? 15.0f : 16.0f));
            TLRPC.EncryptedChat encryptedChat2 = this.G;
            TextPaint textPaint3 = this.H0;
            if (encryptedChat2 != null) {
                textPaint3.setColor(aob.v0(aob.Z8, vnbVar));
            } else {
                textPaint3.setColor(aob.v0(aob.X8, vnbVar));
            }
            textPaint = this.H0;
        } else {
            textPaint = this.G != null ? aob.D0 : aob.C0;
        }
        TextPaint textPaint4 = textPaint;
        if (ob6.a0) {
            measuredWidth = (getMeasuredWidth() - this.P) - hl.L(hl.C);
            this.V = measuredWidth;
        } else {
            measuredWidth = (getMeasuredWidth() - this.P) - hl.L(14.0f);
            this.V = measuredWidth;
        }
        int i3 = measuredWidth;
        if (this.S) {
            i3 -= aob.Z0.getIntrinsicWidth() + hl.L(6.0f);
            this.V = i3;
        }
        if (this.y != null) {
            int L2 = hl.L(20.66f) + ((int) this.y0.c);
            i3 = this.V - L2;
            this.V = i3;
            if (ob6.a0) {
                this.P += L2;
            }
        }
        if (this.H != null) {
            int measureText = (int) (aob.K0.measureText(ob6.M0(2131748928, null)) + 1.0f);
            this.a0 = new StaticLayout(ob6.M0(2131748928, null), aob.K0, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (ob6.a0) {
                this.b0 = hl.L(16.0f) + hl.L(19.0f);
                this.P += measureText;
                this.s0 += measureText;
            } else {
                this.b0 = ((getMeasuredWidth() - measureText) - hl.L(19.0f)) - hl.L(16.0f);
            }
            i3 = ik8.B(32.0f, measureText, this.V);
            this.V = i3;
        }
        this.V = i3 - (getPaddingRight() + getPaddingLeft());
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.e0) {
            int V0 = uc7.s1(i2).V0((TLRPC.Dialog) uc7.s1(i2).R.f(this.I));
            if (V0 != 0) {
                this.f0 = V0;
                Locale locale = Locale.US;
                String valueOf = String.valueOf(V0);
                this.i0 = Math.max(hl.L(12.0f), (int) Math.ceil(aob.K0.measureText(valueOf)));
                this.j0 = new StaticLayout(valueOf, aob.K0, this.i0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int L3 = hl.L(18.0f) + this.i0;
                this.V -= L3;
                paddingRight -= L3;
                if (ob6.a0) {
                    this.h0 = hl.L(19.0f);
                    this.P += L3;
                    this.s0 += L3;
                } else {
                    this.h0 = (getMeasuredWidth() - this.i0) - hl.L(19.0f);
                }
            } else {
                this.f0 = 0;
                this.j0 = null;
            }
        } else {
            this.f0 = 0;
            this.j0 = null;
        }
        int i4 = paddingRight;
        ul ulVar = this.u0;
        boolean d = ulVar.d();
        int i5 = ulVar.s;
        if (!d) {
            if (ob6.a0) {
                this.V -= i5;
            } else {
                this.P += i5;
            }
        }
        ul ulVar2 = this.v0;
        if (!ulVar2.d() && !ob6.a0) {
            this.V -= ulVar2.s;
        }
        if (this.m0) {
            int intrinsicWidth = aob.h1.getIntrinsicWidth() + hl.L(6.0f);
            this.V -= intrinsicWidth;
            if (ob6.a0) {
                this.P += intrinsicWidth;
            }
        }
        int i6 = this.V;
        if (i6 < 0) {
            this.V = 0;
            i6 = 0;
        }
        float L4 = i6 - hl.L(12.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(J2, textPaint4, L4, truncateAt);
        if (ellipsize != null) {
            ellipsize = pv3.m(ellipsize, textPaint4.getFontMetricsInt(), false, null, 0);
        }
        CharSequence charSequence5 = ellipsize;
        int i7 = this.V;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.R = new StaticLayout(charSequence5, textPaint4, i7, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint5 = aob.P0;
        TLRPC.Chat chat3 = this.F;
        if (chat3 == null || this.w != null) {
            charSequence = this.w;
            if (charSequence == null) {
                TLRPC.User user5 = this.E;
                if (user5 == null) {
                    charSequence = null;
                } else if (uc7.K2(user5)) {
                    charSequence = ob6.M0(2131743978, null);
                } else {
                    TLRPC.User user6 = this.E;
                    if (user6.bot) {
                        int i8 = user6.bot_active_users;
                        charSequence = i8 != 0 ? ob6.H(' ', "BotUsersShort", i8) : ob6.M0(2131753149, null);
                    } else {
                        long j = user6.id;
                        if (j == 489000) {
                            charSequence = ob6.M0(2131743271, null);
                        } else if (lbc.C(j)) {
                            charSequence = ob6.M0(2131745289, null);
                        } else {
                            boolean[] zArr = this.k0;
                            if (zArr == null) {
                                zArr = new boolean[1];
                                this.k0 = zArr;
                            }
                            zArr[0] = false;
                            charSequence = ob6.d0(i2, this.E, zArr, null);
                            if (this.k0[0]) {
                                textPaint5 = aob.O0;
                            }
                            TLRPC.User user7 = this.E;
                            if (user7 != null && (user7.id == yac.h(i2).e() || ((userStatus = this.E.status) != null && userStatus.expires > ConnectionsManager.getInstance(i2).getCurrentTime()))) {
                                textPaint5 = aob.O0;
                                charSequence = ob6.M0(2131747553, null);
                            }
                        }
                    }
                }
            }
            if (this.M || lbc.B(this.E)) {
                this.Q = hl.L(20.0f);
                charSequence = null;
            }
        } else {
            if (xc2.Y(chat3)) {
                charSequence = ob6.M0(2131751955, null).toLowerCase();
            } else {
                boolean V = xc2.V(this.F);
                TLRPC.Chat chat4 = this.F;
                if (V) {
                    int i9 = chat4.participants_count;
                    charSequence = i9 != 0 ? ob6.H(',', "Subscribers", i9) : !xc2.t0(chat4) ? ob6.M0(2131752299, null).toLowerCase() : ob6.M0(2131752288, null).toLowerCase();
                } else {
                    int i10 = chat4.participants_count;
                    charSequence = i10 != 0 ? ob6.H(',', "Members", i10) : chat4.has_geo ? ob6.M0(2131748396, null) : xc2.p0(chat4) ? ob6.M0(2131748102, null) : !xc2.t0(this.F) ? ob6.M0(2131748395, null).toLowerCase() : ob6.M0(2131748392, null).toLowerCase();
                }
            }
            this.Q = hl.L(19.0f);
        }
        if (this.G0) {
            TextPaint textPaint6 = this.I0;
            if (textPaint6 == null) {
                textPaint6 = new TextPaint(1);
                this.I0 = textPaint6;
            }
            textPaint6.setTextSize(hl.L(this.O0 ? 13.0f : 15.0f));
            if (textPaint5 == aob.P0) {
                this.I0.setColor(aob.v0(aob.A6, vnbVar));
            } else if (textPaint5 == aob.O0) {
                this.I0.setColor(aob.v0(aob.p6, vnbVar));
            }
            textPaint5 = this.I0;
        }
        if (TextUtils.isEmpty(charSequence)) {
            i = i4;
            this.Q = hl.L(20.0f);
            this.t0 = null;
        } else {
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint5, i4 - hl.L(12.0f), truncateAt), textPaint5, i4, alignment, 1.0f, 0.0f, false);
            i = i4;
            this.t0 = staticLayout;
            this.Q = hl.L(9.0f);
            this.U -= hl.L(10.0f);
        }
        if (ob6.a0) {
            L = (getMeasuredWidth() - hl.L(57.0f)) - getPaddingRight();
        } else {
            L = hl.L(this.O0 ? 14.0f : this.P0 ? 15.0f : 11.0f) + getPaddingLeft();
        }
        this.w0.F.set(L, hl.L(this.O0 ? 6.0f : 7.0f), hl.L(this.O0 ? 44.0f : this.P0 ? 42.0f : 46.0f) + L, hl.L(this.O0 ? 44.0f : 46.0f) + hl.L(this.O0 ? 6.0f : 7.0f));
        boolean z2 = ob6.a0;
        StaticLayout staticLayout2 = this.R;
        if (z2) {
            if (staticLayout2.getLineCount() > 0 && this.R.getLineLeft(0) == 0.0f) {
                double ceil = Math.ceil(this.R.getLineWidth(0));
                double d2 = this.V;
                if (ceil < d2) {
                    this.P = (int) ((d2 - ceil) + this.P);
                }
            }
            StaticLayout staticLayout3 = this.t0;
            if (staticLayout3 != null && staticLayout3.getLineCount() > 0 && this.t0.getLineLeft(0) == 0.0f) {
                double ceil2 = Math.ceil(this.t0.getLineWidth(0));
                double d3 = i;
                if (ceil2 < d3) {
                    this.s0 = (int) ((d3 - ceil2) + this.s0);
                }
            }
        } else {
            if (staticLayout2.getLineCount() > 0 && this.R.getLineRight(0) == this.V) {
                double ceil3 = Math.ceil(this.R.getLineWidth(0));
                double d4 = this.V;
                if (ceil3 < d4) {
                    this.P = (int) (this.P - (d4 - ceil3));
                }
            }
            StaticLayout staticLayout4 = this.t0;
            if (staticLayout4 != null && staticLayout4.getLineCount() > 0 && this.t0.getLineRight(0) == i) {
                double ceil4 = Math.ceil(this.t0.getLineWidth(0));
                double d5 = i;
                if (ceil4 < d5) {
                    this.s0 = (int) (this.s0 - (d5 - ceil4));
                }
            }
        }
        this.P = getPaddingLeft() + this.P;
        this.s0 = getPaddingLeft() + this.s0;
        this.T = getPaddingLeft() + this.T;
        if (this.O0) {
            this.P = hl.L(1.0f) + this.P;
            this.Q = hl.L(1.0f) + this.Q;
        }
    }
}
