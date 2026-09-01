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
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class g4 extends FrameLayout {
    public boolean B;
    public final int C;
    public ValueAnimator D;
    public boolean E;
    public float F;
    public final Paint G;
    public final boolean H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.g6 J;
    public final org.telegram.ui.Components.z5 K;
    public boolean L;
    public long M;
    public TL_account.requirementToContactPremium N;
    public boolean O;
    public fg.p1 P;
    public Drawable Q;
    public Paint R;
    public final org.telegram.ui.Components.p9 a;
    public final jg.c b;
    public final org.telegram.ui.ActionBar.l5 c;
    public final np d;
    public final org.telegram.ui.Components.z8 e;
    public Object f;
    public CharSequence h;
    public CharSequence n;
    public boolean r;
    public boolean s;
    public final int v;
    public final int w;
    public String x;
    public int y;

    public g4(Context context, int i10, int i11, boolean z4) {
        this(i10, i11, context, null, z4, false);
    }

    public static org.telegram.ui.Components.z8 a(boolean z4) {
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        z8Var.g(8);
        z8Var.p = z4 ? 0.8f : 1.1f;
        z8Var.i(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.T7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a8, false));
        return z8Var;
    }

    public static pq b(Context context, boolean z4) {
        pq pqVar = new pq(new eg.i1(new fg.p1(org.telegram.ui.ActionBar.k6.Mj, org.telegram.ui.ActionBar.k6.Lj, -1, -1, null), 3), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z4) {
            int dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(18.0f);
            pqVar.e = dp;
            pqVar.f = dp2;
        }
        return pqVar;
    }

    public final void c(boolean z4, boolean z10) {
        np npVar = this.d;
        if (npVar != null) {
            npVar.a(z4, z10);
            return;
        }
        if (this.v != 2 || this.E == z4) {
            return;
        }
        this.E = z4;
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.D = ofFloat;
            ofFloat.addUpdateListener(new r(this, 3));
            this.D.addListener(new org.telegram.ui.s5(this, 6));
            this.D.setDuration(180L);
            this.D.setInterpolator(pr.g);
            this.D.start();
        } else {
            float f10 = this.E ? 0.82f : 1.0f;
            org.telegram.ui.Components.p9 p9Var = this.a;
            p9Var.setScaleX(f10);
            p9Var.setScaleY(this.E ? 0.82f : 1.0f);
            this.F = this.E ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f = obj;
        this.n = charSequence2;
        this.h = charSequence;
        this.B = false;
        this.r = false;
        this.s = false;
        f(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float e6 = this.K.e(this.L);
        if (e6 > 0.0f) {
            org.telegram.ui.Components.p9 p9Var = this.a;
            float height = (p9Var.getHeight() / 2.0f) + p9Var.getY() + AndroidUtilities.dp(18.0f);
            float width = (p9Var.getWidth() / 2.0f) + p9Var.getX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.k6.t0;
            int i10 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.g6 g6Var = this.J;
            paint2.setColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
            canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * e6, org.telegram.ui.ActionBar.k6.t0);
            if (this.N == null) {
                if (this.P == null) {
                    this.P = new fg.p1(org.telegram.ui.ActionBar.k6.Lj, org.telegram.ui.ActionBar.k6.Mj, -1, -1, this.J);
                }
                this.P.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                paint = this.P.f;
            } else {
                if (this.R == null) {
                    this.R = new Paint();
                }
                this.R.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.c8, g6Var));
                paint = this.R;
            }
            canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * e6, paint);
            if (this.Q == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.Q = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.Q.setBounds((int) (width - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * e6)), (int) (height - (((this.Q.getIntrinsicHeight() / 2.0f) * 0.875f) * e6)), (int) (((this.Q.getIntrinsicWidth() / 2.0f) * 0.875f * e6) + width), (int) (((this.Q.getIntrinsicHeight() / 2.0f) * 0.875f * e6) + height));
            this.Q.setAlpha((int) (e6 * 255.0f));
            this.Q.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(TLObject tLObject, String str, String str2, boolean z4) {
        d(tLObject, str, str2);
        this.B = z4;
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
        boolean z4 = obj instanceof String;
        org.telegram.ui.ActionBar.g6 g6Var = this.J;
        boolean z10 = this.H;
        np npVar = this.d;
        org.telegram.ui.Components.p9 p9Var = this.a;
        jg.c cVar = this.b;
        org.telegram.ui.Components.z8 z8Var = this.e;
        org.telegram.ui.ActionBar.l5 l5Var = this.c;
        if (z4) {
            ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = AndroidUtilities.dp(15.0f);
            ViewGroup.LayoutParams layoutParams = p9Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = p9Var.getLayoutParams();
            int dp = AndroidUtilities.dp(38.0f);
            layoutParams2.height = dp;
            layoutParams.width = dp;
            if (npVar != null) {
                ((FrameLayout.LayoutParams) npVar.getLayoutParams()).topMargin = AndroidUtilities.dp(25.0f);
                if (LocaleController.isRTL) {
                    ((FrameLayout.LayoutParams) npVar.getLayoutParams()).rightMargin = AndroidUtilities.dp(31.0f);
                } else {
                    ((FrameLayout.LayoutParams) npVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(32.0f);
                }
            }
            String str4 = (String) this.f;
            str4.getClass();
            switch (str4) {
                case "archived":
                    z8Var.g(11);
                    break;
                case "groups":
                    z8Var.g(6);
                    break;
                case "non_contacts":
                    z8Var.g(5);
                    break;
                case "contacts":
                    z8Var.g(4);
                    break;
                case "new_chats":
                    z8Var.g(24);
                    break;
                case "bots":
                    z8Var.g(8);
                    break;
                case "read":
                    z8Var.g(10);
                    break;
                case "muted":
                    z8Var.g(9);
                    break;
                case "existing_chats":
                    z8Var.g(23);
                    break;
                case "channels":
                    z8Var.g(7);
                    break;
            }
            this.x = null;
            cVar.l(this.h, true);
            l5Var.l(null, false);
            p9Var.f(null, "50_50", z8Var);
        } else {
            CharSequence charSequence2 = this.n;
            if (charSequence2 == null || !TextUtils.isEmpty(charSequence2)) {
                ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            } else {
                ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
            }
            ViewGroup.LayoutParams layoutParams3 = p9Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams4 = p9Var.getLayoutParams();
            int dp2 = AndroidUtilities.dp(46.0f);
            layoutParams4.height = dp2;
            layoutParams3.width = dp2;
            if (npVar != null) {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) npVar.getLayoutParams();
                int dp3 = AndroidUtilities.dp(29.0f);
                int i12 = this.C;
                layoutParams5.topMargin = dp3 + i12;
                if (LocaleController.isRTL) {
                    ((FrameLayout.LayoutParams) npVar.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + i12;
                } else {
                    ((FrameLayout.LayoutParams) npVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(40.0f) + i12;
                }
            }
            Object obj2 = this.f;
            boolean z11 = obj2 instanceof TLRPC.User;
            int i13 = this.w;
            if (!z11) {
                TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
                TLRPC.ChatPhoto chatPhoto = chat2.photo;
                TLRPC.FileLocation fileLocation = chatPhoto != null ? chatPhoto.photo_small : null;
                if (i10 != 0) {
                    boolean z12 = ((i10 & MessagesController.UPDATE_MASK_AVATAR) == 0 || fileLocation == null) ? false : true;
                    if (z12 || this.h != null || (str2 = this.x) == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                        str = null;
                    } else {
                        str = chat2.title;
                        if (!str.equals(str2)) {
                            z12 = true;
                        }
                    }
                    if (!z12) {
                        return;
                    }
                } else {
                    str = null;
                }
                z8Var.k(i13, chat2);
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
                    int i14 = org.telegram.ui.ActionBar.k6.y6;
                    l5Var.setTag(Integer.valueOf(i14));
                    if (z10) {
                        i14 = org.telegram.ui.ActionBar.k6.og;
                    }
                    l5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, i11));
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
                p9Var.e(chat2, z8Var);
                chat = chat2;
                p9Var.setRoundRadius(AndroidUtilities.dp((chat == null && chat.forum) ? 14.0f : 24.0f));
                charSequence = this.n;
                if (charSequence != null) {
                    l5Var.l(charSequence, true);
                    int i15 = org.telegram.ui.ActionBar.k6.y6;
                    l5Var.setTag(Integer.valueOf(i15));
                    if (z10) {
                        i15 = org.telegram.ui.ActionBar.k6.og;
                    }
                    l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, g6Var));
                    l5Var.setEmojiColor(l5Var.getTextColor());
                }
                g();
            }
            TLRPC.User user = (TLRPC.User) obj2;
            if (this.I && UserObject.isUserSelf(user)) {
                cVar.l(LocaleController.getString(R.string.SavedMessages), true);
                l5Var.l(null, false);
                z8Var.g(1);
                p9Var.h(null, "50_50", z8Var, user);
                ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
                return;
            }
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation2 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            if (i10 != 0) {
                boolean z13 = ((i10 & MessagesController.UPDATE_MASK_AVATAR) == 0 || fileLocation2 == null) ? false : true;
                if (this.n == null && !z13 && (i10 & MessagesController.UPDATE_MASK_STATUS) != 0) {
                    TLRPC.UserStatus userStatus2 = user.status;
                    if ((userStatus2 != null ? userStatus2.expires : 0) != this.y) {
                        z13 = true;
                    }
                }
                if (z13 || this.h != null || this.x == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                    str3 = null;
                } else {
                    str3 = UserObject.getUserName(user);
                    if (!str3.equals(this.x)) {
                        z13 = true;
                    }
                }
                if (!z13) {
                    return;
                }
            } else {
                str3 = null;
            }
            z8Var.m(i13, user);
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
                    int i16 = org.telegram.ui.ActionBar.k6.y6;
                    l5Var.setTag(Integer.valueOf(i16));
                    if (z10) {
                        i16 = org.telegram.ui.ActionBar.k6.og;
                    }
                    l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i16, g6Var));
                    l5Var.l(LocaleController.getString(R.string.Bot), false);
                } else if (user.id == UserConfig.getInstance(i13).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i13).getCurrentTime()) || MessagesController.getInstance(i13).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                    int i17 = org.telegram.ui.ActionBar.k6.n6;
                    l5Var.setTag(Integer.valueOf(i17));
                    if (z10) {
                        i17 = org.telegram.ui.ActionBar.k6.pg;
                    }
                    l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i17, g6Var));
                    l5Var.l(LocaleController.getString(R.string.Online), false);
                } else {
                    int i18 = org.telegram.ui.ActionBar.k6.y6;
                    l5Var.setTag(Integer.valueOf(i18));
                    if (z10) {
                        i18 = org.telegram.ui.ActionBar.k6.og;
                    }
                    l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i18, g6Var));
                    l5Var.l(LocaleController.formatUserStatus(i13, user), false);
                }
                l5Var.setEmojiColor(l5Var.getTextColor());
            }
            p9Var.e(user, z8Var);
        }
        chat = null;
        p9Var.setRoundRadius(AndroidUtilities.dp((chat == null && chat.forum) ? 14.0f : 24.0f));
        charSequence = this.n;
        if (charSequence != null) {
        }
        g();
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.O) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.N;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f instanceof TLRPC.User) {
                requirementToContact = MessagesController.getInstance(this.w).isUserContactBlocked(((TLRPC.User) this.f).id);
            }
        }
        if (this.L == DialogObject.isPremiumBlocked(requirementToContact) && this.M == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.L = DialogObject.isPremiumBlocked(requirementToContact);
        this.M = DialogObject.getMessagesStarsPrice(requirementToContact);
        this.K.f(this.L, true);
        invalidate();
    }

    public np getCheckBox() {
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
        float e6 = this.K.e(this.L);
        org.telegram.ui.ActionBar.g6 g6Var = this.J;
        if (e6 <= 0.0f && this.v == 2 && (this.E || this.F > 0.0f)) {
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.W6, g6Var);
            Paint paint = this.G;
            paint.setColor(v02);
            org.telegram.ui.Components.p9 p9Var = this.a;
            canvas.drawCircle((p9Var.getMeasuredWidth() / 2) + p9Var.getLeft(), (p9Var.getMeasuredHeight() / 2) + p9Var.getTop(), (AndroidUtilities.dp(4.0f) * this.F) + AndroidUtilities.dp(18.0f), paint);
        }
        if (this.B) {
            boolean z4 = LocaleController.isRTL;
            int i10 = this.C;
            int dp = AndroidUtilities.dp(z4 ? 0.0f : i10 + 72);
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? i10 + 72 : 0.0f);
            if (!this.H) {
                canvas.drawRect(dp, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.T0("paintDivider", g6Var));
            } else {
                org.telegram.ui.ActionBar.k6.l0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.gg, g6Var));
                canvas.drawRect(dp, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.l0);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        np npVar = this.d;
        if (npVar != null ? npVar.a.q : this.E) {
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

    public void setCheckBoxEnabled(boolean z4) {
        np npVar = this.d;
        if (npVar != null) {
            npVar.setEnabled(z4);
        }
    }

    public void setDrawDivider(boolean z4) {
        this.B = z4;
        invalidate();
    }

    public void setForbiddenCheck(boolean z4) {
        this.d.setForbidden(z4);
    }

    public g4(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10) {
        super(context);
        this.w = UserConfig.selectedAccount;
        this.K = new org.telegram.ui.Components.z5(this, 0L, 350L, pr.h);
        this.J = g6Var;
        this.v = i10;
        this.H = z10;
        this.B = false;
        this.C = i11;
        this.I = z4;
        this.e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z11 = LocaleController.isRTL;
        addView(p9Var, k7.c6.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i11 + 13, 6.0f, z11 ? i11 + 13 : 0.0f, 0.0f));
        jg.c cVar = new jg.c(context, 2);
        this.b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(z10 ? org.telegram.ui.ActionBar.k6.ng : org.telegram.ui.ActionBar.k6.G6, g6Var));
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setTextSize(16);
        cVar.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(cVar, k7.c6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, (z12 ? 28 : 72) + i11, 10.0f, (z12 ? 72 : 28) + i11, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.c = l5Var;
        l5Var.setTextSize(14);
        l5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(l5Var, k7.c6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i11, 32.0f, (z13 ? 72 : 28) + i11, 0.0f));
        if (i10 == 1) {
            np npVar = new np(context, 21, g6Var);
            this.d = npVar;
            npVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
            npVar.setDrawUnchecked(false);
            npVar.setDrawBackgroundAsArc(3);
            boolean z14 = LocaleController.isRTL;
            addView(npVar, k7.c6.d(24, 24.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : i11 + 40, 33.0f, z14 ? i11 + 39 : 0.0f, 0.0f));
        } else if (i10 == 2) {
            Paint paint = new Paint(1);
            this.G = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
        setWillNotDraw(false);
    }
}
