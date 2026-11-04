package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public na A0;
    public final ArrayList B0;
    public final RectF C0;
    public Drawable D0;
    public int E;
    public int E0;
    public int F;
    public int G;
    public int H;
    public int I;
    public Drawable J;
    public FrameLayout K;
    public FrameLayout L;
    public yr0 M;
    public vg.n1 N;
    public int O;
    public int P;
    public org.telegram.ui.Components.jy Q;
    public final Paint R;
    public LinearGradient S;
    public final Matrix T;
    public final Paint U;
    public ks0 V;
    public vg.t1 W;
    public boolean X;
    public int Y;
    public int Z;
    public org.telegram.ui.Components.tj0 a;
    public boolean a0;
    public final ArrayList b;
    public boolean b0;
    public final ArrayList c;
    public float c0;
    public final ArrayList d;
    public int d0;
    public int e;
    public bs0 e0;
    public ms0 f;
    public vg.o0 f0;
    public float g0;
    public int h;
    public final int h0;
    public final boolean i0;
    public final String j0;
    public boolean k0;
    public final Bitmap l0;
    public final Canvas m0;
    public int n;
    public final vg.x0 n0;
    public final vg.x0 o0;
    public i0.b p0;
    public boolean q0;
    public int r;
    public float r0;
    public int s;
    public ci.ic s0;
    int showAdsRow;
    public int t0;
    public int u0;
    public ds0 v0;
    public int w;
    public eh.d w0;
    public int x;
    public final eh.g x0;
    public int y;
    public final eh.c y0;
    public final eh.c z0;

    public PremiumPreviewFragment(int i3, String str) {
        super(null);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        boolean z10 = false;
        this.e = 0;
        this.R = new Paint(1);
        this.T = new Matrix();
        this.U = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.l0 = createBitmap;
        this.m0 = new Canvas(createBitmap);
        this.n0 = new vg.x0(org.telegram.ui.ActionBar.k6.Dk, org.telegram.ui.ActionBar.k6.Ek, org.telegram.ui.ActionBar.k6.Fk, org.telegram.ui.ActionBar.k6.Gk, null);
        this.p0 = i0.b.e;
        vg.x0 x0Var = new vg.x0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, null);
        this.o0 = x0Var;
        x0Var.m = true;
        x0Var.o = 0.0f;
        x0Var.p = 0.0f;
        x0Var.q = 1.0f;
        x0Var.b = 0.0f;
        x0Var.c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.B0 = arrayList;
        RectF rectF = new RectF();
        this.C0 = rectF;
        arrayList.add(rectF);
        this.h0 = i3;
        if (!org.telegram.ui.ActionBar.k6.I.q() && i3 == 1) {
            z10 = true;
        }
        this.i0 = z10;
        this.j0 = str;
        m2.t tVar = new m2.t(this);
        if (Build.VERSION.SDK_INT >= 31) {
            eh.g gVar = new eh.g(true);
            this.x0 = gVar;
            si.f fVar = new si.f(null);
            fVar.d = gVar;
            fVar.e = -3;
            fVar.f = tVar;
            this.y0 = new eh.c(fVar, fVar, fVar);
        } else {
            this.x0 = null;
            this.y0 = new eh.c(tVar, tVar, tVar);
        }
        this.z0 = new eh.c(tVar, tVar, tVar);
    }

    public static void Z(PremiumPreviewFragment premiumPreviewFragment, View view, int i3) {
        org.telegram.ui.Components.e5 e5Var;
        yr0 yr0Var;
        int i10;
        int i11;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i12 = premiumPreviewFragment.h0;
        if (premiumPreviewFragment.getUserConfig().p()) {
            if (i3 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull b22 = premiumPreviewFragment.getMessagesController().b2(premiumPreviewFragment.getUserConfig().e());
                if (b22 == null) {
                    return;
                }
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                l8Var.setChecked(!l8Var.d());
                b22.sponsored_enabled = l8Var.d();
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = b22.sponsored_enabled;
                premiumPreviewFragment.getConnectionsManager().sendRequest(togglesponsoredmessages, new l(premiumPreviewFragment, 18));
                premiumPreviewFragment.getMessagesStorage().j2(b22, false);
                return;
            }
            if (view instanceof yr0) {
                yr0 yr0Var2 = (yr0) view;
                if (i12 != 1 || !premiumPreviewFragment.getUserConfig().q()) {
                    v0(premiumPreviewFragment.currentAccount, yr0Var2.f.a);
                    int i13 = premiumPreviewFragment.e;
                    premiumPreviewFragment.showDialog(new vg.v0(premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), premiumPreviewFragment.currentAccount, i12 == 1, yr0Var2.f.a, false, (i13 < 0 || i13 >= arrayList.size()) ? null : (ms0) arrayList.get(premiumPreviewFragment.e)));
                    return;
                }
                int i14 = yr0Var2.f.a;
                if (i14 == 29) {
                    premiumPreviewFragment.presentFragment(new lg.b1());
                    return;
                }
                if (i14 == 32) {
                    premiumPreviewFragment.presentFragment(new lg.t0());
                    return;
                }
                if (i14 == 33) {
                    lg.c cVar = new lg.c(null);
                    cVar.f = -4;
                    premiumPreviewFragment.presentFragment(cVar);
                    return;
                }
                if (i14 == 30) {
                    premiumPreviewFragment.presentFragment(new lg.d1());
                    return;
                }
                if (i14 == 34) {
                    premiumPreviewFragment.presentFragment(new lg.r0());
                    return;
                }
                if (i14 == 31) {
                    premiumPreviewFragment.presentFragment(new lg.r1());
                    return;
                }
                if (i14 == 14) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", org.telegram.messenger.h10.i(premiumPreviewFragment.currentAccount).e());
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.r80(bundle, null));
                    return;
                }
                if (i14 != 12) {
                    if (i14 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i14 == 36) {
                        premiumPreviewFragment.presentFragment(new lg.m());
                        return;
                    } else {
                        if (i14 == 37) {
                            premiumPreviewFragment.presentFragment(new lg.v());
                            return;
                        }
                        return;
                    }
                }
                Long h = org.telegram.messenger.l10.h(premiumPreviewFragment.getUserConfig().f());
                ai.q4 q4Var = new ai.q4(22, premiumPreviewFragment, yr0Var2);
                if (premiumPreviewFragment.v0 == null) {
                    x01[] x01VarArr = new x01[1];
                    boolean z10 = ((float) (yr0Var2.getHeight() + yr0Var2.getTop())) > ((float) premiumPreviewFragment.a.getMeasuredHeight()) / 2.0f;
                    float L = org.telegram.messenger.g0.L(330.0f);
                    Point point = org.telegram.messenger.g0.q;
                    int min = (int) Math.min(L, point.y * 0.75f);
                    int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                    org.telegram.ui.Components.e5 e5Var2 = yr0Var2.h;
                    if (e5Var2 != null) {
                        Drawable[] drawableArr = e5Var2.f;
                        Drawable drawable = drawableArr[1];
                        if (drawable != null) {
                            if (drawable instanceof org.telegram.ui.Components.g5) {
                                ((org.telegram.ui.Components.g5) drawable).o(e5Var2);
                            }
                            drawableArr[1] = null;
                        }
                        org.telegram.ui.Components.e5 e5Var3 = yr0Var2.h;
                        if (e5Var3 != null) {
                            e5Var3.f();
                            yr0Var2.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(yr0Var2.h.getBounds());
                            int L2 = z10 ? (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min : (-(yr0Var2.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            i11 = rect.centerX() - (point.x - min2);
                            e5Var = e5Var3;
                            i10 = L2;
                        } else {
                            e5Var = e5Var3;
                            i10 = 0;
                            i11 = 0;
                        }
                        yr0Var = yr0Var2;
                    } else {
                        e5Var = null;
                        yr0Var = null;
                        i10 = 0;
                        i11 = 0;
                    }
                    int i15 = i10;
                    cs0 cs0Var = new cs0(premiumPreviewFragment, premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), Integer.valueOf(i11), z10 ? 12 : 0, premiumPreviewFragment.getResourceProvider(), z10 ? 24 : 16, q4Var, x01VarArr);
                    cs0Var.h1 = true;
                    cs0Var.setSelected(h);
                    cs0Var.setSaveState(3);
                    cs0Var.y(e5Var, yr0Var);
                    ds0 ds0Var = new ds0(premiumPreviewFragment, cs0Var);
                    premiumPreviewFragment.v0 = ds0Var;
                    x01VarArr[0] = ds0Var;
                    ds0Var.showAsDropDown(yr0Var2, 0, i15, 53);
                    x01VarArr[0].b();
                }
            }
        }
    }

    public static void p0(org.telegram.ui.ActionBar.d2 d2Var, ms0 ms0Var, String str, ad.b bVar) {
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        boolean z10 = org.telegram.messenger.r2.a;
        int currentAccount = d2Var == null ? org.telegram.messenger.h10.t0 : d2Var.getCurrentAccount();
        if (org.telegram.messenger.hp.s1(currentAccount).v2()) {
            b.b(currentAccount);
            return;
        }
        if (ms0Var == null && (tL_help_premiumPromo = org.telegram.messenger.li.b0(currentAccount).E) != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = tL_help_premiumPromo.period_options;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = arrayList.get(i3);
                i3++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = tL_premiumSubscriptionOption2;
                int i10 = tL_premiumSubscriptionOption3.months;
                if (i10 == 1) {
                    ms0Var = new ms0(tL_premiumSubscriptionOption3);
                } else if (i10 == 12) {
                    ms0Var = new ms0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        ms0 ms0Var2 = ms0Var;
        u0();
        if (!org.telegram.messenger.r2.b()) {
            e5.l lVar = org.telegram.messenger.r1.l;
            if (lVar == null || lVar.h.isEmpty()) {
                return;
            }
            if (ms0Var2.f == null) {
                ms0Var2.f = org.telegram.messenger.r1.l;
            }
            ms0Var2.a();
            if (ms0Var2.g == null) {
                return;
            }
            org.telegram.messenger.r1.i().p("subs", new cg.e0(d2Var, currentAccount, bVar, ms0Var2, 8));
            return;
        }
        Activity parentActivity = d2Var != null ? d2Var.getParentActivity() : LaunchActivity.K1;
        if (parentActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) parentActivity;
            if (ms0Var2 != null && (tL_premiumSubscriptionOption = ms0Var2.a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                Uri parse = Uri.parse(str2);
                if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                    launchActivity.Z0 = true;
                }
                sf.c.t(launchActivity, tL_premiumSubscriptionOption.bot_url);
                return;
            }
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(currentAccount);
            if (TextUtils.isEmpty(s12.s6)) {
                if (TextUtils.isEmpty(s12.t6)) {
                    return;
                }
                launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + s12.t6)), null);
                return;
            }
            launchActivity.Z0 = true;
            launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + s12.s6 + "?start=" + str)), null);
        }
    }

    public static String q0(int i3) {
        switch (i3) {
            case 0:
                return "double_limits";
            case 1:
                return "more_upload";
            case 2:
                return "faster_download";
            case 3:
                return "no_ads";
            case 4:
                return "infinite_reactions";
            case 5:
                return "premium_stickers";
            case 6:
                return "profile_badge";
            case 7:
                return "animated_userpics";
            case 8:
                return "voice_to_text";
            case 9:
                return "advanced_chat_management";
            case 10:
                return "app_icons";
            case 11:
                return "animated_emoji";
            case 12:
                return "emoji_status";
            case 13:
                return "translations";
            case 14:
                return "stories";
            case 15:
                return "stories__stealth_mode";
            case 16:
                return "stories__permanent_views_history";
            case 17:
                return "stories__expiration_durations";
            case 18:
                return "stories__save_stories_to_gallery";
            case 19:
                return "stories__links_and_formatting";
            case 20:
                return "stories__priority_order";
            case 21:
                return "stories__caption";
            case 22:
                return "wallpapers";
            case 23:
                return "peer_colors";
            case 24:
                return "saved_tags";
            case 25:
                return "stories__quality";
            case 26:
                return "last_seen";
            case 27:
                return "message_privacy";
            case 28:
                return "business";
            case 29:
                return "business_location";
            case org.telegram.messenger.hs.T /* 30 */:
                return "business_hours";
            case org.telegram.messenger.hs.U /* 31 */:
                return "quick_replies";
            case 32:
                return "greeting_message";
            case 33:
                return "away_message";
            case 34:
                return "business_bots";
            case 35:
                return "folder_tags";
            case 36:
                return "business_intro";
            case 37:
                return "business_links";
            case 38:
                return "effects";
            case 39:
                return "todo";
            case 40:
                return "gifts";
            case 41:
                return "pm_noforwards";
            case 42:
                return "ai_compose";
            case 43:
                return "rich_formatting";
            default:
                return null;
        }
    }

    public static void r0(int i3, ArrayList arrayList, boolean z10) {
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        SparseIntArray sparseIntArray = s12.P0;
        if (z10) {
            arrayList.add(new ls0(12, R.drawable.filled_premium_status2, org.telegram.messenger.bd.M0(2131747024, null), org.telegram.messenger.bd.M0(2131747023, null)));
            arrayList.add(new ls0(35, R.drawable.premium_tags, org.telegram.messenger.bd.M0(2131747010, null), org.telegram.messenger.bd.M0(2131747009, null)));
            arrayList.add(new ls0(14, R.drawable.filled_premium_camera, org.telegram.messenger.bd.M0(2131747022, null), org.telegram.messenger.bd.M0(2131747021, null)));
        } else {
            arrayList.add(new ls0(29, R.drawable.filled_location, org.telegram.messenger.bd.M0(2131747061, null), org.telegram.messenger.bd.M0(2131747060, null)));
            arrayList.add(new ls0(30, R.drawable.filled_premium_hours, org.telegram.messenger.bd.M0(2131747059, null), org.telegram.messenger.bd.M0(2131747058, null)));
            arrayList.add(new ls0(31, R.drawable.filled_open_message, org.telegram.messenger.bd.M0(2131747057, null), org.telegram.messenger.bd.M0(2131747056, null)));
            arrayList.add(new ls0(32, R.drawable.premium_status, org.telegram.messenger.bd.M0(2131747065, null), org.telegram.messenger.bd.M0(2131747064, null)));
            arrayList.add(new ls0(33, R.drawable.filled_premium_away, org.telegram.messenger.bd.M0(2131747072, null), org.telegram.messenger.bd.M0(2131747071, null)));
            arrayList.add(new ls0(34, R.drawable.filled_premium_bots, org.telegram.messenger.bd.M0(2131747067, null), org.telegram.messenger.bd.M0(2131747066, null)));
            arrayList.add(new ls0(37, R.drawable.filled_premium_chatlink, org.telegram.messenger.bd.M0(2131747070, null), org.telegram.messenger.bd.M0(2131747069, null)));
            arrayList.add(new ls0(36, R.drawable.filled_premium_intro, org.telegram.messenger.bd.M0(2131747063, null), org.telegram.messenger.bd.M0(2131747062, null)));
        }
        int i10 = 0;
        if (sparseIntArray.size() > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (sparseIntArray.get(((ls0) arrayList.get(i11)).a, -1) == -1) {
                    boolean z11 = org.telegram.messenger.r2.a;
                }
            }
        }
        Collections.sort(arrayList, new as0(s12, i10));
    }

    public static void s0(int i3, ArrayList arrayList) {
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        int i10 = 1;
        arrayList.add(new ls0(0, R.drawable.msg_premium_limits, org.telegram.messenger.bd.M0(2131747006, null), org.telegram.messenger.bd.a0(null, null, 2131747005, Integer.valueOf(s12.E4), Integer.valueOf(s12.M4), Integer.valueOf(s12.Q4), Integer.valueOf(s12.S4), 4)));
        arrayList.add(new ls0(14, R.drawable.msg_filled_stories, org.telegram.messenger.bd.M0(2131746982, null), org.telegram.messenger.bd.a0(null, null, 2131746981, new Object[0])));
        arrayList.add(new ls0(1, R.drawable.msg_premium_uploads, org.telegram.messenger.bd.M0(2131746972, null), org.telegram.messenger.bd.M0(2131746971, null)));
        arrayList.add(new ls0(2, R.drawable.msg_premium_speed, org.telegram.messenger.bd.M0(2131747020, null), org.telegram.messenger.bd.M0(2131747019, null)));
        arrayList.add(new ls0(8, R.drawable.msg_premium_voice, org.telegram.messenger.bd.M0(2131746970, null), org.telegram.messenger.bd.M0(2131746969, null)));
        arrayList.add(new ls0(3, R.drawable.msg_premium_ads, org.telegram.messenger.bd.M0(2131747000, null), org.telegram.messenger.bd.M0(2131746999, null)));
        arrayList.add(new ls0(4, R.drawable.msg_premium_reactions, org.telegram.messenger.bd.M0(2131746990, null), org.telegram.messenger.bd.M0(2131746989, null)));
        arrayList.add(new ls0(5, R.drawable.msg_premium_stickers, org.telegram.messenger.bd.M0(2131746984, null), org.telegram.messenger.bd.M0(2131746983, null)));
        arrayList.add(new ls0(11, R.drawable.msg_premium_emoji, org.telegram.messenger.bd.M0(2131747015, null), org.telegram.messenger.bd.M0(2131747014, null)));
        arrayList.add(new ls0(9, R.drawable.menu_premium_tools, org.telegram.messenger.bd.M0(2131747033, null), org.telegram.messenger.bd.M0(2131747032, null)));
        arrayList.add(new ls0(6, R.drawable.msg_premium_badge, org.telegram.messenger.bd.M0(2131746995, null), org.telegram.messenger.bd.M0(2131746994, null)));
        arrayList.add(new ls0(27, R.drawable.filled_messages_paid, org.telegram.messenger.bd.M0(2131746997, null), org.telegram.messenger.bd.M0(2131746996, null)));
        arrayList.add(new ls0(7, R.drawable.msg_premium_avatar, org.telegram.messenger.bd.M0(2131747030, null), org.telegram.messenger.bd.M0(2131747029, null)));
        arrayList.add(new ls0(24, R.drawable.premium_tags, org.telegram.messenger.bd.M0(2131746979, null), org.telegram.messenger.bd.M0(2131746977, null)));
        arrayList.add(new ls0(10, R.drawable.msg_premium_icons, org.telegram.messenger.bd.M0(2131747028, null), org.telegram.messenger.bd.M0(2131747027, null)));
        arrayList.add(new ls0(12, R.drawable.premium_status, org.telegram.messenger.bd.M0(2131747012, null), org.telegram.messenger.bd.M0(2131747011, null)));
        arrayList.add(new ls0(13, R.drawable.msg_premium_translate, org.telegram.messenger.bd.M0(2131746974, null), org.telegram.messenger.bd.M0(2131746973, null)));
        arrayList.add(new ls0(22, R.drawable.premium_wallpaper, org.telegram.messenger.bd.M0(2131746967, null), org.telegram.messenger.bd.M0(2131746966, null)));
        arrayList.add(new ls0(23, R.drawable.premium_colors, org.telegram.messenger.bd.M0(2131746993, null), org.telegram.messenger.bd.M0(2131746992, null)));
        arrayList.add(new ls0(26, R.drawable.menu_premium_seen, org.telegram.messenger.bd.M0(2131747008, null), org.telegram.messenger.bd.M0(2131747007, null)));
        arrayList.add(new ls0(28, R.drawable.filled_premium_business, org.telegram.messenger.bd.M0(2131744262, null), org.telegram.messenger.bd.M0(2131747025, null)));
        arrayList.add(new ls0(38, R.drawable.menu_premium_effects, org.telegram.messenger.bd.M0(2131747017, null), org.telegram.messenger.bd.M0(2131747016, null)));
        arrayList.add(new ls0(39, R.drawable.msg_premium_icons, org.telegram.messenger.bd.M0(2131746976, null), org.telegram.messenger.bd.M0(2131746975, null)));
        arrayList.add(new ls0(41, R.drawable.filled_sharing_off2_24, org.telegram.messenger.bd.M0(2131746986, null), org.telegram.messenger.bd.M0(2131746985, null)));
        arrayList.add(new ls0(42, R.drawable.premium_ai_editor, org.telegram.messenger.bd.M0(2131747035, null), org.telegram.messenger.bd.M0(2131747034, null)));
        arrayList.add(new ls0(43, R.drawable.premium_rich_editor, org.telegram.messenger.bd.M0(2131746988, null), org.telegram.messenger.bd.M0(2131746987, null)));
        SparseIntArray sparseIntArray = s12.O0;
        if (sparseIntArray.size() > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (sparseIntArray.get(((ls0) arrayList.get(i11)).a, -1) == -1) {
                    boolean z10 = org.telegram.messenger.r2.a;
                }
            }
        }
        Collections.sort(arrayList, new as0(s12, i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String t0(int i3, ms0 ms0Var) {
        int i10;
        String str;
        int i11;
        String f10;
        int i12;
        boolean z10 = org.telegram.messenger.r2.a;
        if (ms0Var != null) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = ms0Var.a;
            if (!org.telegram.messenger.r2.b()) {
                ms0Var.a();
                if (ms0Var.g == null) {
                    return org.telegram.messenger.bd.M0(2131748787, null);
                }
            }
            boolean q10 = org.telegram.messenger.h10.i(i3).q();
            int i13 = tL_premiumSubscriptionOption.months;
            boolean z11 = i13 > 12 && i13 % 12 == 0;
            boolean z12 = i13 == 12;
            String f11 = z12 ? ms0Var.f() : ms0Var.e();
            if (q10) {
                i10 = z12 ? 2131743817 : 2131743818;
            } else {
                if (z12) {
                    if (org.telegram.messenger.hp.s1(i3).O5) {
                        f11 = ms0Var.e();
                    } else {
                        f11 = ms0Var.d();
                        i10 = 2131744439;
                    }
                } else if (!z11) {
                    f11 = ms0Var.e();
                } else {
                    if (!org.telegram.messenger.hp.s1(i3).O5) {
                        return org.telegram.messenger.bd.a0(null, null, 2131744440, ms0Var.d(), org.telegram.messenger.bd.G(tL_premiumSubscriptionOption.months / 12, "Years", new Object[0]));
                    }
                    f11 = ms0Var.e();
                }
                i10 = 2131744445;
            }
            return org.telegram.messenger.bd.a0(null, null, i10, f11);
        }
        long j10 = 12;
        if (org.telegram.messenger.r2.b()) {
            TLRPC.TL_help_premiumPromo tL_help_premiumPromo = org.telegram.messenger.li.b0(i3).E;
            if (tL_help_premiumPromo == null) {
                return org.telegram.messenger.bd.M0(2131744444, null);
            }
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = tL_help_premiumPromo.period_options;
            int size = arrayList.size();
            int i14 = 0;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = null;
            while (true) {
                if (i14 >= size) {
                    break;
                }
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList.get(i14);
                i14++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
                int i15 = tL_premiumSubscriptionOption4.months;
                if (i15 == 12) {
                    tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption4;
                    break;
                }
                if (tL_premiumSubscriptionOption2 == null && i15 == 1) {
                    tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption4;
                }
            }
            if (tL_premiumSubscriptionOption2 == null) {
                return org.telegram.messenger.bd.M0(2131744444, null);
            }
            if (tL_premiumSubscriptionOption2.months != 12) {
                f10 = org.telegram.messenger.r1.i().f(tL_premiumSubscriptionOption2.amount, tL_premiumSubscriptionOption2.currency);
            } else {
                if (!org.telegram.messenger.hp.s1(i3).O5) {
                    f10 = org.telegram.messenger.r1.i().f(tL_premiumSubscriptionOption2.amount, tL_premiumSubscriptionOption2.currency);
                    i12 = 2131744439;
                    return org.telegram.messenger.bd.a0(null, null, i12, f10);
                }
                f10 = org.telegram.messenger.r1.i().f(tL_premiumSubscriptionOption2.amount / 12, tL_premiumSubscriptionOption2.currency);
            }
            i12 = 2131744445;
            return org.telegram.messenger.bd.a0(null, null, i12, f10);
        }
        e5.l lVar = org.telegram.messenger.r1.l;
        if (lVar != null) {
            ArrayList arrayList2 = lVar.h;
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = ((e5.k) arrayList2.get(0)).b.b;
                int size2 = arrayList3.size();
                int i16 = 0;
                str = null;
                while (true) {
                    if (i16 >= size2) {
                        break;
                    }
                    Object obj = arrayList3.get(i16);
                    i16++;
                    e5.i iVar = (e5.i) obj;
                    String str2 = iVar.d;
                    String str3 = iVar.c;
                    long j11 = j10;
                    long j12 = iVar.b;
                    if (str2.equals("P1M")) {
                        str = iVar.a;
                    } else if (iVar.d.equals("P1Y")) {
                        if (org.telegram.messenger.hp.s1(i3).O5) {
                            org.telegram.messenger.r1.i().getClass();
                            str = org.telegram.messenger.r1.g(str3, 6, j12 / j11, false);
                        } else {
                            org.telegram.messenger.r1.i().getClass();
                            str = org.telegram.messenger.r1.g(str3, 6, j12, false);
                            i11 = 2131744439;
                        }
                    }
                    j10 = j11;
                }
                return str != null ? org.telegram.messenger.bd.M0(2131748787, null) : org.telegram.messenger.bd.a0(null, null, i11, str);
            }
        }
        str = null;
        i11 = 2131744445;
        if (str != null) {
        }
    }

    public static void u0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(org.telegram.messenger.h10.t0).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(org.telegram.messenger.h10.t0).sendRequest(tL_help_saveAppLog, new ei.u5(9));
    }

    public static void v0(int i3, int i10) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i3).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String q02 = q0(i10);
        if (q02 != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = q02;
            tL_jsonObjectValue.value = tL_jsonString;
        } else {
            tL_jsonObjectValue.value = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "item";
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(i3).sendRequest(tL_help_saveAppLog, new ei.u5(9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void w0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.h10.t0);
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = connectionsManager.getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_show";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        if (str != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = str;
            tL_jsonNull = tL_jsonString;
        } else {
            tL_jsonNull = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "source";
        tL_jsonObjectValue.value = tL_jsonNull;
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        connectionsManager.sendRequest(tL_help_saveAppLog, new ei.u5(9));
    }

    public final void A0(boolean z10) {
        ci.ic icVar;
        if (z10 != this.a0) {
            this.a0 = z10;
            ks0 ks0Var = this.V;
            if (ks0Var != null && (icVar = ks0Var.d) != null) {
                icVar.setDialogVisible(z10);
            }
            this.W.setPaused(z10);
            this.e0.invalidate();
        }
    }

    public final void B0() {
        ms0 ms0Var;
        this.y = -1;
        this.F = -1;
        this.s = -1;
        this.w = -1;
        this.x = -1;
        this.H = -1;
        this.showAdsRow = -1;
        this.I = -1;
        this.h = 1;
        this.n = 1;
        int size = this.b.size() + 1;
        this.h = size;
        this.r = size;
        int i3 = this.h0;
        if (i3 == 1 && getUserConfig().q()) {
            int i10 = this.h;
            int i11 = i10 + 1;
            this.y = i10;
            int i12 = i10 + 2;
            this.h = i12;
            this.s = i11;
            this.w = i12;
            int size2 = this.c.size() + i12;
            this.h = size2;
            this.x = size2;
        }
        int i13 = this.h;
        this.E = i13;
        this.h = i13 + 2;
        this.G = i13 + 1;
        if (i3 == 1 && getUserConfig().q()) {
            int i14 = this.h;
            this.H = i14;
            this.showAdsRow = i14 + 1;
            this.h = i14 + 3;
            this.I = i14 + 2;
        }
        org.telegram.messenger.g0.Z3(this.K, (getUserConfig().q() && ((ms0Var = this.f) == null || ms0Var.a.months >= ((ms0) this.d.get(this.e)).a.months || this.q0)) ? false : true, 1.0f, true, false);
        int L = this.K.getVisibility() == 0 ? org.telegram.messenger.g0.L(64.0f) : 0;
        org.telegram.ui.Components.jy jyVar = this.Q;
        jyVar.M = (this.Y + L) - org.telegram.messenger.g0.L(16.0f);
        jyVar.p1();
        this.Q.S = L;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean canBeginSlide() {
        ci.ic icVar;
        ks0 ks0Var = this.V;
        return ks0Var == null || (icVar = ks0Var.d) == null || !icVar.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        float f10;
        int i3 = 2;
        this.A0 = new na(this, i3);
        int i10 = 1;
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.R;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ck, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bk, false);
        int i11 = org.telegram.ui.ActionBar.k6.Ak;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.yk, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.S = linearGradient2;
        linearGradient2.setLocalMatrix(this.T);
        this.U.setShader(this.S);
        this.M = new yr0(context, null);
        this.N = new vg.n1(context);
        ArrayList arrayList = this.b;
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        int i12 = this.h0;
        if (i12 == 0) {
            s0(this.currentAccount, arrayList);
        } else {
            r0(this.currentAccount, arrayList, false);
            r0(this.currentAccount, arrayList2, true);
            lg.u1.f(this.currentAccount).h();
            if (getUserConfig().q()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                org.telegram.messenger.li.b0(this.currentAccount).m0(tL_inputStickerSetShortName, false);
                lg.f.a(this.currentAccount).c(null);
                if (getMessagesController().W0.isEmpty()) {
                    getMessagesController().d3();
                }
                lg.z d = lg.z.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable g7 = k2.p1.g(context, R.drawable.sheet_shadow_round);
        this.J = g7;
        g7.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.h5), PorterDuff.Mode.MULTIPLY));
        this.J.getPadding(rect);
        this.Y = org.telegram.messenger.g0.m;
        this.e0 = new bs0(this, context);
        kh.k kVar = new kh.k(this.e0);
        bs0 bs0Var = this.e0;
        eh.c cVar = this.y0;
        cVar.h = kVar;
        cVar.i = bs0Var;
        kh.k kVar2 = new kh.k(this.e0);
        bs0 bs0Var2 = this.e0;
        eh.c cVar2 = this.z0;
        cVar2.h = kVar2;
        cVar2.i = bs0Var2;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.a = tj0Var;
        tj0Var.setClipToOutline(true);
        int i13 = 8;
        this.a.setOutlineProvider(new gh.a(this, i13));
        this.a.D0(new zr0(this, i10));
        this.a.setCaptureSectionsDecoratorAllowed(true);
        this.a.setLegacySections(true);
        this.a.setSections(true);
        this.a.setClipToPadding(false);
        org.telegram.ui.Components.tj0 tj0Var2 = this.a;
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy((org.telegram.messenger.g0.L(68.0f) + this.Y) - org.telegram.messenger.g0.L(16.0f), this.a);
        this.Q = jyVar;
        tj0Var2.setLayoutManager(jyVar);
        this.Q.R = true;
        this.a.setAdapter(new fs0(this));
        this.a.j(new h3(this, 25));
        this.V = new ks0(this, context);
        vg.t1 t1Var = new vg.t1(context);
        this.W = t1Var;
        t1Var.c();
        if (i12 != 1) {
            f10 = 28.0f;
        } else if (this.i0) {
            vg.s1 s1Var = this.W.a;
            s1Var.q = true;
            s1Var.K = false;
            s1Var.H = true;
            s1Var.J = true;
            f10 = 28.0f;
            s1Var.k = org.telegram.messenger.g0.L(-14.0f);
            vg.s1 s1Var2 = this.W.a;
            s1Var2.x = 2000L;
            s1Var2.y = 3000;
            s1Var2.r = 16;
            s1Var2.G = false;
            s1Var2.O = 28;
            s1Var2.Q = i11;
        } else {
            f10 = 28.0f;
            vg.s1 s1Var3 = this.W.a;
            s1Var3.J = true;
            s1Var3.k = org.telegram.messenger.g0.L(28.0f);
            vg.s1 s1Var4 = this.W.a;
            s1Var4.x = 2000L;
            s1Var4.y = 3000;
            s1Var4.r = 16;
            s1Var4.G = false;
            s1Var4.O = 28;
        }
        this.V.d.setStarParticlesView(this.W);
        this.e0.addView(this.W, b8.mf.c(-2.0f, -1));
        this.e0.addView(this.V, b8.mf.c(-2.0f, -1));
        this.a.setOnItemClickListener(new h(this, 24));
        this.e0.addView(this.a, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 0.0f, -48.0f));
        this.L = new FrameLayout(context);
        vg.o0 o0Var = new vg.o0(context, getResourceProvider(), false);
        this.f0 = o0Var;
        o0Var.L = true;
        o0Var.setClickable(false);
        o0Var.w.setClickable(false);
        o0Var.setStateListAnimator(null);
        y0(false);
        this.K = new FrameLayout(context);
        this.L.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.L.addView(this.f0, b8.mf.c(-1.0f, -1));
        FrameLayout frameLayout = this.L;
        gh.g c2 = cVar.c(frameLayout, null, false);
        c2.p(b8.cd.j(this.resourceProvider));
        c2.r(org.telegram.messenger.g0.L(f10));
        c2.q(org.telegram.messenger.g0.L(5.0f));
        frameLayout.setBackground(c2);
        b8.pf.b(this.L, 0.02f, 1.5f);
        this.K.addView(this.L, b8.mf.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        eh.d dVar = new eh.d(cVar.c(this.K, null, false));
        dVar.b(org.telegram.messenger.g0.L(40.0f), false);
        this.w0 = new eh.d(cVar.c(this.e0, null, false));
        this.K.setBackground(dVar);
        if (getUserConfig().p()) {
            this.e0.addView(this.K, b8.mf.e(-1, -2, 80));
        }
        this.fragmentView = this.e0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var == null || !((ActionBarLayout) q4Var).U0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new hx(this, 29));
        this.actionBar.setForceSkipTouches(true);
        this.e0.addView(this.actionBar, b8.mf.e(-1, -2, 48));
        z0();
        B0();
        this.V.d.m(200L);
        if (this.q0) {
            org.telegram.messenger.g0.i3(new zr0(this, i3), 400L);
        }
        org.telegram.messenger.li.b0(this.currentAccount).o1();
        w0(this.j0);
        View view = this.fragmentView;
        ci0 ci0Var = new ci0(this, i13);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view, ci0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.j5;
        int i12 = org.telegram.messenger.hs.g5;
        if (i3 == i11 || i3 == i12) {
            y0(false);
            this.V.a();
        }
        if (i3 == org.telegram.messenger.hs.f5 || i3 == i12) {
            this.V.b();
            this.V.a();
            B0();
            this.a.getAdapter().f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.m3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.m3.c;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        return b8.qf.a(new h6(16, this), org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, org.telegram.ui.ActionBar.k6.Bk, org.telegram.ui.ActionBar.k6.Ck, org.telegram.ui.ActionBar.k6.Dk, org.telegram.ui.ActionBar.k6.Ek, org.telegram.ui.ActionBar.k6.Fk, org.telegram.ui.ActionBar.k6.Gk, org.telegram.ui.ActionBar.k6.Hk, org.telegram.ui.ActionBar.k6.Jk, org.telegram.ui.ActionBar.k6.Kk, org.telegram.ui.ActionBar.k6.Ik, org.telegram.ui.ActionBar.k6.Nk);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return this.i0;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void o0() {
        eh.g gVar;
        if (Build.VERSION.SDK_INT < 31 || (gVar = this.x0) == null) {
            return;
        }
        this.C0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.p0.d) - org.telegram.messenger.g0.L(132.0f), this.fragmentView.getMeasuredWidth(), org.telegram.messenger.g0.L(48.0f) + this.fragmentView.getMeasuredHeight());
        gVar.g(1, this.B0);
        gVar.e(this.A0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        A0(false);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        if (getMessagesController().D3()) {
            return false;
        }
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.j5);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f5);
        getNotificationCenter().c(this, org.telegram.messenger.hs.g5);
        if (getMediaDataController().E != null) {
            ArrayList<TLRPC.Document> arrayList = getMediaDataController().E.videos;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                TLRPC.Document document = arrayList.get(i3);
                i3++;
                org.telegram.messenger.w7.G(this.currentAccount).X(document, getMediaDataController().E, 3, 0);
            }
        }
        if (this.h0 == 1) {
            lg.y1.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.j5);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f5);
        getNotificationCenter().n(this, org.telegram.messenger.hs.g5);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        ci.ic icVar;
        super.onPause();
        ks0 ks0Var = this.V;
        if (ks0Var != null && (icVar = ks0Var.d) != null) {
            icVar.setDialogVisible(true);
        }
        vg.t1 t1Var = this.W;
        if (t1Var != null) {
            t1Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        ci.ic icVar;
        super.onResume();
        ks0 ks0Var = this.V;
        if (ks0Var != null && (icVar = ks0Var.d) != null) {
            icVar.setPaused(false);
            this.V.d.setDialogVisible(false);
        }
        this.W.setPaused(false);
        setBulletinDelegate(new x8(this, 7));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.h5);
        Drawable drawable = this.J;
        if (drawable != null && (drawable != this.D0 || themedColor != this.E0)) {
            this.D0 = drawable;
            this.E0 = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        try {
            vg.t1 t1Var = this.W;
            if (t1Var == null || t1Var.a == null || this.e0 == null) {
                return;
            }
            z0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        A0(showDialog != null);
        return showDialog;
    }

    public final void x0() {
        ks0 ks0Var;
        if (this.e0.getMeasuredWidth() == 0 || this.e0.getMeasuredHeight() == 0 || (ks0Var = this.V) == null || ks0Var.d == null) {
            return;
        }
        if (!this.i0) {
            int measuredWidth = this.e0.getMeasuredWidth();
            int measuredHeight = this.e0.getMeasuredHeight();
            vg.x0 x0Var = this.n0;
            x0Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.m0;
            canvas.save();
            canvas.scale(100.0f / this.e0.getMeasuredWidth(), 100.0f / this.e0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.e0.getMeasuredWidth(), this.e0.getMeasuredHeight(), x0Var.f);
            canvas.restore();
            this.V.d.setBackgroundBitmap(this.l0);
            return;
        }
        int f10 = i0.a.f(0.5f, getThemedColor(org.telegram.ui.ActionBar.k6.Ak), getThemedColor(org.telegram.ui.ActionBar.k6.h5));
        ci.ic icVar = this.s0;
        ci.ic icVar2 = this.V.d;
        if (icVar == icVar2 && this.t0 == f10) {
            return;
        }
        this.s0 = icVar2;
        this.t0 = f10;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawColor(f10);
        this.V.d.setBackgroundBitmap(createBitmap);
    }

    public final void y0(boolean z10) {
        if (this.f0 == null) {
            return;
        }
        boolean q10 = getUserConfig().q();
        ArrayList arrayList = this.d;
        if (!q10 || this.f == null || this.e >= arrayList.size() || ((ms0) arrayList.get(this.e)).a.months >= this.f.a.months) {
            if (org.telegram.messenger.bd.a0) {
                z10 = false;
            }
            int i3 = 25;
            if (!org.telegram.messenger.r2.b() && (!org.telegram.messenger.r1.i().k() || arrayList.isEmpty() || this.e >= arrayList.size() || ((ms0) arrayList.get(this.e)).f == null)) {
                this.f0.b(org.telegram.messenger.bd.M0(2131748787, null), null, z10);
                this.L.setOnClickListener(new ai.t(i3));
                this.f0.setFlickerDisabled(true);
            } else {
                if (arrayList.isEmpty() || this.e >= arrayList.size()) {
                    return;
                }
                this.f0.b(t0(this.currentAccount, (ms0) arrayList.get(this.e)), null, z10);
                this.L.setOnClickListener(new b40(this, i3));
                this.f0.setFlickerDisabled(false);
            }
        }
    }

    public final void z0() {
        wg.f fVar;
        if (this.V == null || this.actionBar == null) {
            return;
        }
        boolean z10 = this.i0;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, z10 ? org.telegram.ui.ActionBar.k6.G6 : org.telegram.ui.ActionBar.k6.Hk, false);
        if (x02 != this.u0) {
            this.u0 = x02;
            this.actionBar.D(x02, true);
            this.actionBar.D(x02, false);
        }
        int i3 = org.telegram.ui.ActionBar.k6.Hk;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i3, false), 60);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar.q0 != o10) {
            kVar.C(o10, false);
        }
        this.W.a.g();
        ks0 ks0Var = this.V;
        if (ks0Var != null) {
            ks0Var.a.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, z10 ? org.telegram.ui.ActionBar.k6.G6 : i3, false));
            TextView textView = this.V.b;
            if (z10) {
                i3 = org.telegram.ui.ActionBar.k6.G6;
            }
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
            ci.ic icVar = this.V.d;
            if (icVar != null && (fVar = icVar.b) != null) {
                if (z10) {
                    fVar.z = org.telegram.ui.ActionBar.k6.Lk;
                    fVar.A = org.telegram.ui.ActionBar.k6.Mk;
                }
                fVar.b();
            }
        }
        x0();
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
