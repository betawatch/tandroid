package ci;

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
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.pq;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class ea extends FrameLayout {
    public Path E;
    public Paint F;
    public final org.telegram.ui.ActionBar.d6 a;
    public final org.telegram.ui.Components.h9 b;
    public final org.telegram.ui.Components.w9 c;
    public final org.telegram.ui.ActionBar.i5 d;
    public final org.telegram.ui.ActionBar.i5 e;
    public final op f;
    public final RadioButton h;
    public final Paint n;
    public boolean r;
    public boolean s;
    public boolean v;
    public final boolean[] w;
    public long x;
    public boolean y;

    public ea(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.b = h9Var;
        this.n = new Paint(1);
        this.r = false;
        this.s = true;
        this.v = true;
        this.w = new boolean[1];
        this.a = d6Var;
        h9Var.r = AndroidUtilities.dp(40.0f);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var);
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.d = i5Var;
        i5Var.setTypeface(AndroidUtilities.bold());
        i5Var.setTextSize(16);
        int i10 = org.telegram.ui.ActionBar.h6.j5;
        i5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        i5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        NotificationCenter.listenEmojiLoading(i5Var);
        addView(i5Var);
        org.telegram.ui.ActionBar.i5 i5Var2 = new org.telegram.ui.ActionBar.i5(context);
        this.e = i5Var2;
        i5Var2.setTextSize(14);
        i5Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        i5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        NotificationCenter.listenEmojiLoading(i5Var2);
        addView(i5Var2);
        op opVar = new op(context, 21, d6Var);
        this.f = opVar;
        int i11 = org.telegram.ui.ActionBar.h6.B5;
        int i12 = org.telegram.ui.ActionBar.h6.j7;
        opVar.b(i11, i12, org.telegram.ui.ActionBar.h6.C5);
        opVar.setDrawUnchecked(true);
        opVar.setDrawBackgroundAsArc(10);
        addView(opVar);
        opVar.a(false, false);
        opVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.h6.v0(i12, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E5, d6Var));
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.i5 i5Var = this.d;
        org.telegram.ui.ActionBar.i5 i5Var2 = this.e;
        if (charSequence == null) {
            i5Var.setTranslationY(0.0f);
            i5Var2.setVisibility(8);
        } else {
            i5Var.setTranslationY(AndroidUtilities.dp(-9.0f));
            i5Var2.setTranslationY(AndroidUtilities.dp(12.0f));
            i5Var2.l(charSequence, false);
            i5Var2.setVisibility(0);
        }
    }

    public final void a(int i10, TLRPC.Chat chat) {
        String formatPluralStringComma;
        this.x = chat == null ? 0L : -chat.id;
        org.telegram.ui.Components.h9 h9Var = this.b;
        h9Var.q(chat);
        int dp = AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f);
        org.telegram.ui.Components.w9 w9Var = this.c;
        w9Var.setRoundRadius(dp);
        w9Var.e(chat, h9Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.i5 i5Var = this.d;
        i5Var.l(Emoji.replaceEmoji(str, i5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.w;
        zArr[0] = false;
        if (this.r) {
            if (i10 <= 0) {
                i10 = chat.participants_count;
            }
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            if (i10 >= 1) {
                formatPluralStringComma = LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", i10, new Object[0]);
            } else {
                formatPluralStringComma = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
            }
        } else {
            formatPluralStringComma = (!ChatObject.isChannel(chat) || chat.megagroup) ? i10 >= 1 ? LocaleController.formatPluralStringComma("Members", i10 - 1) : chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase() : i10 >= 1 ? LocaleController.formatPluralStringComma("Subscribers", i10 - 1) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
        }
        setSubtitle(formatPluralStringComma);
        this.e.setTextColor(org.telegram.ui.ActionBar.h6.v0(zArr[0] ? org.telegram.ui.ActionBar.h6.n5 : org.telegram.ui.ActionBar.h6.r5, this.a));
        this.f.setVisibility(this.s ? 0 : 8);
        this.h.setVisibility(8);
        b(i10 > 200 ? 0.3f : 1.0f, false);
    }

    public final void b(float f7, boolean z10) {
        RadioButton radioButton = this.h;
        op opVar = this.f;
        if (!z10) {
            opVar.animate().cancel();
            opVar.setAlpha(f7);
            radioButton.animate().cancel();
            radioButton.setAlpha(f7);
            return;
        }
        if (Math.abs(opVar.getAlpha() - f7) > 0.1d) {
            opVar.animate().cancel();
            opVar.animate().alpha(f7).start();
        }
        if (Math.abs(radioButton.getAlpha() - f7) > 0.1d) {
            radioButton.animate().cancel();
            radioButton.animate().alpha(f7).start();
        }
    }

    public final void c(boolean z10, boolean z11) {
        op opVar = this.f;
        if (opVar.getVisibility() == 0) {
            opVar.a(z10, z11);
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

    public final void e(int i10, TLRPC.User user, int i11) {
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        org.telegram.ui.ActionBar.i5 i5Var = this.d;
        org.telegram.ui.ActionBar.i5 i5Var2 = this.e;
        org.telegram.ui.Components.h9 h9Var = this.b;
        if (i10 == 4) {
            i5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionEveryone), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), i5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            i5Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.n5, d6Var));
            h9Var.g(7);
            h9Var.i(-15292942, -15630089);
        } else if (i10 == 2) {
            i5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), i5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
            }
            i5Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.n5, d6Var));
            h9Var.g(4);
            h9Var.i(-3905294, -6923014);
        } else if (i10 == 1) {
            i5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), i5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriendsDetail)));
            }
            i5Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.n5, d6Var));
            h9Var.g(15);
            h9Var.i(-7808710, -13781445);
        } else if (i10 == 3) {
            i5Var.l(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(Emoji.replaceEmoji(UserObject.getUserName(user), i5Var2.getPaint().getFontMetricsInt(), false)));
            } else if (i11 > 0) {
                setSubtitle(g(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i11, new Object[0])));
            } else {
                setSubtitle(g(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContactsDetail)));
            }
            i5Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.n5, d6Var));
            h9Var.g(6);
            h9Var.i(-18621, -618956);
        }
        this.f.setVisibility(8);
        this.h.setVisibility(this.s ? 0 : 8);
        org.telegram.ui.Components.w9 w9Var = this.c;
        w9Var.setImageDrawable(h9Var);
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }

    public final void f() {
        float f7;
        float f10;
        float f11;
        float f12;
        int i10 = (LocaleController.isRTL ? 5 : 3) | 16;
        boolean z10 = this.s;
        this.c.setLayoutParams(w7.x5.d(40, 40.0f, i10, z10 ? 53.0f : 16.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        int i11 = (z11 ? 5 : 3) | 16;
        if (z11) {
            f7 = 20.0f;
        } else {
            f7 = this.s ? 105 : 68;
        }
        if (z11) {
            f10 = this.s ? 105 : 68;
        } else {
            f10 = 20.0f;
        }
        this.d.setLayoutParams(w7.x5.d(-1, -2.0f, i11, f7, 0.0f, f10, 0.0f));
        boolean z12 = LocaleController.isRTL;
        int i12 = (z12 ? 5 : 3) | 16;
        if (z12) {
            f11 = 20.0f;
        } else {
            f11 = this.s ? 105 : 68;
        }
        if (z12) {
            f12 = this.s ? 105 : 68;
        } else {
            f12 = 20.0f;
        }
        this.e.setLayoutParams(w7.x5.d(-1, -2.0f, i12, f11, 0.0f, f12, 0.0f));
        this.f.setLayoutParams(w7.x5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        this.h.setLayoutParams(w7.x5.d(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        pq pqVar = new pq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(pqVar, 0, spannableString.length(), 33);
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
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d7, this.a);
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
        Path path = this.E;
        if (path == null || (paint = this.F) == null || this.s || !this.r || !this.v) {
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
        op opVar = this.f;
        if (opVar != null) {
            try {
                if (opVar.getVisibility() == 0) {
                    z10 = true;
                    radioButton = this.h;
                    if (radioButton != null && radioButton.getVisibility() == 0) {
                        z11 = true;
                    }
                    if (!z10 || z11) {
                        accessibilityNodeInfo.setCheckable(true);
                        accessibilityNodeInfo.setChecked(!z10 ? opVar.a.q : radioButton.f);
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
        accessibilityNodeInfo.setChecked(!z10 ? opVar.a.q : radioButton.f);
        accessibilityNodeInfo.setClassName(!z10 ? "android.widget.CheckBox" : "android.widget.RadioButton");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((!this.r || this.s) ? 56.0f : 62.0f), TLObject.FLAG_30));
        if (this.s || !this.r) {
            return;
        }
        Path path = this.E;
        if (path == null) {
            this.E = new Path();
        } else {
            path.rewind();
        }
        float dp = LocaleController.isRTL ? AndroidUtilities.dp(31.0f) : getMeasuredWidth() - AndroidUtilities.dp(31.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f7 = LocaleController.isRTL ? -1.0f : 1.0f;
        this.E.moveTo(dp, measuredHeight - AndroidUtilities.dp(6.0f));
        this.E.lineTo((f7 * AndroidUtilities.dp(6.0f)) + dp, measuredHeight);
        this.E.lineTo(dp, measuredHeight + AndroidUtilities.dp(6.0f));
        if (this.F == null) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.F.setStrokeCap(Paint.Cap.ROUND);
        }
        this.F.setStrokeWidth(AndroidUtilities.dpf2(1.86f));
        this.F.setColor(org.telegram.ui.ActionBar.h6.l1(0.3f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, this.a)));
    }

    public void set(Object obj) {
        boolean z10 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.i5 i5Var = this.d;
        if (z10) {
            i5Var.setTypeface(AndroidUtilities.bold());
            i5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            i5Var.setTypeface(AndroidUtilities.bold());
            i5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            i5Var.setTypeface(null);
            i5Var.setTranslationX((-AndroidUtilities.dp(52.0f)) * (LocaleController.isRTL ? -1 : 1));
            i5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z10) {
        this.y = z10;
        setWillNotDraw(!z10 && (this.s || !this.r));
    }

    public void setRedCheckbox(boolean z10) {
        this.f.b(z10 ? org.telegram.ui.ActionBar.h6.wj : org.telegram.ui.ActionBar.h6.B5, org.telegram.ui.ActionBar.h6.j7, org.telegram.ui.ActionBar.h6.C5);
    }

    public void setUser(TLRPC.User user) {
        this.x = user == null ? 0L : user.id;
        org.telegram.ui.Components.h9 h9Var = this.b;
        h9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.w9 w9Var = this.c;
        w9Var.setRoundRadius(dp);
        w9Var.e(user, h9Var);
        String userName = UserObject.getUserName(user);
        org.telegram.ui.ActionBar.i5 i5Var = this.d;
        i5Var.l(Emoji.replaceEmoji(userName, i5Var.getPaint().getFontMetricsInt(), false), false);
        boolean[] zArr = this.w;
        zArr[0] = false;
        boolean z10 = this.r;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        org.telegram.ui.ActionBar.i5 i5Var2 = this.e;
        if (z10) {
            setSubtitle(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            i5Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.r5, d6Var));
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
            i5Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(zArr[0] ? org.telegram.ui.ActionBar.h6.n5 : org.telegram.ui.ActionBar.h6.r5, d6Var));
        }
        int i10 = this.s ? 0 : 8;
        op opVar = this.f;
        opVar.setVisibility(i10);
        opVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }
}
