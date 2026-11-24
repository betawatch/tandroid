// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ij6 extends FrameLayout implements vlb {
    public TLRPC.FileLocation E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final byte K;
    public int L;
    public hj6 M;
    public final int N;
    public final v4b O;
    public boolean P;
    public final gj6 a;
    public final lka b;
    public final lka c;
    public final ylb d;
    public final pc0 e;
    public final ImageView f;
    public ImageView h;
    public TLObject n;
    public TL_stories.StoryItem r;
    public CharSequence s;
    public CharSequence w;
    public String x;
    public int y;

    /* JADX WARN: Multi-variable type inference failed */
    public ij6(Context context, int i, int i2, boolean z, ylb ylbVar) {
        super(context);
        this.L = -1;
        this.N = z8c.t0;
        this.O = new v4b(null, false);
        this.d = ylbVar;
        this.I = cmb.v0(cmb.x6, ylbVar);
        this.J = cmb.v0(cmb.m6, ylbVar);
        this.K = i2;
        this.e = new pc0((ylb) null);
        gj6 gj6Var = new gj6(this, context, ylbVar);
        this.a = gj6Var;
        gj6Var.setRoundRadius(gm.L(23.0f));
        boolean z2 = jb6.a0;
        addView(gj6Var, qoe.d(46, 46.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : i + 7, 8.0f, z2 ? i + 7 : 0.0f, 0.0f));
        lka lkaVar = new lka(context);
        this.b = lkaVar;
        anb.W(lkaVar, cmb.F6, ylbVar);
        lkaVar.setTextSize(17);
        lkaVar.setTypeface(gm.o());
        lkaVar.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z3 = jb6.a0;
        addView(lkaVar, qoe.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 46.0f : i2 + 68, 11.5f, z3 ? i2 + 68 : 46.0f, 0.0f));
        nm7.i(lkaVar);
        lka lkaVar2 = new lka(context);
        this.c = lkaVar2;
        lkaVar2.setTextSize(14);
        lkaVar2.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z4 = jb6.a0;
        addView(lkaVar2, qoe.d(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? 28.0f : i2 + 68, 34.5f, z4 ? i2 + 68 : 28.0f, 0.0f));
        if (z) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setFocusable(false);
            int i3 = cmb.Li;
            fg0 f0 = cmb.f0(cmb.v0(i3, ylbVar), 1, -1);
            wmb M = anb.M(i3);
            imageView.setBackground(f0);
            anb.j(imageView, f0, null, M, ylbVar);
            imageView.setImageResource(R.drawable.ic_ab_other);
            anb.s(imageView, cmb.Ki, ylbVar, PorterDuff.Mode.MULTIPLY);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, qoe.e(60, 64, (jb6.a0 ? 3 : 5) | 48));
            imageView.setOnClickListener(new ca5(this, (byte) 26));
            imageView.setContentDescription(jb6.M0(2131754739, null));
        }
    }

    public final void a() {
        this.a.getImageReceiver().c();
    }

    public final void b() {
        if (this.P) {
            return;
        }
        int i = cmb.x6;
        ylb ylbVar = this.d;
        int v0 = cmb.v0(i, ylbVar);
        int v02 = cmb.v0(cmb.m6, ylbVar);
        if (v0 == this.I && v02 == this.J) {
            return;
        }
        lka lkaVar = this.c;
        if (lkaVar != null) {
            int textColor = lkaVar.getTextColor();
            if (textColor == this.I) {
                lkaVar.setTextColor(v0);
            } else if (textColor == this.J) {
                lkaVar.setTextColor(v02);
            }
        }
        this.I = v0;
        this.J = v02;
    }

    public final void c(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        float f;
        float f2;
        lka lkaVar = this.c;
        lka lkaVar2 = this.b;
        if (tLObject == null) {
            this.w = null;
            this.s = null;
            this.n = null;
            lkaVar2.l("", false);
            lkaVar.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.w = charSequence2;
        this.s = charSequence;
        this.n = tLObject;
        ImageView imageView = this.f;
        byte b = this.K;
        if (imageView != null) {
            boolean a = this.M.a(this, false);
            imageView.setVisibility(a ? 0 : 4);
            boolean z2 = jb6.a0;
            lkaVar2.setLayoutParams(qoe.d(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? a ? 46 : 28 : b + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, jb6.a0 ? b + 68 : a ? 46 : 28, 0.0f));
            boolean z3 = jb6.a0;
            int i = (z3 ? 5 : 3) | 48;
            float f3 = z3 ? a ? 46 : 28 : b + 68;
            if (z3) {
                f2 = b + 68;
            } else {
                f2 = a ? 46 : 28;
            }
            lkaVar.setLayoutParams(qoe.d(-1, 20.0f, i, f3, 34.5f, f2, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                boolean z4 = imageView2.getVisibility() == 0;
                boolean z5 = jb6.a0;
                lkaVar2.setLayoutParams(qoe.d(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? z4 ? 54 : 28 : b + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, jb6.a0 ? b + 68 : z4 ? 54 : 28, 0.0f));
                boolean z6 = jb6.a0;
                int i2 = (z6 ? 5 : 3) | 48;
                float f4 = z6 ? z4 ? 54 : 28 : b + 68;
                if (z6) {
                    f = b + 68;
                } else {
                    f = z4 ? 54 : 28;
                }
                lkaVar.setLayoutParams(qoe.d(-1, 20.0f, i2, f4, 34.5f, f, 0.0f));
            }
        }
        this.G = z;
        setWillNotDraw(true ^ z);
        d(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x018f, code lost:
    
        if (r15.equals(r10) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
    
        if (r15.equals(r14.x) != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i) {
        String str;
        TLRPC.FileLocation fileLocation;
        String str2;
        TLRPC.UserStatus userStatus;
        TLRPC.FileLocation fileLocation2;
        TLObject tLObject = this.n;
        if (tLObject != null) {
            boolean z = tLObject instanceof TLRPC.User;
            gj6 gj6Var = this.a;
            lka lkaVar = this.b;
            pc0 pc0Var = this.e;
            boolean z2 = true;
            lka lkaVar2 = this.c;
            if (!z) {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    TLRPC.FileLocation fileLocation3 = chatPhoto != null ? chatPhoto.photo_small : null;
                    if (i != 0) {
                        int i2 = oc7.s5;
                        boolean z3 = (i & 2) != 0 && ((fileLocation = this.E) == null ? fileLocation3 != null : !(fileLocation3 != null && fileLocation.volume_id == fileLocation3.volume_id && fileLocation.local_id == fileLocation3.local_id));
                        if (z3 || this.s != null || (r10 = this.x) == null || (i & 1) == 0) {
                            str = null;
                        } else {
                            str = chat.title;
                        }
                        z2 = z3;
                        if (!z2) {
                            return;
                        }
                    } else {
                        str = null;
                    }
                    pc0Var.p(chat);
                    CharSequence charSequence = this.s;
                    if (charSequence != null) {
                        this.x = null;
                        lkaVar.l(charSequence, false);
                    } else {
                        if (str == null) {
                            str = chat.title;
                        }
                        this.x = str;
                        lkaVar.l(str, false);
                    }
                    CharSequence charSequence2 = this.w;
                    int i3 = this.I;
                    if (charSequence2 != null) {
                        lkaVar2.setTextColor(i3);
                        lkaVar2.l(this.w, false);
                    } else {
                        lkaVar2.setTextColor(i3);
                        if (chat.participants_count != 0) {
                            if (!sd2.T(chat) || chat.megagroup) {
                                lkaVar2.l(jb6.G(chat.participants_count, "Members", new Object[0]), false);
                            } else {
                                lkaVar2.l(jb6.G(chat.participants_count, "Subscribers", new Object[0]), false);
                            }
                        } else if (chat.has_geo) {
                            lkaVar2.l(jb6.M0(2131748399, null), false);
                        } else if (sd2.t0(chat)) {
                            lkaVar2.l(jb6.M0(2131748395, null), false);
                        } else {
                            lkaVar2.l(jb6.M0(2131748398, null), false);
                        }
                    }
                    this.E = fileLocation3;
                    gj6Var.f(chat, pc0Var);
                    return;
                }
                return;
            }
            TLRPC.User user = (TLRPC.User) tLObject;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation4 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            if (i != 0) {
                int i4 = oc7.s5;
                boolean z4 = (i & 2) != 0 && ((fileLocation2 = this.E) == null ? fileLocation4 != null : !(fileLocation4 != null && fileLocation2.volume_id == fileLocation4.volume_id && fileLocation2.local_id == fileLocation4.local_id));
                if (!z4 && (i & 4) != 0) {
                    TLRPC.UserStatus userStatus2 = user.status;
                    if ((userStatus2 != null ? userStatus2.expires : 0) != this.y) {
                        z4 = true;
                    }
                }
                if (z4 || this.s != null || this.x == null || (i & 1) == 0) {
                    str2 = null;
                } else {
                    str2 = m9c.r(user);
                }
                z2 = z4;
                if (!z2) {
                    return;
                }
            } else {
                str2 = null;
            }
            pc0Var.q(user);
            TLRPC.UserStatus userStatus3 = user.status;
            if (userStatus3 != null) {
                this.y = userStatus3.expires;
            } else {
                this.y = 0;
            }
            CharSequence charSequence3 = this.s;
            if (charSequence3 != null) {
                this.x = null;
                lkaVar.l(charSequence3, false);
            } else {
                if (str2 == null) {
                    str2 = m9c.r(user);
                }
                this.x = str2;
                lkaVar.l(b10.e(lkaVar, str2, false, null, 0), false);
            }
            if (this.w != null) {
                lkaVar2.setTextColor(this.I);
                lkaVar2.l(this.w, false);
            } else {
                String q = pg3.q(user);
                if (user.bot) {
                    lkaVar2.setTextColor(this.I);
                    if (this.H && !TextUtils.isEmpty(q)) {
                        lkaVar2.l(q, false);
                    } else if (user.bot_chat_history || this.F) {
                        lkaVar2.l(jb6.M0(2131752899, null), false);
                    } else {
                        lkaVar2.l(jb6.M0(2131752900, null), false);
                    }
                } else if (!this.H || TextUtils.isEmpty(q)) {
                    long j = user.id;
                    int i5 = this.N;
                    if (j == z8c.h(i5).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i5).getCurrentTime()) || oc7.r1(i5).a0.containsKey(Long.valueOf(user.id)))) {
                        lkaVar2.setTextColor(this.J);
                        lkaVar2.l(jb6.M0(2131747559, null), false);
                    } else {
                        lkaVar2.setTextColor(this.I);
                        lkaVar2.l(jb6.d0(i5, user, null, null), false);
                    }
                } else {
                    lkaVar2.l(q, false);
                    lkaVar2.setTextColor(this.I);
                }
            }
            this.E = fileLocation4;
            gj6Var.f(user, pc0Var);
        }
    }

    public bf0 getAvatarImageView() {
        return this.a;
    }

    public Object getCurrentObject() {
        return this.n;
    }

    public v4b getStoryAvatarParams() {
        return this.O;
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.r;
    }

    public long getUserId() {
        TLObject tLObject = this.n;
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).id;
        }
        return 0L;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.G) {
            int i = this.L;
            if (i >= 0) {
                cmb.k0.setColor(cmb.v0(i, this.d));
            }
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(68.0f) : 0), getMeasuredHeight() - 1, this.L >= 0 ? cmb.k0 : cmb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(64.0f) + (this.G ? 1 : 0), TLObject.FLAG_30));
    }

    public void setCustomImageVisible(boolean z) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(z ? 0 : 8);
    }

    public void setCustomRightImage(int i) {
        ImageView imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setImageResource(i);
        this.h.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(this.h, cmb.ch, this.d, PorterDuff.Mode.MULTIPLY);
        addView(this.h, qoe.e(52, 64, (jb6.a0 ? 3 : 5) | 48));
    }

    public void setDelegate(hj6 hj6Var) {
        this.M = hj6Var;
    }

    public void setDividerColor(int i) {
        this.L = i;
    }

    public void setIsAdmin(boolean z) {
        this.F = z;
    }

    public void setNameColor(int i) {
        lka lkaVar = this.b;
        anb.q(lkaVar);
        lkaVar.setTextColor(i);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            b();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
