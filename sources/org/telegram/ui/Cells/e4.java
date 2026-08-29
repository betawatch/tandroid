package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e4 extends FrameLayout {
    public boolean A;
    public final int B;
    public ValueAnimator C;
    public boolean D;
    public float E;
    public final Paint F;
    public final boolean G;
    public final boolean H;
    public final org.telegram.ui.ActionBar.c6 I;
    public final org.telegram.ui.Components.d6 J;
    public boolean K;
    public long L;
    public TL_account.requirementToContactPremium M;
    public boolean N;
    public cg.r1 O;
    public Drawable P;
    public Paint Q;
    public final org.telegram.ui.Components.t9 a;
    public final gg.c b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final hp d;
    public final org.telegram.ui.Components.e9 e;
    public Object f;
    public CharSequence h;
    public CharSequence n;
    public boolean r;
    public boolean s;
    public final int v;
    public final int w;
    public String x;
    public int y;

    public e4(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public static org.telegram.ui.Components.e9 a(boolean z10) {
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.g(8);
        e9Var.p = z10 ? 0.8f : 1.1f;
        e9Var.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.T7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a8, false));
        return e9Var;
    }

    public static jq b(Context context, boolean z10) {
        jq jqVar = new jq(new bg.m1(new cg.r1(org.telegram.ui.ActionBar.g6.Mj, org.telegram.ui.ActionBar.g6.Lj, -1, -1, null), 4), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z10) {
            int dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(18.0f);
            jqVar.e = dp;
            jqVar.f = dp2;
        }
        return jqVar;
    }

    public final void c(boolean z10, boolean z11) {
        hp hpVar = this.d;
        if (hpVar != null) {
            hpVar.a(z10, z11);
            return;
        }
        if (this.v != 2 || this.D == z10) {
            return;
        }
        this.D = z10;
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new r(this, 3));
            this.C.addListener(new nh.q5(this, 15));
            this.C.setDuration(180L);
            this.C.setInterpolator(jr.g);
            this.C.start();
        } else {
            float f9 = this.D ? 0.82f : 1.0f;
            org.telegram.ui.Components.t9 t9Var = this.a;
            t9Var.setScaleX(f9);
            t9Var.setScaleY(this.D ? 0.82f : 1.0f);
            this.E = this.D ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f = obj;
        this.n = charSequence2;
        this.h = charSequence;
        this.A = false;
        this.r = false;
        this.s = false;
        f(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float e10 = this.J.e(this.K);
        if (e10 > 0.0f) {
            org.telegram.ui.Components.t9 t9Var = this.a;
            float height = (t9Var.getHeight() / 2.0f) + t9Var.getY() + AndroidUtilities.dp(18.0f);
            float width = (t9Var.getWidth() / 2.0f) + t9Var.getX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.g6.t0;
            int i10 = org.telegram.ui.ActionBar.g6.d6;
            org.telegram.ui.ActionBar.c6 c6Var = this.I;
            paint2.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * e10, org.telegram.ui.ActionBar.g6.t0);
            if (this.M == null) {
                if (this.O == null) {
                    this.O = new cg.r1(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, this.I);
                }
                this.O.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                paint = this.O.f;
            } else {
                if (this.Q == null) {
                    this.Q = new Paint();
                }
                this.Q.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.c8, c6Var));
                paint = this.Q;
            }
            canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * e10, paint);
            if (this.P == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.P = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.P.setBounds((int) (width - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * e10)), (int) (height - (((this.P.getIntrinsicHeight() / 2.0f) * 0.875f) * e10)), (int) (((this.P.getIntrinsicWidth() / 2.0f) * 0.875f * e10) + width), (int) (((this.P.getIntrinsicHeight() / 2.0f) * 0.875f * e10) + height));
            this.P.setAlpha((int) (e10 * 255.0f));
            this.P.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(TLObject tLObject, String str, String str2, boolean z10) {
        d(tLObject, str, str2);
        this.A = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0413  */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i10) {
        String str;
        int i11;
        TLRPC.Chat chat;
        String str2;
        String str3;
        TLRPC.UserStatus userStatus;
        CharSequence charSequence;
        Object obj = this.f;
        if (obj == null || this.r || this.s) {
            return;
        }
        boolean z10 = obj instanceof String;
        org.telegram.ui.ActionBar.c6 c6Var = this.I;
        boolean z11 = this.G;
        hp hpVar = this.d;
        org.telegram.ui.Components.t9 t9Var = this.a;
        gg.c cVar = this.b;
        org.telegram.ui.Components.e9 e9Var = this.e;
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        if (z10) {
            ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = AndroidUtilities.dp(15.0f);
            ViewGroup.LayoutParams layoutParams = t9Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = t9Var.getLayoutParams();
            int dp = AndroidUtilities.dp(38.0f);
            layoutParams2.height = dp;
            layoutParams.width = dp;
            if (hpVar != null) {
                ((FrameLayout.LayoutParams) hpVar.getLayoutParams()).topMargin = AndroidUtilities.dp(25.0f);
                if (LocaleController.isRTL) {
                    ((FrameLayout.LayoutParams) hpVar.getLayoutParams()).rightMargin = AndroidUtilities.dp(31.0f);
                } else {
                    ((FrameLayout.LayoutParams) hpVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(32.0f);
                }
            }
            String str4 = (String) this.f;
            str4.getClass();
            switch (str4) {
                case "archived":
                    e9Var.g(11);
                    break;
                case "groups":
                    e9Var.g(6);
                    break;
                case "non_contacts":
                    e9Var.g(5);
                    break;
                case "contacts":
                    e9Var.g(4);
                    break;
                case "new_chats":
                    e9Var.g(24);
                    break;
                case "bots":
                    e9Var.g(8);
                    break;
                case "read":
                    e9Var.g(10);
                    break;
                case "muted":
                    e9Var.g(9);
                    break;
                case "existing_chats":
                    e9Var.g(23);
                    break;
                case "channels":
                    e9Var.g(7);
                    break;
            }
            this.x = null;
            cVar.l(this.h, true);
            h5Var.l(null, false);
            t9Var.f(null, "50_50", e9Var);
        } else {
            CharSequence charSequence2 = this.n;
            if (charSequence2 == null || !TextUtils.isEmpty(charSequence2)) {
                ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            } else {
                ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
            }
            ViewGroup.LayoutParams layoutParams3 = t9Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams4 = t9Var.getLayoutParams();
            int dp2 = AndroidUtilities.dp(46.0f);
            layoutParams4.height = dp2;
            layoutParams3.width = dp2;
            if (hpVar != null) {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) hpVar.getLayoutParams();
                int dp3 = AndroidUtilities.dp(29.0f);
                int i12 = this.B;
                layoutParams5.topMargin = dp3 + i12;
                if (LocaleController.isRTL) {
                    ((FrameLayout.LayoutParams) hpVar.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + i12;
                } else {
                    ((FrameLayout.LayoutParams) hpVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(40.0f) + i12;
                }
            }
            Object obj2 = this.f;
            boolean z12 = obj2 instanceof TLRPC.User;
            int i13 = this.w;
            if (!z12) {
                TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
                TLRPC.ChatPhoto chatPhoto = chat2.photo;
                TLRPC.FileLocation fileLocation = chatPhoto != null ? chatPhoto.photo_small : null;
                if (i10 != 0) {
                    boolean z13 = ((i10 & MessagesController.UPDATE_MASK_AVATAR) == 0 || fileLocation == null) ? false : true;
                    if (z13 || this.h != null || (str2 = this.x) == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                        str = null;
                    } else {
                        str = chat2.title;
                        if (!str.equals(str2)) {
                            z13 = true;
                        }
                    }
                    if (!z13) {
                        return;
                    }
                } else {
                    str = null;
                }
                e9Var.k(i13, chat2);
                CharSequence charSequence3 = this.h;
                if (charSequence3 != null) {
                    this.x = null;
                    cVar.l(charSequence3, true);
                    i11 = 0;
                } else {
                    if (str == null) {
                        str = chat2.title;
                    }
                    this.x = str;
                    i11 = 0;
                    cVar.l(str, false);
                }
                if (this.n == null) {
                    int i14 = org.telegram.ui.ActionBar.g6.y6;
                    h5Var.setTag(Integer.valueOf(i14));
                    if (z11) {
                        i14 = org.telegram.ui.ActionBar.g6.og;
                    }
                    h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, i11));
                    h5Var.setEmojiColor(h5Var.getTextColor());
                    if (chat2.participants_count != 0) {
                        if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                            h5Var.l(LocaleController.formatPluralString("Members", chat2.participants_count, new Object[i11]), i11);
                        } else {
                            h5Var.l(LocaleController.formatPluralString("Subscribers", chat2.participants_count, new Object[i11]), i11);
                        }
                    } else if (chat2.has_geo) {
                        h5Var.l(LocaleController.getString(R.string.MegaLocation), i11);
                    } else if (ChatObject.isPublic(chat2)) {
                        if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                            h5Var.l(LocaleController.getString(R.string.MegaPublic), i11);
                        } else {
                            h5Var.l(LocaleController.getString(R.string.ChannelPublic), i11);
                        }
                    } else if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                        h5Var.l(LocaleController.getString(R.string.MegaPrivate), i11);
                    } else {
                        h5Var.l(LocaleController.getString(R.string.ChannelPrivate), i11);
                    }
                }
                t9Var.e(chat2, e9Var);
                chat = chat2;
                t9Var.setRoundRadius(AndroidUtilities.dp((chat == null && chat.forum) ? 14.0f : 24.0f));
                charSequence = this.n;
                if (charSequence != null) {
                    h5Var.l(charSequence, true);
                    int i15 = org.telegram.ui.ActionBar.g6.y6;
                    h5Var.setTag(Integer.valueOf(i15));
                    if (z11) {
                        i15 = org.telegram.ui.ActionBar.g6.og;
                    }
                    h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
                    h5Var.setEmojiColor(h5Var.getTextColor());
                }
                g();
            }
            TLRPC.User user = (TLRPC.User) obj2;
            if (this.H && UserObject.isUserSelf(user)) {
                cVar.l(LocaleController.getString(R.string.SavedMessages), true);
                h5Var.l(null, false);
                e9Var.g(1);
                t9Var.h(null, "50_50", e9Var, user);
                ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
                return;
            }
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation2 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            if (i10 != 0) {
                boolean z14 = ((i10 & MessagesController.UPDATE_MASK_AVATAR) == 0 || fileLocation2 == null) ? false : true;
                if (this.n == null && !z14 && (i10 & MessagesController.UPDATE_MASK_STATUS) != 0) {
                    TLRPC.UserStatus userStatus2 = user.status;
                    if ((userStatus2 != null ? userStatus2.expires : 0) != this.y) {
                        z14 = true;
                    }
                }
                if (z14 || this.h != null || this.x == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                    str3 = null;
                } else {
                    str3 = UserObject.getUserName(user);
                    if (!str3.equals(this.x)) {
                        z14 = true;
                    }
                }
                if (!z14) {
                    return;
                }
            } else {
                str3 = null;
            }
            e9Var.m(i13, user);
            TLRPC.UserStatus userStatus3 = user.status;
            this.y = userStatus3 != null ? userStatus3.expires : 0;
            CharSequence charSequence4 = this.h;
            if (charSequence4 != null) {
                this.x = null;
                cVar.l(charSequence4, true);
            } else {
                if (str3 == null) {
                    str3 = UserObject.getUserName(user);
                }
                this.x = str3;
                cVar.l(str3, false);
            }
            if (this.n == null) {
                if (user.bot) {
                    int i16 = org.telegram.ui.ActionBar.g6.y6;
                    h5Var.setTag(Integer.valueOf(i16));
                    if (z11) {
                        i16 = org.telegram.ui.ActionBar.g6.og;
                    }
                    h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var));
                    h5Var.l(LocaleController.getString(R.string.Bot), false);
                } else if (user.id == UserConfig.getInstance(i13).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i13).getCurrentTime()) || MessagesController.getInstance(i13).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                    int i17 = org.telegram.ui.ActionBar.g6.n6;
                    h5Var.setTag(Integer.valueOf(i17));
                    if (z11) {
                        i17 = org.telegram.ui.ActionBar.g6.pg;
                    }
                    h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i17, c6Var));
                    h5Var.l(LocaleController.getString(R.string.Online), false);
                } else {
                    int i18 = org.telegram.ui.ActionBar.g6.y6;
                    h5Var.setTag(Integer.valueOf(i18));
                    if (z11) {
                        i18 = org.telegram.ui.ActionBar.g6.og;
                    }
                    h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i18, c6Var));
                    h5Var.l(LocaleController.formatUserStatus(i13, user), false);
                }
                h5Var.setEmojiColor(h5Var.getTextColor());
            }
            t9Var.e(user, e9Var);
        }
        chat = null;
        t9Var.setRoundRadius(AndroidUtilities.dp((chat == null && chat.forum) ? 14.0f : 24.0f));
        charSequence = this.n;
        if (charSequence != null) {
        }
        g();
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.N) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.M;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f instanceof TLRPC.User) {
                requirementToContact = MessagesController.getInstance(this.w).isUserContactBlocked(((TLRPC.User) this.f).id);
            }
        }
        if (this.K == DialogObject.isPremiumBlocked(requirementToContact) && this.L == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.K = DialogObject.isPremiumBlocked(requirementToContact);
        this.L = DialogObject.getMessagesStarsPrice(requirementToContact);
        this.J.f(this.K, true);
        invalidate();
    }

    public hp getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f;
    }

    public org.telegram.ui.ActionBar.h5 getStatusTextView() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e10 = this.J.e(this.K);
        org.telegram.ui.ActionBar.c6 c6Var = this.I;
        if (e10 <= 0.0f && this.v == 2 && (this.D || this.E > 0.0f)) {
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W6, c6Var);
            Paint paint = this.F;
            paint.setColor(v02);
            org.telegram.ui.Components.t9 t9Var = this.a;
            canvas.drawCircle((t9Var.getMeasuredWidth() / 2) + t9Var.getLeft(), (t9Var.getMeasuredHeight() / 2) + t9Var.getTop(), (AndroidUtilities.dp(4.0f) * this.E) + AndroidUtilities.dp(18.0f), paint);
        }
        if (this.A) {
            boolean z10 = LocaleController.isRTL;
            int i10 = this.B;
            int dp = AndroidUtilities.dp(z10 ? 0.0f : i10 + 72);
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? i10 + 72 : 0.0f);
            if (!this.G) {
                canvas.drawRect(dp, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var));
            } else {
                org.telegram.ui.ActionBar.g6.l0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gg, c6Var));
                canvas.drawRect(dp, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.g6.l0);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        hp hpVar = this.d;
        if (hpVar != null ? hpVar.a.q : this.D) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        Object obj = this.f;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((!(obj instanceof String) || "premium".equalsIgnoreCase((String) obj) || "miniapps".equalsIgnoreCase((String) this.f)) ? 58.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setCheckBoxEnabled(boolean z10) {
        hp hpVar = this.d;
        if (hpVar != null) {
            hpVar.setEnabled(z10);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.A = z10;
        invalidate();
    }

    public void setForbiddenCheck(boolean z10) {
        this.d.setForbidden(z10);
    }

    public e4(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        this.w = UserConfig.selectedAccount;
        this.J = new org.telegram.ui.Components.d6(this, 0L, 350L, jr.h);
        this.I = c6Var;
        this.v = i10;
        this.G = z11;
        this.A = false;
        this.B = i11;
        this.H = z10;
        this.e = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z12 = LocaleController.isRTL;
        addView(t9Var, i7.f6.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i11 + 13, 6.0f, z12 ? i11 + 13 : 0.0f, 0.0f));
        gg.c cVar = new gg.c(context, 2);
        this.b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(z11 ? org.telegram.ui.ActionBar.g6.ng : org.telegram.ui.ActionBar.g6.G6, c6Var));
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setTextSize(16);
        cVar.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(cVar, i7.f6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i11, 10.0f, (z13 ? 72 : 28) + i11, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(h5Var, i7.f6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, (z14 ? 28 : 72) + i11, 32.0f, (z14 ? 72 : 28) + i11, 0.0f));
        if (i10 == 1) {
            hp hpVar = new hp(context, 21, c6Var);
            this.d = hpVar;
            hpVar.b(-1, org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.k7);
            hpVar.setDrawUnchecked(false);
            hpVar.setDrawBackgroundAsArc(3);
            boolean z15 = LocaleController.isRTL;
            addView(hpVar, i7.f6.d(24, 24.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : i11 + 40, 33.0f, z15 ? i11 + 39 : 0.0f, 0.0f));
        } else if (i10 == 2) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
        setWillNotDraw(false);
    }
}
