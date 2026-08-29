package fg;

import ag.i0;
import ag.n;
import ag.o;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import f2.n1;
import gg.e0;
import gg.f0;
import gg.s;
import gg.v;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.t9;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class e extends il0 {
    public final c6 c;
    public boolean d;
    public o2 e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public FrameLayout n;

    public e(c6 c6Var) {
        this.c = c6Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(n1 n1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override // f2.p0
    public final int h() {
        return 5;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        return 5;
                    }
                }
            }
        }
        return i11;
    }

    @Override // f2.p0
    public final void v(n1 n1Var, int i10) {
        int i11;
        char c3;
        String formatPluralString;
        int i12 = n1Var.f;
        View view = n1Var.a;
        if (i12 == 0) {
            s sVar = (s) view;
            if (this.d) {
                sVar.c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                sVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllows", R.string.BoostingLinkAllows, new Object[0])));
            } else {
                sVar.c.setText(LocaleController.formatString("BoostingUsedGiftLink", R.string.BoostingUsedGiftLink, new Object[0]));
                sVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkUsed", R.string.BoostingLinkUsed, new Object[0])));
            }
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f;
            if (tL_payments_checkedGiftCode.boost != null) {
                long j10 = tL_payments_checkedGiftCode.to_id;
                final i0 i0Var = new i0(this, 11);
                sVar.c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingLinkAllowsToUser));
                final TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                final int i13 = 0;
                sVar.d.setText(AndroidUtilities.replaceCharSequence("%1$s", replaceTags, AndroidUtilities.replaceSingleTag("**" + UserObject.getUserName(user) + "**", g6.gc, 2, new Runnable() { // from class: gg.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                i0Var.run(user);
                                break;
                            default:
                                i0Var.run(user);
                                break;
                        }
                    }
                }, sVar.e)));
            }
            if (this.f.to_id == -1) {
                sVar.c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                sVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllowsAnyone", R.string.BoostingLinkAllowsAnyone, new Object[0])));
                return;
            }
            return;
        }
        int i14 = 1;
        if (i12 == 1) {
            v vVar = (v) view;
            vVar.setSlug(this.h);
            if (this.f.boost != null && this.h == null) {
                vVar.a(new c(this, 0));
            }
            String str = this.h;
            if ((str == null || str.isEmpty()) && this.f.to_id == -1) {
                vVar.a(new c(this, 0));
                return;
            }
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    return;
                }
                gg.a aVar = (gg.a) view;
                aVar.setOkStyle(this.d);
                aVar.setOnClickListener(new n(7, this, aVar));
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f;
                if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                    aVar.e = false;
                    nh.d dVar = aVar.a;
                    dVar.setShowZero(false);
                    dVar.setEnabled(true);
                    dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
                    aVar.setOnClickListener(new o(this, 9));
                    return;
                }
                return;
            }
            f0 f0Var = (f0) view;
            f0Var.setTextGravity(17);
            f0Var.setTextColor(g6.w0(null, g6.G6, false));
            f0Var.setTopPadding(14);
            f0Var.setBottomPadding(15);
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f;
            if (tL_payments_checkedGiftCode3.boost == null) {
                if (this.d) {
                    f0Var.setText(AndroidUtilities.replaceSingleTag(tL_payments_checkedGiftCode3.to_id == -1 ? LocaleController.getString(R.string.BoostingSendLinkToAnyone) : LocaleController.getString(R.string.BoostingSendLinkToFriends), g6.gc, 0, new c(this, i14), this.c));
                    return;
                } else {
                    Date date = new Date(this.f.used_date * 1000);
                    f0Var.setText(LocaleController.formatString("BoostingUsedLinkDate", R.string.BoostingUsedLinkDate, LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date))));
                    return;
                }
            }
            String str2 = this.h;
            if (str2 == null || str2.isEmpty()) {
                f0Var.setText(LocaleController.getString(R.string.BoostingLinkNotActivated));
                return;
            } else {
                f0Var.setFixedSize(14);
                f0Var.setText(null);
                return;
            }
        }
        e0 e0Var = (e0) view;
        final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f;
        final i0 i0Var2 = new i0(this, 11);
        t9 t9Var = e0Var.h;
        FrameLayout frameLayout = e0Var.w;
        t9 t9Var2 = e0Var.f;
        TextView textView = e0Var.a;
        TextView textView2 = e0Var.b;
        c6 c6Var = e0Var.n;
        Date date2 = new Date(tL_payments_checkedGiftCode4.date * 1000);
        e0Var.e.setText(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
        TextView textView3 = e0Var.d;
        textView3.setTextColor(g6.v0(tL_payments_checkedGiftCode4.via_giveaway ? g6.m5 : g6.j5, c6Var));
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_payments_checkedGiftCode4.from_id)));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.BoostingGiveaway));
            spannableStringBuilder.append((CharSequence) "**");
            final int i15 = 0;
            textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder.toString(), g6.gc, 0, new Runnable() { // from class: gg.b0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            i0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            i0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, c6Var));
            textView3.setOnClickListener(new n(9, i0Var2, tL_payments_checkedGiftCode4));
        } else {
            textView3.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingYouWereSelected : R.string.BoostingYouWereSelectedGroup));
            textView3.setOnClickListener(null);
        }
        int i16 = tL_payments_checkedGiftCode4.months;
        if (i16 == 12) {
            i11 = 1;
            formatPluralString = LocaleController.formatPluralString("Years", 1, new Object[0]);
            c3 = 0;
        } else {
            i11 = 1;
            c3 = 0;
            formatPluralString = LocaleController.formatPluralString("Months", i16, new Object[0]);
        }
        TextView textView4 = e0Var.c;
        int i17 = R.string.BoostingTelegramPremiumFor;
        String str3 = formatPluralString;
        Object[] objArr = new Object[i11];
        objArr[c3] = str3;
        textView4.setText(LocaleController.formatString("BoostingTelegramPremiumFor", i17, objArr));
        if (chat != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "**");
            spannableStringBuilder2.append((CharSequence) chat.title);
            spannableStringBuilder2.append((CharSequence) "**");
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder2.toString(), g6.gc, 0, new ef.c(15, i0Var2, chat), c6Var), textView.getPaint().getFontMetricsInt(), false));
            t9Var2.e(chat, new e9(chat));
            frameLayout.setOnClickListener(new n(10, i0Var2, chat));
        } else {
            final TLRPC.User user2 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final int i18 = 0;
            textView.setText(Emoji.replaceEmoji(UserObject.getFirstName(user2), textView.getPaint().getFontMetricsInt(), false));
            t9Var2.e(user2, new e9(0, user2));
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: gg.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i18) {
                        case 0:
                            i0Var2.run(user2);
                            break;
                        default:
                            i0Var2.run(user2);
                            break;
                    }
                }
            });
        }
        if (tL_payments_checkedGiftCode4.to_id == -1 && tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) "**");
            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.BoostingIncompleteGiveaway));
            spannableStringBuilder3.append((CharSequence) "**");
            final int i19 = 1;
            textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder3.toString(), g6.gc, 0, new Runnable() { // from class: gg.b0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            i0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            i0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, c6Var));
            textView2.setText(LocaleController.getString(R.string.BoostingNoRecipient));
            textView2.setTextColor(g6.v0(g6.j5, c6Var));
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
            t9Var.setVisibility(8);
        } else {
            final TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (user3 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                spannableStringBuilder4.append((CharSequence) UserObject.getFirstName(user3));
                spannableStringBuilder4.append((CharSequence) "**");
                final int i20 = 1;
                textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder4.toString(), g6.gc, 0, new Runnable() { // from class: gg.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i20) {
                            case 0:
                                i0Var2.run(user3);
                                break;
                            default:
                                i0Var2.run(user3);
                                break;
                        }
                    }
                }, c6Var), textView2.getPaint().getFontMetricsInt(), false));
                t9Var.e(user3, new e9(0, user3));
                e0Var.x.setOnClickListener(new View.OnClickListener() { // from class: gg.c0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i20) {
                            case 0:
                                i0Var2.run(user3);
                                break;
                            default:
                                i0Var2.run(user3);
                                break;
                        }
                    }
                });
            }
        }
        if (tL_payments_checkedGiftCode4.boost != null) {
            e0Var.y.setVisibility(8);
        }
    }

    @Override // f2.p0
    public final n1 x(ViewGroup viewGroup, int i10) {
        View vVar;
        Context context = viewGroup.getContext();
        c6 c6Var = this.c;
        if (i10 == 1) {
            vVar = new v(context, c6Var);
        } else if (i10 == 2) {
            vVar = new e0(context, c6Var);
        } else if (i10 == 3) {
            vVar = new f0(context, c6Var);
        } else if (i10 != 4) {
            vVar = i10 != 5 ? new s(context, c6Var) : new View(context);
        } else {
            vVar = new gg.a(context, c6Var);
            vVar.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
        }
        return th.m(vVar, vVar, -1, -2);
    }
}
