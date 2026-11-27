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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class lj6 extends FrameLayout implements snb {
    public TLRPC.FileLocation E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final byte K;
    public int L;
    public kj6 M;
    public final int N;
    public final q6b O;
    public boolean P;
    public final jj6 a;
    public final ema b;
    public final ema c;
    public final vnb d;
    public final rb0 e;
    public final ImageView f;
    public ImageView h;
    public TLObject n;
    public TL_stories.StoryItem r;
    public CharSequence s;
    public CharSequence w;
    public String x;
    public int y;

    /* JADX WARN: Multi-variable type inference failed */
    public lj6(Context context, int i, int i2, boolean z, vnb vnbVar) {
        super(context);
        this.L = -1;
        this.N = yac.t0;
        this.O = new q6b(null, false);
        this.d = vnbVar;
        this.I = aob.v0(aob.y6, vnbVar);
        this.J = aob.v0(aob.n6, vnbVar);
        this.K = i2;
        this.e = new rb0((vnb) null);
        jj6 jj6Var = new jj6(this, context, vnbVar);
        this.a = jj6Var;
        jj6Var.setRoundRadius(hl.L(23.0f));
        boolean z2 = ob6.a0;
        addView(jj6Var, tre.d(46, 46.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : i + 7, 8.0f, z2 ? i + 7 : 0.0f, 0.0f));
        ema emaVar = new ema(context);
        this.b = emaVar;
        yob.W(emaVar, aob.G6, vnbVar);
        emaVar.setTextSize(17);
        emaVar.setTypeface(hl.o());
        emaVar.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z3 = ob6.a0;
        addView(emaVar, tre.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 46.0f : i2 + 68, 11.5f, z3 ? i2 + 68 : 46.0f, 0.0f));
        jn7.i(emaVar);
        ema emaVar2 = new ema(context);
        this.c = emaVar2;
        emaVar2.setTextSize(14);
        emaVar2.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z4 = ob6.a0;
        addView(emaVar2, tre.d(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? 28.0f : i2 + 68, 34.5f, z4 ? i2 + 68 : 28.0f, 0.0f));
        if (z) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setFocusable(false);
            int i3 = aob.Mi;
            hf0 f0 = aob.f0(aob.v0(i3, vnbVar), 1, -1);
            uob M = yob.M(i3);
            imageView.setBackground(f0);
            yob.j(imageView, f0, null, M, vnbVar);
            imageView.setImageResource(R.drawable.ic_ab_other);
            yob.s(imageView, aob.Li, vnbVar, PorterDuff.Mode.MULTIPLY);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, tre.e(60, 64, (ob6.a0 ? 3 : 5) | 48));
            imageView.setOnClickListener(new sa5(this, (byte) 24));
            imageView.setContentDescription(ob6.M0(2131754735, null));
        }
    }

    public final void a() {
        this.a.getImageReceiver().c();
    }

    public final void b() {
        if (this.P) {
            return;
        }
        int i = aob.y6;
        vnb vnbVar = this.d;
        int v0 = aob.v0(i, vnbVar);
        int v02 = aob.v0(aob.n6, vnbVar);
        if (v0 == this.I && v02 == this.J) {
            return;
        }
        ema emaVar = this.c;
        if (emaVar != null) {
            int textColor = emaVar.getTextColor();
            if (textColor == this.I) {
                emaVar.setTextColor(v0);
            } else if (textColor == this.J) {
                emaVar.setTextColor(v02);
            }
        }
        this.I = v0;
        this.J = v02;
    }

    public final void c(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        float f;
        float f2;
        ema emaVar = this.c;
        ema emaVar2 = this.b;
        if (tLObject == null) {
            this.w = null;
            this.s = null;
            this.n = null;
            emaVar2.l("", false);
            emaVar.l("", false);
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
            boolean z2 = ob6.a0;
            emaVar2.setLayoutParams(tre.d(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? a ? 46 : 28 : b + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, ob6.a0 ? b + 68 : a ? 46 : 28, 0.0f));
            boolean z3 = ob6.a0;
            int i = (z3 ? 5 : 3) | 48;
            float f3 = z3 ? a ? 46 : 28 : b + 68;
            if (z3) {
                f2 = b + 68;
            } else {
                f2 = a ? 46 : 28;
            }
            emaVar.setLayoutParams(tre.d(-1, 20.0f, i, f3, 34.5f, f2, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                boolean z4 = imageView2.getVisibility() == 0;
                boolean z5 = ob6.a0;
                emaVar2.setLayoutParams(tre.d(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? z4 ? 54 : 28 : b + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, ob6.a0 ? b + 68 : z4 ? 54 : 28, 0.0f));
                boolean z6 = ob6.a0;
                int i2 = (z6 ? 5 : 3) | 48;
                float f4 = z6 ? z4 ? 54 : 28 : b + 68;
                if (z6) {
                    f = b + 68;
                } else {
                    f = z4 ? 54 : 28;
                }
                emaVar.setLayoutParams(tre.d(-1, 20.0f, i2, f4, 34.5f, f, 0.0f));
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
            jj6 jj6Var = this.a;
            ema emaVar = this.b;
            rb0 rb0Var = this.e;
            boolean z2 = true;
            ema emaVar2 = this.c;
            if (!z) {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    TLRPC.FileLocation fileLocation3 = chatPhoto != null ? chatPhoto.photo_small : null;
                    if (i != 0) {
                        int i2 = uc7.r5;
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
                    rb0Var.p(chat);
                    CharSequence charSequence = this.s;
                    if (charSequence != null) {
                        this.x = null;
                        emaVar.l(charSequence, false);
                    } else {
                        if (str == null) {
                            str = chat.title;
                        }
                        this.x = str;
                        emaVar.l(str, false);
                    }
                    CharSequence charSequence2 = this.w;
                    int i3 = this.I;
                    if (charSequence2 != null) {
                        emaVar2.setTextColor(i3);
                        emaVar2.l(this.w, false);
                    } else {
                        emaVar2.setTextColor(i3);
                        if (chat.participants_count != 0) {
                            if (!xc2.T(chat) || chat.megagroup) {
                                emaVar2.l(ob6.G(chat.participants_count, "Members", new Object[0]), false);
                            } else {
                                emaVar2.l(ob6.G(chat.participants_count, "Subscribers", new Object[0]), false);
                            }
                        } else if (chat.has_geo) {
                            emaVar2.l(ob6.M0(2131748396, null), false);
                        } else if (xc2.t0(chat)) {
                            emaVar2.l(ob6.M0(2131748392, null), false);
                        } else {
                            emaVar2.l(ob6.M0(2131748395, null), false);
                        }
                    }
                    this.E = fileLocation3;
                    jj6Var.f(chat, rb0Var);
                    return;
                }
                return;
            }
            TLRPC.User user = (TLRPC.User) tLObject;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation4 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            if (i != 0) {
                int i4 = uc7.r5;
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
                    str2 = lbc.r(user);
                }
                z2 = z4;
                if (!z2) {
                    return;
                }
            } else {
                str2 = null;
            }
            rb0Var.q(user);
            TLRPC.UserStatus userStatus3 = user.status;
            if (userStatus3 != null) {
                this.y = userStatus3.expires;
            } else {
                this.y = 0;
            }
            CharSequence charSequence3 = this.s;
            if (charSequence3 != null) {
                this.x = null;
                emaVar.l(charSequence3, false);
            } else {
                if (str2 == null) {
                    str2 = lbc.r(user);
                }
                this.x = str2;
                emaVar.l(c00.f(emaVar, str2, false, null, 0), false);
            }
            if (this.w != null) {
                emaVar2.setTextColor(this.I);
                emaVar2.l(this.w, false);
            } else {
                String q = wf3.q(user);
                if (user.bot) {
                    emaVar2.setTextColor(this.I);
                    if (this.H && !TextUtils.isEmpty(q)) {
                        emaVar2.l(q, false);
                    } else if (user.bot_chat_history || this.F) {
                        emaVar2.l(ob6.M0(2131752927, null), false);
                    } else {
                        emaVar2.l(ob6.M0(2131752928, null), false);
                    }
                } else if (!this.H || TextUtils.isEmpty(q)) {
                    long j = user.id;
                    int i5 = this.N;
                    if (j == yac.h(i5).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i5).getCurrentTime()) || uc7.s1(i5).a0.containsKey(Long.valueOf(user.id)))) {
                        emaVar2.setTextColor(this.J);
                        emaVar2.l(ob6.M0(2131747553, null), false);
                    } else {
                        emaVar2.setTextColor(this.I);
                        emaVar2.l(ob6.d0(i5, user, null, null), false);
                    }
                } else {
                    emaVar2.l(q, false);
                    emaVar2.setTextColor(this.I);
                }
            }
            this.E = fileLocation4;
            jj6Var.f(user, rb0Var);
        }
    }

    public de0 getAvatarImageView() {
        return this.a;
    }

    public Object getCurrentObject() {
        return this.n;
    }

    public q6b getStoryAvatarParams() {
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
                aob.k0.setColor(aob.v0(i, this.d));
            }
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(68.0f) : 0), getMeasuredHeight() - 1, this.L >= 0 ? aob.k0 : aob.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(64.0f) + (this.G ? 1 : 0), TLObject.FLAG_30));
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
        yob.s(this.h, aob.dh, this.d, PorterDuff.Mode.MULTIPLY);
        addView(this.h, tre.e(52, 64, (ob6.a0 ? 3 : 5) | 48));
    }

    public void setDelegate(kj6 kj6Var) {
        this.M = kj6Var;
    }

    public void setDividerColor(int i) {
        this.L = i;
    }

    public void setIsAdmin(boolean z) {
        this.F = z;
    }

    public void setNameColor(int i) {
        ema emaVar = this.b;
        yob.q(emaVar);
        emaVar.setTextColor(i);
    }

    @Override // snb
    public final void updateColors() {
        try {
            b();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
