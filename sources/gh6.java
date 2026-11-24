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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gh6 extends FrameLayout implements tjb {
    public TLRPC.FileLocation E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final byte K;
    public int L;
    public fh6 M;
    public final int N;
    public final u2b O;
    public boolean P;
    public final eh6 a;
    public final jia b;
    public final jia c;
    public final wjb d;
    public final pb0 e;
    public final ImageView f;
    public ImageView h;
    public TLObject n;
    public TL_stories.StoryItem r;
    public CharSequence s;
    public CharSequence w;
    public String x;
    public int y;

    /* JADX WARN: Multi-variable type inference failed */
    public gh6(Context context, int i, int i2, boolean z, wjb wjbVar) {
        super(context);
        this.L = -1;
        this.N = y6c.t0;
        this.O = new u2b(null, false);
        this.d = wjbVar;
        this.I = bkb.v0(bkb.x6, wjbVar);
        this.J = bkb.v0(bkb.m6, wjbVar);
        this.K = i2;
        this.e = new pb0((wjb) null);
        eh6 eh6Var = new eh6(this, context, wjbVar);
        this.a = eh6Var;
        eh6Var.setRoundRadius(gl.L(23.0f));
        boolean z2 = k96.a0;
        addView(eh6Var, nme.d(46, 46.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : i + 7, 8.0f, z2 ? i + 7 : 0.0f, 0.0f));
        jia jiaVar = new jia(context);
        this.b = jiaVar;
        zkb.W(jiaVar, bkb.F6, wjbVar);
        jiaVar.setTextSize(17);
        jiaVar.setTypeface(gl.o());
        jiaVar.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z3 = k96.a0;
        addView(jiaVar, nme.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 46.0f : i2 + 68, 11.5f, z3 ? i2 + 68 : 46.0f, 0.0f));
        kk7.i(jiaVar);
        jia jiaVar2 = new jia(context);
        this.c = jiaVar2;
        jiaVar2.setTextSize(14);
        jiaVar2.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z4 = k96.a0;
        addView(jiaVar2, nme.d(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? 28.0f : i2 + 68, 34.5f, z4 ? i2 + 68 : 28.0f, 0.0f));
        if (z) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setFocusable(false);
            int i3 = bkb.Li;
            ff0 f0 = bkb.f0(bkb.v0(i3, wjbVar), 1, -1);
            vkb M = zkb.M(i3);
            imageView.setBackground(f0);
            zkb.j(imageView, f0, null, M, wjbVar);
            imageView.setImageResource(R.drawable.ic_ab_other);
            zkb.s(imageView, bkb.Ki, wjbVar, PorterDuff.Mode.MULTIPLY);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, nme.e(60, 64, (k96.a0 ? 3 : 5) | 48));
            imageView.setOnClickListener(new b95(this, (byte) 23));
            imageView.setContentDescription(k96.M0(2131754739, null));
        }
    }

    public final void a() {
        this.a.getImageReceiver().c();
    }

    public final void b() {
        if (this.P) {
            return;
        }
        int i = bkb.x6;
        wjb wjbVar = this.d;
        int v0 = bkb.v0(i, wjbVar);
        int v02 = bkb.v0(bkb.m6, wjbVar);
        if (v0 == this.I && v02 == this.J) {
            return;
        }
        jia jiaVar = this.c;
        if (jiaVar != null) {
            int textColor = jiaVar.getTextColor();
            if (textColor == this.I) {
                jiaVar.setTextColor(v0);
            } else if (textColor == this.J) {
                jiaVar.setTextColor(v02);
            }
        }
        this.I = v0;
        this.J = v02;
    }

    public final void c(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        float f;
        float f2;
        jia jiaVar = this.c;
        jia jiaVar2 = this.b;
        if (tLObject == null) {
            this.w = null;
            this.s = null;
            this.n = null;
            jiaVar2.l("", false);
            jiaVar.l("", false);
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
            boolean z2 = k96.a0;
            jiaVar2.setLayoutParams(nme.d(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? a ? 46 : 28 : b + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, k96.a0 ? b + 68 : a ? 46 : 28, 0.0f));
            boolean z3 = k96.a0;
            int i = (z3 ? 5 : 3) | 48;
            float f3 = z3 ? a ? 46 : 28 : b + 68;
            if (z3) {
                f2 = b + 68;
            } else {
                f2 = a ? 46 : 28;
            }
            jiaVar.setLayoutParams(nme.d(-1, 20.0f, i, f3, 34.5f, f2, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                boolean z4 = imageView2.getVisibility() == 0;
                boolean z5 = k96.a0;
                jiaVar2.setLayoutParams(nme.d(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? z4 ? 54 : 28 : b + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, k96.a0 ? b + 68 : z4 ? 54 : 28, 0.0f));
                boolean z6 = k96.a0;
                int i2 = (z6 ? 5 : 3) | 48;
                float f4 = z6 ? z4 ? 54 : 28 : b + 68;
                if (z6) {
                    f = b + 68;
                } else {
                    f = z4 ? 54 : 28;
                }
                jiaVar.setLayoutParams(nme.d(-1, 20.0f, i2, f4, 34.5f, f, 0.0f));
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
            eh6 eh6Var = this.a;
            jia jiaVar = this.b;
            pb0 pb0Var = this.e;
            boolean z2 = true;
            jia jiaVar2 = this.c;
            if (!z) {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    TLRPC.FileLocation fileLocation3 = chatPhoto != null ? chatPhoto.photo_small : null;
                    if (i != 0) {
                        int i2 = na7.q5;
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
                    pb0Var.p(chat);
                    CharSequence charSequence = this.s;
                    if (charSequence != null) {
                        this.x = null;
                        jiaVar.l(charSequence, false);
                    } else {
                        if (str == null) {
                            str = chat.title;
                        }
                        this.x = str;
                        jiaVar.l(str, false);
                    }
                    CharSequence charSequence2 = this.w;
                    int i3 = this.I;
                    if (charSequence2 != null) {
                        jiaVar2.setTextColor(i3);
                        jiaVar2.l(this.w, false);
                    } else {
                        jiaVar2.setTextColor(i3);
                        if (chat.participants_count != 0) {
                            if (!hc2.T(chat) || chat.megagroup) {
                                jiaVar2.l(k96.G(chat.participants_count, "Members", new Object[0]), false);
                            } else {
                                jiaVar2.l(k96.G(chat.participants_count, "Subscribers", new Object[0]), false);
                            }
                        } else if (chat.has_geo) {
                            jiaVar2.l(k96.M0(2131748450, null), false);
                        } else if (hc2.t0(chat)) {
                            jiaVar2.l(k96.M0(2131748446, null), false);
                        } else {
                            jiaVar2.l(k96.M0(2131748449, null), false);
                        }
                    }
                    this.E = fileLocation3;
                    eh6Var.f(chat, pb0Var);
                    return;
                }
                return;
            }
            TLRPC.User user = (TLRPC.User) tLObject;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation4 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            if (i != 0) {
                int i4 = na7.q5;
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
                    str2 = l7c.q(user);
                }
                z2 = z4;
                if (!z2) {
                    return;
                }
            } else {
                str2 = null;
            }
            pb0Var.q(user);
            TLRPC.UserStatus userStatus3 = user.status;
            if (userStatus3 != null) {
                this.y = userStatus3.expires;
            } else {
                this.y = 0;
            }
            CharSequence charSequence3 = this.s;
            if (charSequence3 != null) {
                this.x = null;
                jiaVar.l(charSequence3, false);
            } else {
                if (str2 == null) {
                    str2 = l7c.q(user);
                }
                this.x = str2;
                jiaVar.l(b00.e(jiaVar, str2, false, null, 0), false);
            }
            if (this.w != null) {
                jiaVar2.setTextColor(this.I);
                jiaVar2.l(this.w, false);
            } else {
                String q = cf3.q(user);
                if (user.bot) {
                    jiaVar2.setTextColor(this.I);
                    if (this.H && !TextUtils.isEmpty(q)) {
                        jiaVar2.l(q, false);
                    } else if (user.bot_chat_history || this.F) {
                        jiaVar2.l(k96.M0(2131752934, null), false);
                    } else {
                        jiaVar2.l(k96.M0(2131752935, null), false);
                    }
                } else if (!this.H || TextUtils.isEmpty(q)) {
                    long j = user.id;
                    int i5 = this.N;
                    if (j == y6c.h(i5).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i5).getCurrentTime()) || na7.q1(i5).a0.containsKey(Long.valueOf(user.id)))) {
                        jiaVar2.setTextColor(this.J);
                        jiaVar2.l(k96.M0(2131747633, null), false);
                    } else {
                        jiaVar2.setTextColor(this.I);
                        jiaVar2.l(k96.d0(i5, user, null, null), false);
                    }
                } else {
                    jiaVar2.l(q, false);
                    jiaVar2.setTextColor(this.I);
                }
            }
            this.E = fileLocation4;
            eh6Var.f(user, pb0Var);
        }
    }

    public be0 getAvatarImageView() {
        return this.a;
    }

    public Object getCurrentObject() {
        return this.n;
    }

    public u2b getStoryAvatarParams() {
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
                bkb.k0.setColor(bkb.v0(i, this.d));
            }
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(68.0f) : 0), getMeasuredHeight() - 1, this.L >= 0 ? bkb.k0 : bkb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(64.0f) + (this.G ? 1 : 0), TLObject.FLAG_30));
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
        zkb.s(this.h, bkb.ch, this.d, PorterDuff.Mode.MULTIPLY);
        addView(this.h, nme.e(52, 64, (k96.a0 ? 3 : 5) | 48));
    }

    public void setDelegate(fh6 fh6Var) {
        this.M = fh6Var;
    }

    public void setDividerColor(int i) {
        this.L = i;
    }

    public void setIsAdmin(boolean z) {
        this.F = z;
    }

    public void setNameColor(int i) {
        jia jiaVar = this.b;
        zkb.q(jiaVar);
        jiaVar.setTextColor(i);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            b();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
