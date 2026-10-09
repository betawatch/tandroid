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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class cx0 extends org.telegram.ui.Components.pm0 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public cx0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f;
        return i10 == 1 || i10 == 8;
    }

    @Override // s4.i0
    public final int h() {
        return this.c.h;
    }

    @Override // s4.i0
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
    @Override // s4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.TL_help_premiumPromo premiumPromo;
        String str;
        String str2;
        int i11;
        boolean z10;
        View view = d1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z11 = premiumPreviewFragment.h0;
        int i12 = premiumPreviewFragment.n;
        boolean z12 = false;
        if (i10 >= i12 && i10 < premiumPreviewFragment.r) {
            ((uw0) view).a((kx0) premiumPreviewFragment.b.get(i10 - i12), i10 != premiumPreviewFragment.r - 1);
            return;
        }
        int i13 = premiumPreviewFragment.v;
        if (i10 >= i13 && i10 < premiumPreviewFragment.w) {
            ((uw0) view).a((kx0) premiumPreviewFragment.c.get(i10 - i13), i10 != premiumPreviewFragment.w - 1);
            return;
        }
        String str3 = "";
        if (i10 == premiumPreviewFragment.x) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setText("");
            e9Var.setFixedSize(12);
            return;
        }
        if (i10 != premiumPreviewFragment.y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
            if (i10 == premiumPreviewFragment.s) {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeatures));
                return;
            }
            if (i10 == premiumPreviewFragment.G) {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.ShowAdsTitle));
                return;
            }
            if (i10 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(premiumPreviewFragment.getUserConfig().getClientUserId());
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                String string = LocaleController.getString(R.string.ShowAds);
                if (userFull != null && !userFull.sponsored_enabled) {
                    r6 = false;
                }
                r8Var.j(string, r6, false);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.e9 e9Var2 = (org.telegram.ui.Cells.e9) view;
        if (!z11) {
            e9Var2.setTextColor(org.telegram.ui.ActionBar.i6.m1(0.75f, -1));
            e9Var2.getTextView().setLinkTextColor(-1);
            e9Var2.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.i6.m1(0.15f, -1)));
        }
        e9Var2.setFixedSize(0);
        if (i10 == premiumPreviewFragment.H) {
            e9Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ShowAdsInfo), new tk0(this, 24)), true));
            return;
        }
        int i14 = premiumPreviewFragment.y;
        if (i10 == i14 && premiumPreviewFragment.g0 == 1) {
            e9Var2.setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeaturesInfo));
            return;
        }
        if (i10 != i14 || (premiumPromo = premiumPreviewFragment.getMediaDataController().getPremiumPromo()) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(premiumPromo.status_text);
        MediaDataController.addTextStyleRuns(premiumPromo.status_entities, premiumPromo.status_text, spannableString);
        org.telegram.ui.Components.u11[] u11VarArr = (org.telegram.ui.Components.u11[]) spannableString.getSpans(0, spannableString.length(), org.telegram.ui.Components.u11.class);
        int length = u11VarArr.length;
        int i15 = 0;
        while (i15 < length) {
            org.telegram.ui.Components.t11 t11Var = u11VarArr[i15].b;
            TLRPC.MessageEntity messageEntity = t11Var.d;
            if (messageEntity != null) {
                String str4 = premiumPromo.status_text;
                int i16 = messageEntity.offset;
                str = TextUtils.substring(str4, i16, messageEntity.length + i16);
            } else {
                str = null;
            }
            TLRPC.MessageEntity messageEntity2 = t11Var.d;
            if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                spannableString.setSpan(new org.telegram.ui.Components.q61(str, 0, t11Var), t11Var.b, t11Var.c, 33);
            } else {
                if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    str2 = str3;
                    i11 = 33;
                    spannableString.setSpan(new org.telegram.ui.Components.t61(str, t11Var), t11Var.b, t11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new org.telegram.ui.Components.v61(sc.v.i("mailto:", str), t11Var), t11Var.b, t11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (str.toLowerCase().contains("://")) {
                        spannableString.setSpan(new org.telegram.ui.Components.r61(str, t11Var), t11Var.b, t11Var.c, 33);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.r61("http://".concat(str), t11Var), t11Var.b, t11Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new org.telegram.ui.Components.t61(sc.v.i("card:", str), t11Var), t11Var.b, t11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String d = hf.b.d(str, z12);
                    if (str.startsWith("+")) {
                        d = sc.v.i("+", d);
                    }
                    spannableString.setSpan(new org.telegram.ui.Components.r61(sc.v.i("tel:", d), t11Var), t11Var.b, t11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                    org.telegram.ui.Components.v61 v61Var = new org.telegram.ui.Components.v61(t11Var.d.url, t11Var);
                    v61Var.b = true;
                    spannableString.setSpan(v61Var, t11Var.b, t11Var.c, 33);
                    if (!z11) {
                        spannableString.setSpan(new org.telegram.ui.Components.m61(AndroidUtilities.bold()), t11Var.b, t11Var.c, 33);
                    }
                    str2 = str3;
                    i11 = 33;
                } else {
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                        StringBuilder sb2 = new StringBuilder(str3);
                        str2 = str3;
                        sb2.append(((TLRPC.TL_messageEntityMentionName) t11Var.d).user_id);
                        spannableString.setSpan(new org.telegram.ui.Components.w61(sb2.toString(), 0, t11Var), t11Var.b, t11Var.c, 33);
                    } else {
                        str2 = str3;
                        if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            spannableString.setSpan(new org.telegram.ui.Components.w61(str2 + ((TLRPC.TL_inputMessageEntityMentionName) t11Var.d).user_id.user_id, 0, t11Var), t11Var.b, t11Var.c, 33);
                        } else if ((t11Var.a & 4) != 0) {
                            str2 = str2;
                            i11 = 33;
                            spannableString.setSpan(new org.telegram.ui.Components.s61(spannableString, t11Var.b, t11Var.c, (byte) 0, t11Var), t11Var.b, t11Var.c, 33);
                        } else {
                            str2 = str2;
                            spannableString.setSpan(new org.telegram.ui.Components.u11(t11Var, 0), t11Var.b, t11Var.c, 33);
                            z10 = false;
                            i15++;
                            z12 = z10;
                            str3 = str2;
                        }
                    }
                    i11 = 33;
                }
                if ((t11Var.a & 256) != 0) {
                    z10 = false;
                    spannableString.setSpan(new org.telegram.ui.Components.u11(t11Var, 0), t11Var.b, t11Var.c, i11);
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
            if ((t11Var.a & 256) != 0) {
            }
            z10 = false;
            i15++;
            z12 = z10;
            str3 = str2;
        }
        e9Var2.setText(spannableString);
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View bx0Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                bx0Var = new bx0(this, context);
                break;
            case 2:
                bx0Var = new org.telegram.ui.Cells.b7(context, 0, 0);
                break;
            case 3:
            default:
                bx0Var = new q50(this, context, 5);
                bx0Var.setTag(-33024);
                break;
            case 4:
                bx0Var = new rg.a(context);
                break;
            case 5:
                bx0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 6:
                bx0Var = new View(context);
                bx0Var.setTag(-33024);
                break;
            case 7:
                bx0Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.n2) this.c).resourceProvider;
                bx0Var = new org.telegram.ui.Cells.r8(23, context, e6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(bx0Var, bx0Var, -1, -2);
    }
}
