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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ow0 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public ow0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 1 || i10 == 8;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.h;
    }

    @Override // s4.h0
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
        if (i10 == premiumPreviewFragment.x || i10 == premiumPreviewFragment.y || i10 == premiumPreviewFragment.E || i10 == premiumPreviewFragment.H) {
            return 5;
        }
        if (i10 == premiumPreviewFragment.F) {
            return 6;
        }
        if (i10 == premiumPreviewFragment.s || i10 == premiumPreviewFragment.G) {
            return 7;
        }
        return i10 == premiumPreviewFragment.showAdsRow ? 8 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x02be  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        TLRPC.TL_help_premiumPromo premiumPromo;
        String str;
        String str2;
        int i11;
        boolean z10;
        View view = e1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z11 = premiumPreviewFragment.h0;
        int i12 = premiumPreviewFragment.n;
        boolean z12 = false;
        if (i10 >= i12 && i10 < premiumPreviewFragment.r) {
            ((gw0) view).a((ww0) premiumPreviewFragment.b.get(i10 - i12), i10 != premiumPreviewFragment.r - 1);
            return;
        }
        int i13 = premiumPreviewFragment.v;
        if (i10 >= i13 && i10 < premiumPreviewFragment.w) {
            ((gw0) view).a((ww0) premiumPreviewFragment.c.get(i10 - i13), i10 != premiumPreviewFragment.w - 1);
            return;
        }
        String str3 = "";
        if (i10 == premiumPreviewFragment.x) {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            i9Var.setText("");
            i9Var.setFixedSize(12);
            return;
        }
        if (i10 != premiumPreviewFragment.y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
            if (i10 == premiumPreviewFragment.s) {
                ((org.telegram.ui.Cells.q4) view).setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeatures));
                return;
            }
            if (i10 == premiumPreviewFragment.G) {
                ((org.telegram.ui.Cells.q4) view).setText(LocaleController.getString(R.string.ShowAdsTitle));
                return;
            }
            if (i10 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(premiumPreviewFragment.getUserConfig().getClientUserId());
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                String string = LocaleController.getString(R.string.ShowAds);
                if (userFull != null && !userFull.sponsored_enabled) {
                    r6 = false;
                }
                v8Var.l(string, r6, false);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.i9 i9Var2 = (org.telegram.ui.Cells.i9) view;
        if (!z11) {
            i9Var2.setTextColor(org.telegram.ui.ActionBar.y6.o1(0.75f, -1));
            i9Var2.getTextView().setLinkTextColor(-1);
            i9Var2.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.15f, -1)));
        }
        i9Var2.setFixedSize(0);
        if (i10 == premiumPreviewFragment.H) {
            i9Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ShowAdsInfo), new lj0(this, 26)), true));
            return;
        }
        int i14 = premiumPreviewFragment.y;
        if (i10 == i14 && premiumPreviewFragment.g0 == 1) {
            i9Var2.setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeaturesInfo));
            return;
        }
        if (i10 != i14 || (premiumPromo = premiumPreviewFragment.getMediaDataController().getPremiumPromo()) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(premiumPromo.status_text);
        MediaDataController.addTextStyleRuns(premiumPromo.status_entities, premiumPromo.status_text, spannableString);
        org.telegram.ui.Components.z11[] z11VarArr = (org.telegram.ui.Components.z11[]) spannableString.getSpans(0, spannableString.length(), org.telegram.ui.Components.z11.class);
        int length = z11VarArr.length;
        int i15 = 0;
        while (i15 < length) {
            org.telegram.ui.Components.y11 y11Var = z11VarArr[i15].b;
            TLRPC.MessageEntity messageEntity = y11Var.d;
            if (messageEntity != null) {
                String str4 = premiumPromo.status_text;
                int i16 = messageEntity.offset;
                str = TextUtils.substring(str4, i16, messageEntity.length + i16);
            } else {
                str = null;
            }
            TLRPC.MessageEntity messageEntity2 = y11Var.d;
            if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                spannableString.setSpan(new org.telegram.ui.Components.u61(str, 0, y11Var), y11Var.b, y11Var.c, 33);
            } else {
                if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    str2 = str3;
                    i11 = 33;
                    spannableString.setSpan(new org.telegram.ui.Components.x61(str, y11Var), y11Var.b, y11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new org.telegram.ui.Components.z61(org.telegram.ui.Components.b10.j("mailto:", str), y11Var), y11Var.b, y11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (str.toLowerCase().contains("://")) {
                        spannableString.setSpan(new org.telegram.ui.Components.v61(str, y11Var), y11Var.b, y11Var.c, 33);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.v61("http://".concat(str), y11Var), y11Var.b, y11Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new org.telegram.ui.Components.x61(org.telegram.ui.Components.b10.j("card:", str), y11Var), y11Var.b, y11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String d = kf.b.d(str, z12);
                    if (str.startsWith("+")) {
                        d = org.telegram.ui.Components.b10.j("+", d);
                    }
                    spannableString.setSpan(new org.telegram.ui.Components.v61(org.telegram.ui.Components.b10.j("tel:", d), y11Var), y11Var.b, y11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                    org.telegram.ui.Components.z61 z61Var = new org.telegram.ui.Components.z61(y11Var.d.url, y11Var);
                    z61Var.b = true;
                    spannableString.setSpan(z61Var, y11Var.b, y11Var.c, 33);
                    if (!z11) {
                        spannableString.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.bold()), y11Var.b, y11Var.c, 33);
                    }
                    str2 = str3;
                    i11 = 33;
                } else {
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                        StringBuilder sb2 = new StringBuilder(str3);
                        str2 = str3;
                        sb2.append(((TLRPC.TL_messageEntityMentionName) y11Var.d).user_id);
                        spannableString.setSpan(new org.telegram.ui.Components.a71(sb2.toString(), 0, y11Var), y11Var.b, y11Var.c, 33);
                    } else {
                        str2 = str3;
                        if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            spannableString.setSpan(new org.telegram.ui.Components.a71(str2 + ((TLRPC.TL_inputMessageEntityMentionName) y11Var.d).user_id.user_id, 0, y11Var), y11Var.b, y11Var.c, 33);
                        } else if ((y11Var.a & 4) != 0) {
                            str2 = str2;
                            i11 = 33;
                            spannableString.setSpan(new org.telegram.ui.Components.w61(spannableString, y11Var.b, y11Var.c, (byte) 0, y11Var), y11Var.b, y11Var.c, 33);
                        } else {
                            str2 = str2;
                            spannableString.setSpan(new org.telegram.ui.Components.z11(y11Var, 0), y11Var.b, y11Var.c, 33);
                            z10 = false;
                            i15++;
                            z12 = z10;
                            str3 = str2;
                        }
                    }
                    i11 = 33;
                }
                if ((y11Var.a & 256) != 0) {
                    z10 = false;
                    spannableString.setSpan(new org.telegram.ui.Components.z11(y11Var, 0), y11Var.b, y11Var.c, i11);
                    i15++;
                    z12 = z10;
                    str3 = str2;
                }
                z10 = false;
                i15++;
                z12 = z10;
                str3 = str2;
            }
            str2 = str3;
            i11 = 33;
            if ((y11Var.a & 256) != 0) {
            }
            z10 = false;
            i15++;
            z12 = z10;
            str3 = str2;
        }
        i9Var2.setText(spannableString);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View nw0Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                nw0Var = new nw0(this, context);
                break;
            case 2:
                nw0Var = new org.telegram.ui.Cells.f7(context, 0, 0);
                break;
            case 3:
            default:
                nw0Var = new z10(this, context, 6);
                nw0Var.setTag(-33024);
                break;
            case 4:
                nw0Var = new tg.a(context);
                break;
            case 5:
                nw0Var = new org.telegram.ui.Cells.i9(context);
                break;
            case 6:
                nw0Var = new View(context);
                nw0Var.setTag(-33024);
                break;
            case 7:
                nw0Var = new org.telegram.ui.Cells.q4(context);
                break;
            case 8:
                u6Var = ((org.telegram.ui.ActionBar.r2) this.c).resourceProvider;
                nw0Var = new org.telegram.ui.Cells.v8(23, context, u6Var, false, true);
                break;
        }
        return ic.a.n(nw0Var, nw0Var, -1, -2);
    }
}
