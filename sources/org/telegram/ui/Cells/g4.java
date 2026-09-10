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
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g4 extends FrameLayout {
    public boolean E;
    public final int F;
    public ValueAnimator G;
    public boolean H;
    public float I;
    public final Paint J;
    public final boolean K;
    public final boolean L;
    public final org.telegram.ui.ActionBar.f6 M;
    public final org.telegram.ui.Components.d6 N;
    public boolean O;
    public long P;
    public TL_account.requirementToContactPremium Q;
    public boolean R;
    public qg.c1 S;
    public Drawable T;
    public Paint U;
    public final org.telegram.ui.Components.w9 a;
    public final f4 b;
    public final org.telegram.ui.ActionBar.l5 c;
    public final tp d;
    public final org.telegram.ui.Components.g9 e;
    public Object f;
    public CharSequence h;
    public CharSequence n;
    public boolean r;
    public boolean s;
    public final int v;
    public final int w;
    public String x;
    public int y;

    public g4(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public static org.telegram.ui.Components.g9 a(boolean z10) {
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.g(8);
        g9Var.p = z10 ? 0.8f : 1.1f;
        g9Var.i(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.T7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a8, false));
        return g9Var;
    }

    public static vq b(Context context, boolean z10) {
        vq vqVar = new vq(new bi.w4(new qg.c1(org.telegram.ui.ActionBar.j6.Mj, org.telegram.ui.ActionBar.j6.Lj, -1, -1, null), 3), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z10) {
            int dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(18.0f);
            vqVar.e = dp;
            vqVar.f = dp2;
        }
        return vqVar;
    }

    public final void c(boolean z10, boolean z11) {
        tp tpVar = this.d;
        if (tpVar != null) {
            tpVar.a(z10, z11);
            return;
        }
        if (this.v != 2 || this.H == z10) {
            return;
        }
        this.H = z10;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new r(this, 3));
            this.G.addListener(new bi.h(this, 27));
            this.G.setDuration(180L);
            this.G.setInterpolator(wr.g);
            this.G.start();
        } else {
            float f7 = this.H ? 0.82f : 1.0f;
            org.telegram.ui.Components.w9 w9Var = this.a;
            w9Var.setScaleX(f7);
            w9Var.setScaleY(this.H ? 0.82f : 1.0f);
            this.I = this.H ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f = obj;
        this.n = charSequence2;
        this.h = charSequence;
        this.E = false;
        this.r = false;
        this.s = false;
        f(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float e = this.N.e(this.O);
        if (e > 0.0f) {
            org.telegram.ui.Components.w9 w9Var = this.a;
            float height = (w9Var.getHeight() / 2.0f) + w9Var.getY() + AndroidUtilities.dp(18.0f);
            float width = (w9Var.getWidth() / 2.0f) + w9Var.getX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.j6.t0;
            int i10 = org.telegram.ui.ActionBar.j6.d6;
            org.telegram.ui.ActionBar.f6 f6Var = this.M;
            paint2.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * e, org.telegram.ui.ActionBar.j6.t0);
            if (this.Q == null) {
                if (this.S == null) {
                    this.S = new qg.c1(org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, -1, -1, this.M);
                }
                this.S.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                paint = this.S.f;
            } else {
                if (this.U == null) {
                    this.U = new Paint();
                }
                this.U.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.c8, f6Var));
                paint = this.U;
            }
            canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * e, paint);
            if (this.T == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.T = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.T.setBounds((int) (width - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * e)), (int) (height - (((this.T.getIntrinsicHeight() / 2.0f) * 0.875f) * e)), (int) (((this.T.getIntrinsicWidth() / 2.0f) * 0.875f * e) + width), (int) (((this.T.getIntrinsicHeight() / 2.0f) * 0.875f * e) + height));
            this.T.setAlpha((int) (e * 255.0f));
            this.T.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(TLObject tLObject, String str, String str2, boolean z10) {
        d(tLObject, str, str2);
        this.E = z10;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.M;
        boolean z11 = this.K;
        tp tpVar = this.d;
        org.telegram.ui.Components.w9 w9Var = this.a;
        f4 f4Var = this.b;
        org.telegram.ui.Components.g9 g9Var = this.e;
        org.telegram.ui.ActionBar.l5 l5Var = this.c;
        if (z10) {
            ((FrameLayout.LayoutParams) f4Var.getLayoutParams()).topMargin = AndroidUtilities.dp(15.0f);
            ViewGroup.LayoutParams layoutParams = w9Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = w9Var.getLayoutParams();
            int dp = AndroidUtilities.dp(38.0f);
            layoutParams2.height = dp;
            layoutParams.width = dp;
            if (tpVar != null) {
                ((FrameLayout.LayoutParams) tpVar.getLayoutParams()).topMargin = AndroidUtilities.dp(25.0f);
                if (LocaleController.isRTL) {
                    ((FrameLayout.LayoutParams) tpVar.getLayoutParams()).rightMargin = AndroidUtilities.dp(31.0f);
                } else {
                    ((FrameLayout.LayoutParams) tpVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(32.0f);
                }
            }
            String str4 = (String) this.f;
            str4.getClass();
            switch (str4) {
                case "archived":
                    g9Var.g(11);
                    break;
                case "groups":
                    g9Var.g(6);
                    break;
                case "non_contacts":
                    g9Var.g(5);
                    break;
                case "contacts":
                    g9Var.g(4);
                    break;
                case "new_chats":
                    g9Var.g(24);
                    break;
                case "bots":
                    g9Var.g(8);
                    break;
                case "read":
                    g9Var.g(10);
                    break;
                case "muted":
                    g9Var.g(9);
                    break;
                case "existing_chats":
                    g9Var.g(23);
                    break;
                case "channels":
                    g9Var.g(7);
                    break;
            }
            this.x = null;
            f4Var.l(this.h, true);
            l5Var.l(null, false);
            w9Var.f(null, "50_50", g9Var);
        } else {
            CharSequence charSequence2 = this.n;
            if (charSequence2 == null || !TextUtils.isEmpty(charSequence2)) {
                ((FrameLayout.LayoutParams) f4Var.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            } else {
                ((FrameLayout.LayoutParams) f4Var.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
            }
            ViewGroup.LayoutParams layoutParams3 = w9Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams4 = w9Var.getLayoutParams();
            int dp2 = AndroidUtilities.dp(46.0f);
            layoutParams4.height = dp2;
            layoutParams3.width = dp2;
            if (tpVar != null) {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) tpVar.getLayoutParams();
                int dp3 = AndroidUtilities.dp(29.0f);
                int i12 = this.F;
                layoutParams5.topMargin = dp3 + i12;
                if (LocaleController.isRTL) {
                    ((FrameLayout.LayoutParams) tpVar.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + i12;
                } else {
                    ((FrameLayout.LayoutParams) tpVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(40.0f) + i12;
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
                g9Var.k(i13, chat2);
                CharSequence charSequence3 = this.h;
                if (charSequence3 != null) {
                    this.x = null;
                    f4Var.l(charSequence3, true);
                    i11 = 0;
                } else {
                    if (str == null) {
                        str = chat2.title;
                    }
                    this.x = str;
                    i11 = 0;
                    f4Var.l(str, false);
                }
                if (this.n == null) {
                    int i14 = org.telegram.ui.ActionBar.j6.y6;
                    l5Var.setTag(Integer.valueOf(i14));
                    if (z11) {
                        i14 = org.telegram.ui.ActionBar.j6.og;
                    }
                    l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, i11));
                    l5Var.setEmojiColor(l5Var.getTextColor());
                    if (chat2.participants_count != 0) {
                        if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                            l5Var.l(LocaleController.formatPluralString("Members", chat2.participants_count, new Object[i11]), i11);
                        } else {
                            l5Var.l(LocaleController.formatPluralString("Subscribers", chat2.participants_count, new Object[i11]), i11);
                        }
                    } else if (chat2.has_geo) {
                        l5Var.l(LocaleController.getString(R.string.MegaLocation), i11);
                    } else if (ChatObject.isPublic(chat2)) {
                        if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                            l5Var.l(LocaleController.getString(R.string.MegaPublic), i11);
                        } else {
                            l5Var.l(LocaleController.getString(R.string.ChannelPublic), i11);
                        }
                    } else if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                        l5Var.l(LocaleController.getString(R.string.MegaPrivate), i11);
                    } else {
                        l5Var.l(LocaleController.getString(R.string.ChannelPrivate), i11);
                    }
                }
                w9Var.e(chat2, g9Var);
                chat = chat2;
                w9Var.setRoundRadius(AndroidUtilities.dp((chat == null && chat.forum) ? 14.0f : 24.0f));
                charSequence = this.n;
                if (charSequence != null) {
                    l5Var.l(charSequence, true);
                    int i15 = org.telegram.ui.ActionBar.j6.y6;
                    l5Var.setTag(Integer.valueOf(i15));
                    if (z11) {
                        i15 = org.telegram.ui.ActionBar.j6.og;
                    }
                    l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
                    l5Var.setEmojiColor(l5Var.getTextColor());
                }
                g();
            }
            TLRPC.User user = (TLRPC.User) obj2;
            if (this.L && UserObject.isUserSelf(user)) {
                f4Var.l(LocaleController.getString(R.string.SavedMessages), true);
                l5Var.l(null, false);
                g9Var.g(1);
                w9Var.h(null, "50_50", g9Var, user);
                ((FrameLayout.LayoutParams) f4Var.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
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
            g9Var.m(i13, user);
            TLRPC.UserStatus userStatus3 = user.status;
            this.y = userStatus3 != null ? userStatus3.expires : 0;
            CharSequence charSequence4 = this.h;
            if (charSequence4 != null) {
                this.x = null;
                f4Var.l(charSequence4, true);
            } else {
                if (str3 == null) {
                    str3 = UserObject.getUserName(user);
                }
                this.x = str3;
                f4Var.l(str3, false);
            }
            if (this.n == null) {
                if (user.bot) {
                    int i16 = org.telegram.ui.ActionBar.j6.y6;
                    l5Var.setTag(Integer.valueOf(i16));
                    if (z11) {
                        i16 = org.telegram.ui.ActionBar.j6.og;
                    }
                    l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var));
                    l5Var.l(LocaleController.getString(R.string.Bot), false);
                } else if (user.id == UserConfig.getInstance(i13).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i13).getCurrentTime()) || MessagesController.getInstance(i13).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                    int i17 = org.telegram.ui.ActionBar.j6.n6;
                    l5Var.setTag(Integer.valueOf(i17));
                    if (z11) {
                        i17 = org.telegram.ui.ActionBar.j6.pg;
                    }
                    l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i17, f6Var));
                    l5Var.l(LocaleController.getString(R.string.Online), false);
                } else {
                    int i18 = org.telegram.ui.ActionBar.j6.y6;
                    l5Var.setTag(Integer.valueOf(i18));
                    if (z11) {
                        i18 = org.telegram.ui.ActionBar.j6.og;
                    }
                    l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var));
                    l5Var.l(LocaleController.formatUserStatus(i13, user), false);
                }
                l5Var.setEmojiColor(l5Var.getTextColor());
            }
            w9Var.e(user, g9Var);
        }
        chat = null;
        w9Var.setRoundRadius(AndroidUtilities.dp((chat == null && chat.forum) ? 14.0f : 24.0f));
        charSequence = this.n;
        if (charSequence != null) {
        }
        g();
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.R) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.Q;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f instanceof TLRPC.User) {
                requirementToContact = MessagesController.getInstance(this.w).isUserContactBlocked(((TLRPC.User) this.f).id);
            }
        }
        if (this.O == DialogObject.isPremiumBlocked(requirementToContact) && this.P == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.O = DialogObject.isPremiumBlocked(requirementToContact);
        this.P = DialogObject.getMessagesStarsPrice(requirementToContact);
        this.N.f(this.O, true);
        invalidate();
    }

    public tp getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f;
    }

    public org.telegram.ui.ActionBar.l5 getStatusTextView() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e = this.N.e(this.O);
        org.telegram.ui.ActionBar.f6 f6Var = this.M;
        if (e <= 0.0f && this.v == 2 && (this.H || this.I > 0.0f)) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W6, f6Var);
            Paint paint = this.J;
            paint.setColor(v02);
            org.telegram.ui.Components.w9 w9Var = this.a;
            canvas.drawCircle((w9Var.getMeasuredWidth() / 2) + w9Var.getLeft(), (w9Var.getMeasuredHeight() / 2) + w9Var.getTop(), (AndroidUtilities.dp(4.0f) * this.I) + AndroidUtilities.dp(18.0f), paint);
        }
        if (this.E) {
            boolean z10 = LocaleController.isRTL;
            int i10 = this.F;
            int dp = AndroidUtilities.dp(z10 ? 0.0f : i10 + 72);
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? i10 + 72 : 0.0f);
            if (!this.K) {
                canvas.drawRect(dp, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
            } else {
                org.telegram.ui.ActionBar.j6.l0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gg, f6Var));
                canvas.drawRect(dp, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.j6.l0);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        tp tpVar = this.d;
        if (tpVar != null ? tpVar.a.q : this.H) {
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
        tp tpVar = this.d;
        if (tpVar != null) {
            tpVar.setEnabled(z10);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.E = z10;
        invalidate();
    }

    public void setForbiddenCheck(boolean z10) {
        this.d.setForbidden(z10);
    }

    public g4(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context);
        this.w = UserConfig.selectedAccount;
        this.N = new org.telegram.ui.Components.d6(this, 0L, 350L, wr.h);
        this.M = f6Var;
        this.v = i10;
        this.K = z11;
        this.E = false;
        this.F = i11;
        this.L = z10;
        this.e = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z12 = LocaleController.isRTL;
        addView(w9Var, w7.a6.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i11 + 13, 6.0f, z12 ? i11 + 13 : 0.0f, 0.0f));
        f4 f4Var = new f4(context, 0);
        this.b = f4Var;
        NotificationCenter.listenEmojiLoading(f4Var);
        f4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(z11 ? org.telegram.ui.ActionBar.j6.ng : org.telegram.ui.ActionBar.j6.G6, f6Var));
        f4Var.setTypeface(AndroidUtilities.bold());
        f4Var.setTextSize(16);
        f4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(f4Var, w7.a6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i11, 10.0f, (z13 ? 72 : 28) + i11, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.c = l5Var;
        l5Var.setTextSize(14);
        l5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(l5Var, w7.a6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, (z14 ? 28 : 72) + i11, 32.0f, (z14 ? 72 : 28) + i11, 0.0f));
        if (i10 == 1) {
            tp tpVar = new tp(context, 21, f6Var);
            this.d = tpVar;
            tpVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
            tpVar.setDrawUnchecked(false);
            tpVar.setDrawBackgroundAsArc(3);
            boolean z15 = LocaleController.isRTL;
            addView(tpVar, w7.a6.d(24, 24.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : i11 + 40, 33.0f, z15 ? i11 + 39 : 0.0f, 0.0f));
        } else if (i10 == 2) {
            Paint paint = new Paint(1);
            this.J = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
        setWillNotDraw(false);
    }
}
