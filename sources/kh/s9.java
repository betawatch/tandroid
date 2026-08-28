package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s9 extends FrameLayout {
    public Path A;
    public Paint B;
    public final org.telegram.ui.ActionBar.b6 a;
    public final org.telegram.ui.Components.z8 b;
    public final org.telegram.ui.Components.o9 c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final org.telegram.ui.ActionBar.h5 e;
    public final dp f;
    public final RadioButton h;
    public final Paint n;
    public boolean r;
    public boolean s;
    public boolean v;
    public final boolean[] w;
    public long x;
    public boolean y;

    public s9(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.b = z8Var;
        this.n = new Paint(1);
        this.r = false;
        this.s = true;
        this.v = true;
        this.w = new boolean[1];
        this.a = b6Var;
        z8Var.r = AndroidUtilities.dp(40.0f);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(o9Var);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        int i9 = org.telegram.ui.ActionBar.f6.j5;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        NotificationCenter.listenEmojiLoading(h5Var);
        addView(h5Var);
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.e = h5Var2;
        h5Var2.setTextSize(14);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        h5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        NotificationCenter.listenEmojiLoading(h5Var2);
        addView(h5Var2);
        dp dpVar = new dp(context, 21, b6Var);
        this.f = dpVar;
        int i10 = org.telegram.ui.ActionBar.f6.B5;
        int i11 = org.telegram.ui.ActionBar.f6.j7;
        dpVar.b(i10, i11, org.telegram.ui.ActionBar.f6.C5);
        dpVar.setDrawUnchecked(true);
        dpVar.setDrawBackgroundAsArc(10);
        addView(dpVar);
        dpVar.a(false, false);
        dpVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E5, b6Var));
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.e;
        if (charSequence == null) {
            h5Var.setTranslationY(0.0f);
            h5Var2.setVisibility(8);
        } else {
            h5Var.setTranslationY(AndroidUtilities.dp(-9.0f));
            h5Var2.setTranslationY(AndroidUtilities.dp(12.0f));
            h5Var2.l(charSequence, false);
            h5Var2.setVisibility(0);
        }
    }

    public final void a(int i9, TLRPC.Chat chat) {
        String formatPluralStringComma;
        this.x = chat == null ? 0L : -chat.id;
        org.telegram.ui.Components.z8 z8Var = this.b;
        z8Var.q(chat);
        int dp = AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f);
        org.telegram.ui.Components.o9 o9Var = this.c;
        o9Var.setRoundRadius(dp);
        o9Var.e(chat, z8Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.l(Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.w;
        zArr[0] = false;
        if (this.r) {
            if (i9 <= 0) {
                i9 = chat.participants_count;
            }
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            if (i9 >= 1) {
                formatPluralStringComma = LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", i9, new Object[0]);
            } else {
                formatPluralStringComma = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
            }
        } else {
            formatPluralStringComma = (!ChatObject.isChannel(chat) || chat.megagroup) ? i9 >= 1 ? LocaleController.formatPluralStringComma("Members", i9 - 1) : chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase() : i9 >= 1 ? LocaleController.formatPluralStringComma("Subscribers", i9 - 1) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
        }
        setSubtitle(formatPluralStringComma);
        this.e.setTextColor(org.telegram.ui.ActionBar.f6.v0(zArr[0] ? org.telegram.ui.ActionBar.f6.n5 : org.telegram.ui.ActionBar.f6.r5, this.a));
        this.f.setVisibility(this.s ? 0 : 8);
        this.h.setVisibility(8);
        b(i9 > 200 ? 0.3f : 1.0f, false);
    }

    public final void b(float f10, boolean z10) {
        RadioButton radioButton = this.h;
        dp dpVar = this.f;
        if (!z10) {
            dpVar.animate().cancel();
            dpVar.setAlpha(f10);
            radioButton.animate().cancel();
            radioButton.setAlpha(f10);
            return;
        }
        if (Math.abs(dpVar.getAlpha() - f10) > 0.1d) {
            dpVar.animate().cancel();
            dpVar.animate().alpha(f10).start();
        }
        if (Math.abs(radioButton.getAlpha() - f10) > 0.1d) {
            radioButton.animate().cancel();
            radioButton.animate().alpha(f10).start();
        }
    }

    public final void c(boolean z10, boolean z11) {
        dp dpVar = this.f;
        if (dpVar.getVisibility() == 0) {
            dpVar.a(z10, z11);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, z11);
        }
    }

    public final void d(boolean z10, boolean z11) {
        this.r = z10;
        if (z11 != this.s) {
            this.s = z11;
            f();
        }
        if (!this.s) {
            this.h.setVisibility(8);
            this.f.setVisibility(8);
        }
        setWillNotDraw(!this.y && (this.s || !this.r));
    }

    public final void e(int i9, TLRPC.User user, int i10) {
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.e;
        org.telegram.ui.Components.z8 z8Var = this.b;
        if (i9 == 4) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionEveryone), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i10 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i10, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.n5, b6Var));
            z8Var.g(7);
            z8Var.i(-15292942, -15630089);
        } else if (i9 == 2) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionContacts), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i10 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i10, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.n5, b6Var));
            z8Var.g(4);
            z8Var.i(-3905294, -6923014);
        } else if (i9 == 1) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i10 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i10, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriendsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.n5, b6Var));
            z8Var.g(15);
            z8Var.i(-7808710, -13781445);
        } else if (i9 == 3) {
            h5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i10 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i10, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContactsDetail)));
            }
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.n5, b6Var));
            z8Var.g(6);
            z8Var.i(-18621, -618956);
        }
        this.f.setVisibility(8);
        this.h.setVisibility(this.s ? 0 : 8);
        org.telegram.ui.Components.o9 o9Var = this.c;
        o9Var.setImageDrawable(z8Var);
        o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }

    public final void f() {
        float f10;
        float f11;
        float f12;
        float f13;
        int i9 = (LocaleController.isRTL ? 5 : 3) | 16;
        boolean z10 = this.s;
        this.c.setLayoutParams(g7.e6.d(40, 40.0f, i9, z10 ? 53.0f : 16.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        int i10 = (z11 ? 5 : 3) | 16;
        if (z11) {
            f10 = 20.0f;
        } else {
            f10 = this.s ? 105 : 68;
        }
        if (z11) {
            f11 = this.s ? 105 : 68;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(g7.e6.d(-1, -2.0f, i10, f10, 0.0f, f11, 0.0f));
        boolean z12 = LocaleController.isRTL;
        int i11 = (z12 ? 5 : 3) | 16;
        if (z12) {
            f12 = 20.0f;
        } else {
            f12 = this.s ? 105 : 68;
        }
        if (z12) {
            f13 = this.s ? 105 : 68;
        } else {
            f13 = 20.0f;
        }
        this.e.setLayoutParams(g7.e6.d(-1, -2.0f, i11, f12, 0.0f, f13, 0.0f));
        this.f.setLayoutParams(g7.e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        this.h.setLayoutParams(g7.e6.d(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        eq eqVar = new eq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.y) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, this.a);
            Paint paint2 = this.n;
            paint2.setColor(v02);
            if (LocaleController.isRTL) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(AndroidUtilities.dp(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
            }
        } else {
            canvas2 = canvas;
        }
        Path path = this.A;
        if (path == null || (paint = this.B) == null || this.s || !this.r || !this.v) {
            return;
        }
        canvas2.drawPath(path, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:27:0x0009, B:6:0x0016, B:13:0x0021, B:15:0x0026, B:16:0x002d, B:19:0x0037, B:25:0x002b), top: B:26:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002b A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:27:0x0009, B:6:0x0016, B:13:0x0021, B:15:0x0026, B:16:0x002d, B:19:0x0037, B:25:0x002b), top: B:26:0x0009 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        RadioButton radioButton;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        boolean z11 = false;
        dp dpVar = this.f;
        if (dpVar != null) {
            try {
                if (dpVar.getVisibility() == 0) {
                    z10 = true;
                    radioButton = this.h;
                    if (radioButton != null && radioButton.getVisibility() == 0) {
                        z11 = true;
                    }
                    if (!z10 || z11) {
                        accessibilityNodeInfo.setCheckable(true);
                        accessibilityNodeInfo.setChecked(!z10 ? dpVar.a.q : radioButton.f);
                        accessibilityNodeInfo.setClassName(!z10 ? "android.widget.CheckBox" : "android.widget.RadioButton");
                    }
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        z10 = false;
        radioButton = this.h;
        if (radioButton != null) {
            z11 = true;
        }
        if (z10) {
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(!z10 ? dpVar.a.q : radioButton.f);
        accessibilityNodeInfo.setClassName(!z10 ? "android.widget.CheckBox" : "android.widget.RadioButton");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((!this.r || this.s) ? 56.0f : 62.0f), TLObject.FLAG_30));
        if (this.s || !this.r) {
            return;
        }
        Path path = this.A;
        if (path == null) {
            this.A = new Path();
        } else {
            path.rewind();
        }
        float dp = LocaleController.isRTL ? AndroidUtilities.dp(31.0f) : getMeasuredWidth() - AndroidUtilities.dp(31.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f10 = LocaleController.isRTL ? -1.0f : 1.0f;
        this.A.moveTo(dp, measuredHeight - AndroidUtilities.dp(6.0f));
        this.A.lineTo((f10 * AndroidUtilities.dp(6.0f)) + dp, measuredHeight);
        this.A.lineTo(dp, measuredHeight + AndroidUtilities.dp(6.0f));
        if (this.B == null) {
            Paint paint = new Paint(1);
            this.B = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.B.setStrokeCap(Paint.Cap.ROUND);
        }
        this.B.setStrokeWidth(AndroidUtilities.dpf2(1.86f));
        this.B.setColor(org.telegram.ui.ActionBar.f6.l1(0.3f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, this.a)));
    }

    public void set(Object obj) {
        boolean z10 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        if (z10) {
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            h5Var.setTypeface(null);
            h5Var.setTranslationX((-AndroidUtilities.dp(52.0f)) * (LocaleController.isRTL ? -1 : 1));
            h5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z10) {
        this.y = z10;
        setWillNotDraw(!z10 && (this.s || !this.r));
    }

    public void setRedCheckbox(boolean z10) {
        this.f.b(z10 ? org.telegram.ui.ActionBar.f6.wj : org.telegram.ui.ActionBar.f6.B5, org.telegram.ui.ActionBar.f6.j7, org.telegram.ui.ActionBar.f6.C5);
    }

    public void setUser(TLRPC.User user) {
        this.x = user == null ? 0L : user.id;
        org.telegram.ui.Components.z8 z8Var = this.b;
        z8Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.o9 o9Var = this.c;
        o9Var.setRoundRadius(dp);
        o9Var.e(user, z8Var);
        String userName = UserObject.getUserName(user);
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.l(Emoji.replaceEmoji(userName, h5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.w;
        zArr[0] = false;
        boolean z10 = this.r;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.e;
        if (z10) {
            setSubtitle(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.r5, b6Var));
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(zArr[0] ? org.telegram.ui.ActionBar.f6.n5 : org.telegram.ui.ActionBar.f6.r5, b6Var));
        }
        int i9 = this.s ? 0 : 8;
        dp dpVar = this.f;
        dpVar.setVisibility(i9);
        dpVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }
}
