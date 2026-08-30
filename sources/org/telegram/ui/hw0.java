package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hw0 extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public hw0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 1 || i10 == 8;
    }

    @Override // f2.o0
    public final int h() {
        return this.c.h;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        if (i10 >= premiumPreviewFragment.n && i10 < premiumPreviewFragment.r) {
            return 1;
        }
        if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.w) {
            return 1;
        }
        if (i10 == 0) {
            return 4;
        }
        if (i10 == premiumPreviewFragment.x || i10 == premiumPreviewFragment.y || i10 == premiumPreviewFragment.B || i10 == premiumPreviewFragment.E) {
            return 5;
        }
        if (i10 == premiumPreviewFragment.C) {
            return 6;
        }
        if (i10 == premiumPreviewFragment.s || i10 == premiumPreviewFragment.D) {
            return 7;
        }
        return i10 == premiumPreviewFragment.showAdsRow ? 8 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x02be  */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.TL_help_premiumPromo premiumPromo;
        String str;
        String str2;
        int i11;
        View view = l1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z4 = premiumPreviewFragment.e0;
        int i12 = premiumPreviewFragment.n;
        boolean z10 = false;
        if (i10 >= i12 && i10 < premiumPreviewFragment.r) {
            ((zv0) view).a((pw0) premiumPreviewFragment.b.get(i10 - i12), i10 != premiumPreviewFragment.r - 1);
            return;
        }
        int i13 = premiumPreviewFragment.v;
        if (i10 >= i13 && i10 < premiumPreviewFragment.w) {
            ((zv0) view).a((pw0) premiumPreviewFragment.c.get(i10 - i13), i10 != premiumPreviewFragment.w - 1);
            return;
        }
        String str3 = "";
        if (i10 == premiumPreviewFragment.x) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setText("");
            a9Var.setFixedSize(12);
            return;
        }
        if (i10 != premiumPreviewFragment.y && i10 != premiumPreviewFragment.B && i10 != premiumPreviewFragment.E) {
            if (i10 == premiumPreviewFragment.s) {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeatures));
                return;
            }
            if (i10 == premiumPreviewFragment.D) {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.ShowAdsTitle));
                return;
            }
            if (i10 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(premiumPreviewFragment.getUserConfig().getClientUserId());
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                String string = LocaleController.getString(R.string.ShowAds);
                if (userFull != null && !userFull.sponsored_enabled) {
                    r6 = false;
                }
                o8Var.j(string, r6, false);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.a9 a9Var2 = (org.telegram.ui.Cells.a9) view;
        if (!z4) {
            a9Var2.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.75f, -1));
            a9Var2.getTextView().setLinkTextColor(-1);
            a9Var2.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.15f, -1)));
        }
        a9Var2.setFixedSize(0);
        if (i10 == premiumPreviewFragment.E) {
            a9Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ShowAdsInfo), new el0(this, 24)), true));
            return;
        }
        int i14 = premiumPreviewFragment.y;
        if (i10 == i14 && premiumPreviewFragment.d0 == 1) {
            a9Var2.setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeaturesInfo));
            return;
        }
        if (i10 != i14 || (premiumPromo = premiumPreviewFragment.getMediaDataController().getPremiumPromo()) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(premiumPromo.status_text);
        MediaDataController.addTextStyleRuns(premiumPromo.status_entities, premiumPromo.status_text, spannableString);
        org.telegram.ui.Components.t01[] t01VarArr = (org.telegram.ui.Components.t01[]) spannableString.getSpans(0, spannableString.length(), org.telegram.ui.Components.t01.class);
        int length = t01VarArr.length;
        int i15 = 0;
        while (i15 < length) {
            org.telegram.ui.Components.s01 s01Var = t01VarArr[i15].b;
            TLRPC.MessageEntity messageEntity = s01Var.d;
            if (messageEntity != null) {
                String str4 = premiumPromo.status_text;
                int i16 = messageEntity.offset;
                str = TextUtils.substring(str4, i16, messageEntity.length + i16);
            } else {
                str = null;
            }
            TLRPC.MessageEntity messageEntity2 = s01Var.d;
            if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                spannableString.setSpan(new org.telegram.ui.Components.j51(str, 0, s01Var), s01Var.b, s01Var.c, 33);
            } else {
                if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    str2 = str3;
                    i11 = 33;
                    spannableString.setSpan(new org.telegram.ui.Components.m51(str, s01Var), s01Var.b, s01Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new org.telegram.ui.Components.o51(vh.v2.e("mailto:", str), s01Var), s01Var.b, s01Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (str.toLowerCase().contains("://")) {
                        spannableString.setSpan(new org.telegram.ui.Components.k51(str, s01Var), s01Var.b, s01Var.c, 33);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.k51("http://".concat(str), s01Var), s01Var.b, s01Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new org.telegram.ui.Components.m51(vh.v2.e("card:", str), s01Var), s01Var.b, s01Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String d = se.b.d(str, z10);
                    if (str.startsWith("+")) {
                        d = vh.v2.e("+", d);
                    }
                    spannableString.setSpan(new org.telegram.ui.Components.k51(vh.v2.e("tel:", d), s01Var), s01Var.b, s01Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                    org.telegram.ui.Components.o51 o51Var = new org.telegram.ui.Components.o51(s01Var.d.url, s01Var);
                    o51Var.b = true;
                    spannableString.setSpan(o51Var, s01Var.b, s01Var.c, 33);
                    if (!z4) {
                        spannableString.setSpan(new org.telegram.ui.Components.f51(AndroidUtilities.bold()), s01Var.b, s01Var.c, 33);
                    }
                } else {
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                        StringBuilder sb = new StringBuilder(str3);
                        str2 = str3;
                        sb.append(((TLRPC.TL_messageEntityMentionName) s01Var.d).user_id);
                        spannableString.setSpan(new org.telegram.ui.Components.p51(sb.toString(), 0, s01Var), s01Var.b, s01Var.c, 33);
                    } else {
                        str2 = str3;
                        if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            spannableString.setSpan(new org.telegram.ui.Components.p51(str2 + ((TLRPC.TL_inputMessageEntityMentionName) s01Var.d).user_id.user_id, 0, s01Var), s01Var.b, s01Var.c, 33);
                        } else if ((s01Var.a & 4) != 0) {
                            str2 = str2;
                            i11 = 33;
                            spannableString.setSpan(new org.telegram.ui.Components.l51(spannableString, s01Var.b, s01Var.c, (byte) 0, s01Var), s01Var.b, s01Var.c, 33);
                        } else {
                            str2 = str2;
                            spannableString.setSpan(new org.telegram.ui.Components.t01(s01Var, 0), s01Var.b, s01Var.c, 33);
                            i15++;
                            str3 = str2;
                            z10 = false;
                        }
                    }
                    i11 = 33;
                }
                if ((s01Var.a & 256) != 0) {
                    spannableString.setSpan(new org.telegram.ui.Components.t01(s01Var, 0), s01Var.b, s01Var.c, i11);
                    i15++;
                    str3 = str2;
                    z10 = false;
                }
                i15++;
                str3 = str2;
                z10 = false;
            }
            str2 = str3;
            i11 = 33;
            if ((s01Var.a & 256) != 0) {
            }
            i15++;
            str3 = str2;
            z10 = false;
        }
        a9Var2.setText(spannableString);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View c2Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                c2Var = new eg.c2(this, context);
                break;
            case 2:
                c2Var = new org.telegram.ui.Cells.z6(context, 0, 0);
                break;
            case 3:
            default:
                c2Var = new gw0(this, context, 0);
                c2Var.setTag(-33024);
                break;
            case 4:
                c2Var = new eg.a(context);
                break;
            case 5:
                c2Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 6:
                c2Var = new View(context);
                c2Var.setTag(-33024);
                break;
            case 7:
                c2Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.p2) this.c).resourceProvider;
                c2Var = new org.telegram.ui.Cells.o8(23, context, f6Var, false, true);
                break;
        }
        return yh.o(c2Var, c2Var, -1, -2);
    }
}
