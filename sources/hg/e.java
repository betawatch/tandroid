package hg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import cg.h0;
import cg.n;
import f2.l1;
import ig.e0;
import ig.f0;
import ig.s;
import ig.v;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class e extends ql0 {
    public final f6 c;
    public boolean d;
    public p2 e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public FrameLayout n;

    public e(f6 f6Var) {
        this.c = f6Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(l1 l1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override // f2.o0
    public final int h() {
        return 5;
    }

    @Override // f2.o0
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

    @Override // f2.o0
    public final void v(l1 l1Var, int i10) {
        int i11;
        char c3;
        String formatPluralString;
        int i12 = l1Var.f;
        View view = l1Var.a;
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
                final h0 h0Var = new h0(this, 11);
                sVar.c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingLinkAllowsToUser));
                final TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                final int i13 = 0;
                sVar.d.setText(AndroidUtilities.replaceCharSequence("%1$s", replaceTags, AndroidUtilities.replaceSingleTag("**" + UserObject.getUserName(user) + "**", j6.gc, 2, new Runnable() { // from class: ig.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                h0Var.run(user);
                                break;
                            default:
                                h0Var.run(user);
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
                ig.a aVar = (ig.a) view;
                aVar.setOkStyle(this.d);
                aVar.setOnClickListener(new n(7, this, aVar));
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f;
                if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                    aVar.e = false;
                    ph.d dVar = aVar.a;
                    dVar.setShowZero(false);
                    dVar.setEnabled(true);
                    dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
                    aVar.setOnClickListener(new androidx.mediarouter.app.c(this, 9));
                    return;
                }
                return;
            }
            f0 f0Var = (f0) view;
            f0Var.setTextGravity(17);
            f0Var.setTextColor(j6.w0(null, j6.G6, false));
            f0Var.setTopPadding(14);
            f0Var.setBottomPadding(15);
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f;
            if (tL_payments_checkedGiftCode3.boost == null) {
                if (this.d) {
                    f0Var.setText(AndroidUtilities.replaceSingleTag(tL_payments_checkedGiftCode3.to_id == -1 ? LocaleController.getString(R.string.BoostingSendLinkToAnyone) : LocaleController.getString(R.string.BoostingSendLinkToFriends), j6.gc, 0, new c(this, i14), this.c));
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
        final h0 h0Var2 = new h0(this, 11);
        p9 p9Var = e0Var.h;
        FrameLayout frameLayout = e0Var.w;
        p9 p9Var2 = e0Var.f;
        TextView textView = e0Var.a;
        TextView textView2 = e0Var.b;
        f6 f6Var = e0Var.n;
        Date date2 = new Date(tL_payments_checkedGiftCode4.date * 1000);
        e0Var.e.setText(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
        TextView textView3 = e0Var.d;
        textView3.setTextColor(j6.v0(tL_payments_checkedGiftCode4.via_giveaway ? j6.m5 : j6.j5, f6Var));
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_payments_checkedGiftCode4.from_id)));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.BoostingGiveaway));
            spannableStringBuilder.append((CharSequence) "**");
            final int i15 = 0;
            textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder.toString(), j6.gc, 0, new Runnable() { // from class: ig.b0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            h0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            h0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, f6Var));
            textView3.setOnClickListener(new n(9, h0Var2, tL_payments_checkedGiftCode4));
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
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder2.toString(), j6.gc, 0, new ff.c(16, h0Var2, chat), f6Var), textView.getPaint().getFontMetricsInt(), false));
            p9Var2.e(chat, new z8(chat));
            frameLayout.setOnClickListener(new n(10, h0Var2, chat));
        } else {
            final TLRPC.User user2 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final int i18 = 0;
            textView.setText(Emoji.replaceEmoji(UserObject.getFirstName(user2), textView.getPaint().getFontMetricsInt(), false));
            p9Var2.e(user2, new z8(0, user2));
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: ig.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i18) {
                        case 0:
                            h0Var2.run(user2);
                            break;
                        default:
                            h0Var2.run(user2);
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
            textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder3.toString(), j6.gc, 0, new Runnable() { // from class: ig.b0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            h0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            h0Var2.run(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, f6Var));
            textView2.setText(LocaleController.getString(R.string.BoostingNoRecipient));
            textView2.setTextColor(j6.v0(j6.j5, f6Var));
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
            p9Var.setVisibility(8);
        } else {
            final TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (user3 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                spannableStringBuilder4.append((CharSequence) UserObject.getFirstName(user3));
                spannableStringBuilder4.append((CharSequence) "**");
                final int i20 = 1;
                textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder4.toString(), j6.gc, 0, new Runnable() { // from class: ig.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i20) {
                            case 0:
                                h0Var2.run(user3);
                                break;
                            default:
                                h0Var2.run(user3);
                                break;
                        }
                    }
                }, f6Var), textView2.getPaint().getFontMetricsInt(), false));
                p9Var.e(user3, new z8(0, user3));
                e0Var.x.setOnClickListener(new View.OnClickListener() { // from class: ig.c0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i20) {
                            case 0:
                                h0Var2.run(user3);
                                break;
                            default:
                                h0Var2.run(user3);
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

    @Override // f2.o0
    public final l1 x(ViewGroup viewGroup, int i10) {
        View vVar;
        Context context = viewGroup.getContext();
        f6 f6Var = this.c;
        if (i10 == 1) {
            vVar = new v(context, f6Var);
        } else if (i10 == 2) {
            vVar = new e0(context, f6Var);
        } else if (i10 == 3) {
            vVar = new f0(context, f6Var);
        } else if (i10 != 4) {
            vVar = i10 != 5 ? new s(context, f6Var) : new View(context);
        } else {
            vVar = new ig.a(context, f6Var);
            vVar.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
        }
        return ai.n(vVar, vVar, -1, -2);
    }
}
