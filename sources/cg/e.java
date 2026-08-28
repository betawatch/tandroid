package cg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.i;
import bg.u1;
import dg.g0;
import dg.h0;
import dg.u;
import dg.x;
import f2.q1;
import j3.r0;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class e extends vk0 {
    public final b6 c;
    public boolean d;
    public o2 e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public FrameLayout n;

    public e(b6 b6Var) {
        this.c = b6Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(q1 q1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override // f2.r0
    public final int h() {
        return 5;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        int i10 = 1;
        if (i9 != 1) {
            i10 = 2;
            if (i9 != 2) {
                i10 = 3;
                if (i9 != 3) {
                    i10 = 4;
                    if (i9 != 4) {
                        return 5;
                    }
                }
            }
        }
        return i10;
    }

    @Override // f2.r0
    public final void v(q1 q1Var, int i9) {
        int i10;
        char c10;
        String formatPluralString;
        int i11 = q1Var.f;
        View view = q1Var.a;
        if (i11 == 0) {
            u uVar = (u) view;
            if (this.d) {
                uVar.c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                uVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllows", R.string.BoostingLinkAllows, new Object[0])));
            } else {
                uVar.c.setText(LocaleController.formatString("BoostingUsedGiftLink", R.string.BoostingUsedGiftLink, new Object[0]));
                uVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkUsed", R.string.BoostingLinkUsed, new Object[0])));
            }
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f;
            if (tL_payments_checkedGiftCode.boost != null) {
                long j10 = tL_payments_checkedGiftCode.to_id;
                final i iVar = new i(this, 4);
                uVar.c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingLinkAllowsToUser));
                final TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                final int i12 = 0;
                uVar.d.setText(AndroidUtilities.replaceCharSequence("%1$s", replaceTags, AndroidUtilities.replaceSingleTag("**" + UserObject.getUserName(user) + "**", f6.gc, 2, new Runnable() { // from class: dg.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                iVar.run(user);
                                break;
                            default:
                                iVar.run(user);
                                break;
                        }
                    }
                }, uVar.e)));
            }
            if (this.f.to_id == -1) {
                uVar.c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                uVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllowsAnyone", R.string.BoostingLinkAllowsAnyone, new Object[0])));
                return;
            }
            return;
        }
        int i13 = 1;
        if (i11 == 1) {
            x xVar = (x) view;
            xVar.setSlug(this.h);
            if (this.f.boost != null && this.h == null) {
                xVar.a(new c(this, 0));
            }
            String str = this.h;
            if ((str == null || str.isEmpty()) && this.f.to_id == -1) {
                xVar.a(new c(this, 0));
                return;
            }
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return;
                }
                dg.a aVar = (dg.a) view;
                aVar.setOkStyle(this.d);
                aVar.setOnClickListener(new u1(3, this, aVar));
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f;
                if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                    aVar.e = false;
                    kh.d dVar = aVar.a;
                    dVar.setShowZero(false);
                    dVar.setEnabled(true);
                    dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
                    aVar.setOnClickListener(new androidx.mediarouter.app.c(this, 3));
                    return;
                }
                return;
            }
            h0 h0Var = (h0) view;
            h0Var.setTextGravity(17);
            h0Var.setTextColor(f6.w0(null, f6.G6, false));
            h0Var.setTopPadding(14);
            h0Var.setBottomPadding(15);
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f;
            if (tL_payments_checkedGiftCode3.boost == null) {
                if (this.d) {
                    h0Var.setText(AndroidUtilities.replaceSingleTag(tL_payments_checkedGiftCode3.to_id == -1 ? LocaleController.getString(R.string.BoostingSendLinkToAnyone) : LocaleController.getString(R.string.BoostingSendLinkToFriends), f6.gc, 0, new c(this, i13), this.c));
                    return;
                } else {
                    Date date = new Date(this.f.used_date * 1000);
                    h0Var.setText(LocaleController.formatString("BoostingUsedLinkDate", R.string.BoostingUsedLinkDate, LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date))));
                    return;
                }
            }
            String str2 = this.h;
            if (str2 == null || str2.isEmpty()) {
                h0Var.setText(LocaleController.getString(R.string.BoostingLinkNotActivated));
                return;
            } else {
                h0Var.setFixedSize(14);
                h0Var.setText(null);
                return;
            }
        }
        g0 g0Var = (g0) view;
        final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f;
        final i iVar2 = new i(this, 4);
        o9 o9Var = g0Var.h;
        FrameLayout frameLayout = g0Var.w;
        o9 o9Var2 = g0Var.f;
        TextView textView = g0Var.a;
        TextView textView2 = g0Var.b;
        b6 b6Var = g0Var.n;
        Date date2 = new Date(tL_payments_checkedGiftCode4.date * 1000);
        g0Var.e.setText(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
        TextView textView3 = g0Var.d;
        textView3.setTextColor(f6.v0(tL_payments_checkedGiftCode4.via_giveaway ? f6.m5 : f6.j5, b6Var));
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_payments_checkedGiftCode4.from_id)));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.BoostingGiveaway));
            spannableStringBuilder.append((CharSequence) "**");
            final int i14 = 0;
            textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder.toString(), f6.gc, 0, new Runnable() { // from class: dg.d0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            iVar2.run(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            iVar2.run(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, b6Var));
            textView3.setOnClickListener(new u1(5, iVar2, tL_payments_checkedGiftCode4));
        } else {
            textView3.setText(LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingYouWereSelected : R.string.BoostingYouWereSelectedGroup));
            textView3.setOnClickListener(null);
        }
        int i15 = tL_payments_checkedGiftCode4.months;
        if (i15 == 12) {
            i10 = 1;
            formatPluralString = LocaleController.formatPluralString("Years", 1, new Object[0]);
            c10 = 0;
        } else {
            i10 = 1;
            c10 = 0;
            formatPluralString = LocaleController.formatPluralString("Months", i15, new Object[0]);
        }
        TextView textView4 = g0Var.c;
        int i16 = R.string.BoostingTelegramPremiumFor;
        String str3 = formatPluralString;
        Object[] objArr = new Object[i10];
        objArr[c10] = str3;
        textView4.setText(LocaleController.formatString("BoostingTelegramPremiumFor", i16, objArr));
        if (chat != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "**");
            spannableStringBuilder2.append((CharSequence) chat.title);
            spannableStringBuilder2.append((CharSequence) "**");
            textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder2.toString(), f6.gc, 0, new a1.e(26, iVar2, chat), b6Var), textView.getPaint().getFontMetricsInt(), false));
            o9Var2.e(chat, new z8(chat));
            frameLayout.setOnClickListener(new u1(6, iVar2, chat));
        } else {
            final TLRPC.User user2 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final int i17 = 0;
            textView.setText(Emoji.replaceEmoji(UserObject.getFirstName(user2), textView.getPaint().getFontMetricsInt(), false));
            o9Var2.e(user2, new z8(0, user2));
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: dg.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i17) {
                        case 0:
                            iVar2.run(user2);
                            break;
                        default:
                            iVar2.run(user2);
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
            final int i18 = 1;
            textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder3.toString(), f6.gc, 0, new Runnable() { // from class: dg.d0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            iVar2.run(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            iVar2.run(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, b6Var));
            textView2.setText(LocaleController.getString(R.string.BoostingNoRecipient));
            textView2.setTextColor(f6.v0(f6.j5, b6Var));
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
            o9Var.setVisibility(8);
        } else {
            final TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (user3 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                spannableStringBuilder4.append((CharSequence) UserObject.getFirstName(user3));
                spannableStringBuilder4.append((CharSequence) "**");
                final int i19 = 1;
                textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder4.toString(), f6.gc, 0, new Runnable() { // from class: dg.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i19) {
                            case 0:
                                iVar2.run(user3);
                                break;
                            default:
                                iVar2.run(user3);
                                break;
                        }
                    }
                }, b6Var), textView2.getPaint().getFontMetricsInt(), false));
                o9Var.e(user3, new z8(0, user3));
                g0Var.x.setOnClickListener(new View.OnClickListener() { // from class: dg.e0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i19) {
                            case 0:
                                iVar2.run(user3);
                                break;
                            default:
                                iVar2.run(user3);
                                break;
                        }
                    }
                });
            }
        }
        if (tL_payments_checkedGiftCode4.boost != null) {
            g0Var.y.setVisibility(8);
        }
    }

    @Override // f2.r0
    public final q1 x(ViewGroup viewGroup, int i9) {
        View xVar;
        Context context = viewGroup.getContext();
        b6 b6Var = this.c;
        if (i9 == 1) {
            xVar = new x(context, b6Var);
        } else if (i9 == 2) {
            xVar = new g0(context, b6Var);
        } else if (i9 == 3) {
            xVar = new h0(context, b6Var);
        } else if (i9 != 4) {
            xVar = i9 != 5 ? new u(context, b6Var) : new View(context);
        } else {
            xVar = new dg.a(context, b6Var);
            xVar.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
        }
        return r0.s(xVar, xVar, -1, -2);
    }
}
