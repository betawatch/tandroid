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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public oa A0;
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
    public fs0 M;
    public ug.l1 N;
    public int O;
    public int P;
    public org.telegram.ui.Components.qy Q;
    public final Paint R;
    public LinearGradient S;
    public final Matrix T;
    public final Paint U;
    public rs0 V;
    public ug.s1 W;
    public boolean X;
    public int Y;
    public int Z;
    public org.telegram.ui.Components.uj0 a;
    public boolean a0;
    public final ArrayList b;
    public boolean b0;
    public final ArrayList c;
    public float c0;
    public final ArrayList d;
    public int d0;
    public int e;
    public is0 e0;
    public ts0 f;
    public ug.q0 f0;
    public float g0;
    public int h;
    public final int h0;
    public final boolean i0;
    public final String j0;
    public boolean k0;
    public final Bitmap l0;
    public final Canvas m0;
    public int n;
    public final ug.z0 n0;
    public final ug.z0 o0;
    public i0.c p0;
    public boolean q0;
    public int r;
    public float r0;
    public int s;
    public di.xb s0;
    int showAdsRow;
    public int t0;
    public int u0;
    public ks0 v0;
    public int w;
    public dh.d w0;
    public int x;
    public final dh.g x0;
    public int y;
    public final dh.c y0;
    public final dh.c z0;

    public PremiumPreviewFragment(int i7, String str) {
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
        this.n0 = new ug.z0(org.telegram.ui.ActionBar.j6.Gk, org.telegram.ui.ActionBar.j6.Hk, org.telegram.ui.ActionBar.j6.Ik, org.telegram.ui.ActionBar.j6.Jk, null);
        this.p0 = i0.c.e;
        ug.z0 z0Var = new ug.z0(org.telegram.ui.ActionBar.j6.Ck, org.telegram.ui.ActionBar.j6.Dk, -1, -1, null);
        this.o0 = z0Var;
        z0Var.m = true;
        z0Var.o = 0.0f;
        z0Var.p = 0.0f;
        z0Var.q = 1.0f;
        z0Var.b = 0.0f;
        z0Var.c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.B0 = arrayList;
        RectF rectF = new RectF();
        this.C0 = rectF;
        arrayList.add(rectF);
        this.h0 = i7;
        if (!org.telegram.ui.ActionBar.j6.I.q() && i7 == 1) {
            z10 = true;
        }
        this.i0 = z10;
        this.j0 = str;
        k8.a aVar = new k8.a(this);
        if (Build.VERSION.SDK_INT >= 31) {
            dh.g gVar = new dh.g(true);
            this.x0 = gVar;
            ui.f fVar = new ui.f(null);
            fVar.d = gVar;
            fVar.e = -3;
            fVar.f = aVar;
            this.y0 = new dh.c(fVar, fVar, fVar);
        } else {
            this.x0 = null;
            this.y0 = new dh.c(aVar, aVar, aVar);
        }
        this.z0 = new dh.c(aVar, aVar, aVar);
    }

    public static void Z(PremiumPreviewFragment premiumPreviewFragment, View view, int i7) {
        org.telegram.ui.Components.e5 e5Var;
        fs0 fs0Var;
        int i10;
        int i11;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i12 = premiumPreviewFragment.h0;
        if (premiumPreviewFragment.getUserConfig().p()) {
            if (i7 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull b22 = premiumPreviewFragment.getMessagesController().b2(premiumPreviewFragment.getUserConfig().e());
                if (b22 == null) {
                    return;
                }
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                l8Var.setChecked(!l8Var.d());
                b22.sponsored_enabled = l8Var.d();
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = b22.sponsored_enabled;
                premiumPreviewFragment.getConnectionsManager().sendRequest(togglesponsoredmessages, new l(premiumPreviewFragment, 17));
                premiumPreviewFragment.getMessagesStorage().j2(b22, false);
                return;
            }
            if (view instanceof fs0) {
                fs0 fs0Var2 = (fs0) view;
                if (i12 != 1 || !premiumPreviewFragment.getUserConfig().q()) {
                    v0(premiumPreviewFragment.currentAccount, fs0Var2.f.a);
                    int i13 = premiumPreviewFragment.e;
                    premiumPreviewFragment.showDialog(new ug.x0(premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), premiumPreviewFragment.currentAccount, i12 == 1, fs0Var2.f.a, false, (i13 < 0 || i13 >= arrayList.size()) ? null : (ts0) arrayList.get(premiumPreviewFragment.e)));
                    return;
                }
                int i14 = fs0Var2.f.a;
                if (i14 == 29) {
                    premiumPreviewFragment.presentFragment(new kg.a1());
                    return;
                }
                if (i14 == 32) {
                    premiumPreviewFragment.presentFragment(new kg.s0());
                    return;
                }
                if (i14 == 33) {
                    kg.c cVar = new kg.c(null);
                    cVar.f = -4;
                    premiumPreviewFragment.presentFragment(cVar);
                    return;
                }
                if (i14 == 30) {
                    premiumPreviewFragment.presentFragment(new kg.c1());
                    return;
                }
                if (i14 == 34) {
                    premiumPreviewFragment.presentFragment(new kg.q0());
                    return;
                }
                if (i14 == 31) {
                    premiumPreviewFragment.presentFragment(new kg.r1());
                    return;
                }
                if (i14 == 14) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", org.telegram.messenger.m10.i(premiumPreviewFragment.currentAccount).e());
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.y80(bundle, null));
                    return;
                }
                if (i14 != 12) {
                    if (i14 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i14 == 36) {
                        premiumPreviewFragment.presentFragment(new kg.n());
                        return;
                    } else {
                        if (i14 == 37) {
                            premiumPreviewFragment.presentFragment(new kg.v());
                            return;
                        }
                        return;
                    }
                }
                Long h = org.telegram.messenger.q10.h(premiumPreviewFragment.getUserConfig().f());
                bi.e4 e4Var = new bi.e4(22, premiumPreviewFragment, fs0Var2);
                if (premiumPreviewFragment.v0 == null) {
                    e11[] e11VarArr = new e11[1];
                    boolean z10 = ((float) (fs0Var2.getHeight() + fs0Var2.getTop())) > ((float) premiumPreviewFragment.a.getMeasuredHeight()) / 2.0f;
                    float L = org.telegram.messenger.g0.L(330.0f);
                    Point point = org.telegram.messenger.g0.q;
                    int min = (int) Math.min(L, point.y * 0.75f);
                    int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                    org.telegram.ui.Components.e5 e5Var2 = fs0Var2.h;
                    if (e5Var2 != null) {
                        Drawable[] drawableArr = e5Var2.f;
                        Drawable drawable = drawableArr[1];
                        if (drawable != null) {
                            if (drawable instanceof org.telegram.ui.Components.g5) {
                                ((org.telegram.ui.Components.g5) drawable).o(e5Var2);
                            }
                            drawableArr[1] = null;
                        }
                        org.telegram.ui.Components.e5 e5Var3 = fs0Var2.h;
                        if (e5Var3 != null) {
                            e5Var3.f();
                            fs0Var2.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(fs0Var2.h.getBounds());
                            int L2 = z10 ? (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min : (-(fs0Var2.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            i11 = rect.centerX() - (point.x - min2);
                            e5Var = e5Var3;
                            i10 = L2;
                        } else {
                            e5Var = e5Var3;
                            i10 = 0;
                            i11 = 0;
                        }
                        fs0Var = fs0Var2;
                    } else {
                        e5Var = null;
                        fs0Var = null;
                        i10 = 0;
                        i11 = 0;
                    }
                    int i15 = i10;
                    js0 js0Var = new js0(premiumPreviewFragment, premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), Integer.valueOf(i11), z10 ? 12 : 0, premiumPreviewFragment.getResourceProvider(), z10 ? 24 : 16, e4Var, e11VarArr);
                    js0Var.h1 = true;
                    js0Var.setSelected(h);
                    js0Var.setSaveState(3);
                    js0Var.y(e5Var, fs0Var);
                    ks0 ks0Var = new ks0(premiumPreviewFragment, js0Var);
                    premiumPreviewFragment.v0 = ks0Var;
                    e11VarArr[0] = ks0Var;
                    ks0Var.showAsDropDown(fs0Var2, 0, i15, 53);
                    e11VarArr[0].b();
                }
            }
        }
    }

    public static void p0(org.telegram.ui.ActionBar.e2 e2Var, ts0 ts0Var, String str, com.google.android.gms.internal.clearcut.y0 y0Var) {
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        boolean z10 = org.telegram.messenger.r2.a;
        int currentAccount = e2Var == null ? org.telegram.messenger.m10.t0 : e2Var.getCurrentAccount();
        if (org.telegram.messenger.np.s1(currentAccount).v2()) {
            b.b(currentAccount);
            return;
        }
        if (ts0Var == null && (tL_help_premiumPromo = org.telegram.messenger.si.b0(currentAccount).E) != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = tL_help_premiumPromo.period_options;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = arrayList.get(i7);
                i7++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = tL_premiumSubscriptionOption2;
                int i10 = tL_premiumSubscriptionOption3.months;
                if (i10 == 1) {
                    ts0Var = new ts0(tL_premiumSubscriptionOption3);
                } else if (i10 == 12) {
                    ts0Var = new ts0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        ts0 ts0Var2 = ts0Var;
        u0();
        if (!org.telegram.messenger.r2.b()) {
            f5.m mVar = org.telegram.messenger.r1.l;
            if (mVar == null || mVar.h.isEmpty()) {
                return;
            }
            if (ts0Var2.f == null) {
                ts0Var2.f = org.telegram.messenger.r1.l;
            }
            ts0Var2.a();
            if (ts0Var2.g == null) {
                return;
            }
            org.telegram.messenger.r1.i().p("subs", new bg.f0(e2Var, currentAccount, y0Var, ts0Var2, 8));
            return;
        }
        Activity parentActivity = e2Var != null ? e2Var.getParentActivity() : LaunchActivity.H1;
        if (parentActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) parentActivity;
            if (ts0Var2 != null && (tL_premiumSubscriptionOption = ts0Var2.a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                Uri parse = Uri.parse(str2);
                if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                    launchActivity.X0 = true;
                }
                vf.c.t(launchActivity, tL_premiumSubscriptionOption.bot_url);
                return;
            }
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(currentAccount);
            if (TextUtils.isEmpty(s12.t6)) {
                if (TextUtils.isEmpty(s12.u6)) {
                    return;
                }
                launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + s12.u6)), null);
                return;
            }
            launchActivity.X0 = true;
            launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + s12.t6 + "?start=" + str)), null);
        }
    }

    public static String q0(int i7) {
        switch (i7) {
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
            case org.telegram.messenger.ns.T /* 30 */:
                return "business_hours";
            case org.telegram.messenger.ns.U /* 31 */:
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

    public static void r0(int i7, ArrayList arrayList, boolean z10) {
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        SparseIntArray sparseIntArray = s12.P0;
        if (z10) {
            arrayList.add(new ss0(12, R.drawable.filled_premium_status2, org.telegram.messenger.hd.M0(2131747016, null), org.telegram.messenger.hd.M0(2131747015, null)));
            arrayList.add(new ss0(35, R.drawable.premium_tags, org.telegram.messenger.hd.M0(2131747002, null), org.telegram.messenger.hd.M0(2131747001, null)));
            arrayList.add(new ss0(14, R.drawable.filled_premium_camera, org.telegram.messenger.hd.M0(2131747014, null), org.telegram.messenger.hd.M0(2131747013, null)));
        } else {
            arrayList.add(new ss0(29, R.drawable.filled_location, org.telegram.messenger.hd.M0(2131747053, null), org.telegram.messenger.hd.M0(2131747052, null)));
            arrayList.add(new ss0(30, R.drawable.filled_premium_hours, org.telegram.messenger.hd.M0(2131747051, null), org.telegram.messenger.hd.M0(2131747050, null)));
            arrayList.add(new ss0(31, R.drawable.filled_open_message, org.telegram.messenger.hd.M0(2131747049, null), org.telegram.messenger.hd.M0(2131747048, null)));
            arrayList.add(new ss0(32, R.drawable.premium_status, org.telegram.messenger.hd.M0(2131747057, null), org.telegram.messenger.hd.M0(2131747056, null)));
            arrayList.add(new ss0(33, R.drawable.filled_premium_away, org.telegram.messenger.hd.M0(2131747064, null), org.telegram.messenger.hd.M0(2131747063, null)));
            arrayList.add(new ss0(34, R.drawable.filled_premium_bots, org.telegram.messenger.hd.M0(2131747059, null), org.telegram.messenger.hd.M0(2131747058, null)));
            arrayList.add(new ss0(37, R.drawable.filled_premium_chatlink, org.telegram.messenger.hd.M0(2131747062, null), org.telegram.messenger.hd.M0(2131747061, null)));
            arrayList.add(new ss0(36, R.drawable.filled_premium_intro, org.telegram.messenger.hd.M0(2131747055, null), org.telegram.messenger.hd.M0(2131747054, null)));
        }
        int i10 = 0;
        if (sparseIntArray.size() > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (sparseIntArray.get(((ss0) arrayList.get(i11)).a, -1) == -1) {
                    boolean z11 = org.telegram.messenger.r2.a;
                }
            }
        }
        Collections.sort(arrayList, new hs0(s12, i10));
    }

    public static void s0(int i7, ArrayList arrayList) {
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        int i10 = 1;
        arrayList.add(new ss0(0, R.drawable.msg_premium_limits, org.telegram.messenger.hd.M0(2131746998, null), org.telegram.messenger.hd.a0(null, null, 2131746997, Integer.valueOf(s12.F4), Integer.valueOf(s12.N4), Integer.valueOf(s12.R4), Integer.valueOf(s12.T4), 4)));
        arrayList.add(new ss0(14, R.drawable.msg_filled_stories, org.telegram.messenger.hd.M0(2131746974, null), org.telegram.messenger.hd.a0(null, null, 2131746973, new Object[0])));
        arrayList.add(new ss0(1, R.drawable.msg_premium_uploads, org.telegram.messenger.hd.M0(2131746964, null), org.telegram.messenger.hd.M0(2131746963, null)));
        arrayList.add(new ss0(2, R.drawable.msg_premium_speed, org.telegram.messenger.hd.M0(2131747012, null), org.telegram.messenger.hd.M0(2131747011, null)));
        arrayList.add(new ss0(8, R.drawable.msg_premium_voice, org.telegram.messenger.hd.M0(2131746962, null), org.telegram.messenger.hd.M0(2131746961, null)));
        arrayList.add(new ss0(3, R.drawable.msg_premium_ads, org.telegram.messenger.hd.M0(2131746992, null), org.telegram.messenger.hd.M0(2131746991, null)));
        arrayList.add(new ss0(4, R.drawable.msg_premium_reactions, org.telegram.messenger.hd.M0(2131746982, null), org.telegram.messenger.hd.M0(2131746981, null)));
        arrayList.add(new ss0(5, R.drawable.msg_premium_stickers, org.telegram.messenger.hd.M0(2131746976, null), org.telegram.messenger.hd.M0(2131746975, null)));
        arrayList.add(new ss0(11, R.drawable.msg_premium_emoji, org.telegram.messenger.hd.M0(2131747007, null), org.telegram.messenger.hd.M0(2131747006, null)));
        arrayList.add(new ss0(9, R.drawable.menu_premium_tools, org.telegram.messenger.hd.M0(2131747025, null), org.telegram.messenger.hd.M0(2131747024, null)));
        arrayList.add(new ss0(6, R.drawable.msg_premium_badge, org.telegram.messenger.hd.M0(2131746987, null), org.telegram.messenger.hd.M0(2131746986, null)));
        arrayList.add(new ss0(27, R.drawable.filled_messages_paid, org.telegram.messenger.hd.M0(2131746989, null), org.telegram.messenger.hd.M0(2131746988, null)));
        arrayList.add(new ss0(7, R.drawable.msg_premium_avatar, org.telegram.messenger.hd.M0(2131747022, null), org.telegram.messenger.hd.M0(2131747021, null)));
        arrayList.add(new ss0(24, R.drawable.premium_tags, org.telegram.messenger.hd.M0(2131746971, null), org.telegram.messenger.hd.M0(2131746969, null)));
        arrayList.add(new ss0(10, R.drawable.msg_premium_icons, org.telegram.messenger.hd.M0(2131747020, null), org.telegram.messenger.hd.M0(2131747019, null)));
        arrayList.add(new ss0(12, R.drawable.premium_status, org.telegram.messenger.hd.M0(2131747004, null), org.telegram.messenger.hd.M0(2131747003, null)));
        arrayList.add(new ss0(13, R.drawable.msg_premium_translate, org.telegram.messenger.hd.M0(2131746966, null), org.telegram.messenger.hd.M0(2131746965, null)));
        arrayList.add(new ss0(22, R.drawable.premium_wallpaper, org.telegram.messenger.hd.M0(2131746959, null), org.telegram.messenger.hd.M0(2131746958, null)));
        arrayList.add(new ss0(23, R.drawable.premium_colors, org.telegram.messenger.hd.M0(2131746985, null), org.telegram.messenger.hd.M0(2131746984, null)));
        arrayList.add(new ss0(26, R.drawable.menu_premium_seen, org.telegram.messenger.hd.M0(2131747000, null), org.telegram.messenger.hd.M0(2131746999, null)));
        arrayList.add(new ss0(28, R.drawable.filled_premium_business, org.telegram.messenger.hd.M0(2131744252, null), org.telegram.messenger.hd.M0(2131747017, null)));
        arrayList.add(new ss0(38, R.drawable.menu_premium_effects, org.telegram.messenger.hd.M0(2131747009, null), org.telegram.messenger.hd.M0(2131747008, null)));
        arrayList.add(new ss0(39, R.drawable.msg_premium_icons, org.telegram.messenger.hd.M0(2131746968, null), org.telegram.messenger.hd.M0(2131746967, null)));
        arrayList.add(new ss0(41, R.drawable.filled_sharing_off2_24, org.telegram.messenger.hd.M0(2131746978, null), org.telegram.messenger.hd.M0(2131746977, null)));
        arrayList.add(new ss0(42, R.drawable.premium_ai_editor, org.telegram.messenger.hd.M0(2131747027, null), org.telegram.messenger.hd.M0(2131747026, null)));
        arrayList.add(new ss0(43, R.drawable.premium_rich_editor, org.telegram.messenger.hd.M0(2131746980, null), org.telegram.messenger.hd.M0(2131746979, null)));
        SparseIntArray sparseIntArray = s12.O0;
        if (sparseIntArray.size() > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (sparseIntArray.get(((ss0) arrayList.get(i11)).a, -1) == -1) {
                    boolean z10 = org.telegram.messenger.r2.a;
                }
            }
        }
        Collections.sort(arrayList, new hs0(s12, i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String t0(int i7, ts0 ts0Var) {
        int i10;
        String str;
        int i11;
        String f10;
        int i12;
        boolean z10 = org.telegram.messenger.r2.a;
        if (ts0Var != null) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = ts0Var.a;
            if (!org.telegram.messenger.r2.b()) {
                ts0Var.a();
                if (ts0Var.g == null) {
                    return org.telegram.messenger.hd.M0(2131748779, null);
                }
            }
            boolean q10 = org.telegram.messenger.m10.i(i7).q();
            int i13 = tL_premiumSubscriptionOption.months;
            boolean z11 = i13 > 12 && i13 % 12 == 0;
            boolean z12 = i13 == 12;
            String f11 = z12 ? ts0Var.f() : ts0Var.e();
            if (q10) {
                i10 = z12 ? 2131743807 : 2131743808;
            } else {
                if (z12) {
                    if (org.telegram.messenger.np.s1(i7).P5) {
                        f11 = ts0Var.e();
                    } else {
                        f11 = ts0Var.d();
                        i10 = 2131744429;
                    }
                } else if (!z11) {
                    f11 = ts0Var.e();
                } else {
                    if (!org.telegram.messenger.np.s1(i7).P5) {
                        return org.telegram.messenger.hd.a0(null, null, 2131744430, ts0Var.d(), org.telegram.messenger.hd.G(tL_premiumSubscriptionOption.months / 12, "Years", new Object[0]));
                    }
                    f11 = ts0Var.e();
                }
                i10 = 2131744435;
            }
            return org.telegram.messenger.hd.a0(null, null, i10, f11);
        }
        long j3 = 12;
        if (org.telegram.messenger.r2.b()) {
            TLRPC.TL_help_premiumPromo tL_help_premiumPromo = org.telegram.messenger.si.b0(i7).E;
            if (tL_help_premiumPromo == null) {
                return org.telegram.messenger.hd.M0(2131744434, null);
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
                return org.telegram.messenger.hd.M0(2131744434, null);
            }
            if (tL_premiumSubscriptionOption2.months != 12) {
                f10 = org.telegram.messenger.r1.i().f(tL_premiumSubscriptionOption2.amount, tL_premiumSubscriptionOption2.currency);
            } else {
                if (!org.telegram.messenger.np.s1(i7).P5) {
                    f10 = org.telegram.messenger.r1.i().f(tL_premiumSubscriptionOption2.amount, tL_premiumSubscriptionOption2.currency);
                    i12 = 2131744429;
                    return org.telegram.messenger.hd.a0(null, null, i12, f10);
                }
                f10 = org.telegram.messenger.r1.i().f(tL_premiumSubscriptionOption2.amount / 12, tL_premiumSubscriptionOption2.currency);
            }
            i12 = 2131744435;
            return org.telegram.messenger.hd.a0(null, null, i12, f10);
        }
        f5.m mVar = org.telegram.messenger.r1.l;
        if (mVar != null) {
            ArrayList arrayList2 = mVar.h;
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = ((f5.l) arrayList2.get(0)).b.a;
                int size2 = arrayList3.size();
                int i16 = 0;
                str = null;
                while (true) {
                    if (i16 >= size2) {
                        break;
                    }
                    Object obj = arrayList3.get(i16);
                    i16++;
                    f5.j jVar = (f5.j) obj;
                    String str2 = jVar.d;
                    String str3 = jVar.c;
                    long j10 = j3;
                    long j11 = jVar.b;
                    if (str2.equals("P1M")) {
                        str = jVar.a;
                    } else if (jVar.d.equals("P1Y")) {
                        if (org.telegram.messenger.np.s1(i7).P5) {
                            org.telegram.messenger.r1.i().getClass();
                            str = org.telegram.messenger.r1.g(str3, 6, j11 / j10, false);
                        } else {
                            org.telegram.messenger.r1.i().getClass();
                            str = org.telegram.messenger.r1.g(str3, 6, j11, false);
                            i11 = 2131744429;
                        }
                    }
                    j3 = j10;
                }
                return str != null ? org.telegram.messenger.hd.M0(2131748779, null) : org.telegram.messenger.hd.a0(null, null, i11, str);
            }
        }
        str = null;
        i11 = 2131744435;
        if (str != null) {
        }
    }

    public static void u0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(org.telegram.messenger.m10.t0).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(org.telegram.messenger.m10.t0).sendRequest(tL_help_saveAppLog, new fi.m5(9));
    }

    public static void v0(int i7, int i10) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i7).getCurrentTime();
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
        ConnectionsManager.getInstance(i7).sendRequest(tL_help_saveAppLog, new fi.m5(9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void w0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.m10.t0);
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new fi.m5(9));
    }

    public final void A0(boolean z10) {
        di.xb xbVar;
        if (z10 != this.a0) {
            this.a0 = z10;
            rs0 rs0Var = this.V;
            if (rs0Var != null && (xbVar = rs0Var.d) != null) {
                xbVar.setDialogVisible(z10);
            }
            this.W.setPaused(z10);
            this.e0.invalidate();
        }
    }

    public final void B0() {
        ts0 ts0Var;
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
        int i7 = this.h0;
        if (i7 == 1 && getUserConfig().q()) {
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
        if (i7 == 1 && getUserConfig().q()) {
            int i14 = this.h;
            this.H = i14;
            this.showAdsRow = i14 + 1;
            this.h = i14 + 3;
            this.I = i14 + 2;
        }
        org.telegram.messenger.g0.Y3(this.K, (getUserConfig().q() && ((ts0Var = this.f) == null || ts0Var.a.months >= ((ts0) this.d.get(this.e)).a.months || this.q0)) ? false : true, 1.0f, true, false);
        int L = this.K.getVisibility() == 0 ? org.telegram.messenger.g0.L(64.0f) : 0;
        org.telegram.ui.Components.qy qyVar = this.Q;
        qyVar.M = (this.Y + L) - org.telegram.messenger.g0.L(16.0f);
        qyVar.p1();
        this.Q.S = L;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean canBeginSlide() {
        di.xb xbVar;
        rs0 rs0Var = this.V;
        return rs0Var == null || (xbVar = rs0Var.d) == null || !xbVar.a;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        int i7 = 2;
        this.A0 = new oa(this, i7);
        int i10 = 1;
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.R;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fk, false);
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ek, false);
        int i11 = org.telegram.ui.ActionBar.j6.Dk;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.j6.x0(null, i11, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ck, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Bk, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.S = linearGradient2;
        linearGradient2.setLocalMatrix(this.T);
        this.U.setShader(this.S);
        this.M = new fs0(context, null);
        this.N = new ug.l1(context);
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
            kg.v1.f(this.currentAccount).h();
            if (getUserConfig().q()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                org.telegram.messenger.si.b0(this.currentAccount).m0(tL_inputStickerSetShortName, false);
                kg.f.a(this.currentAccount).c(null);
                if (getMessagesController().W0.isEmpty()) {
                    getMessagesController().d3();
                }
                kg.y d = kg.y.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable g10 = i5.c.g(context, R.drawable.sheet_shadow_round);
        this.J = g10;
        g10.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.h5), PorterDuff.Mode.MULTIPLY));
        this.J.getPadding(rect);
        this.Y = org.telegram.messenger.g0.m;
        this.e0 = new is0(this, context);
        jh.k kVar = new jh.k(this.e0);
        is0 is0Var = this.e0;
        dh.c cVar = this.y0;
        cVar.h = kVar;
        cVar.i = is0Var;
        jh.k kVar2 = new jh.k(this.e0);
        is0 is0Var2 = this.e0;
        dh.c cVar2 = this.z0;
        cVar2.h = kVar2;
        cVar2.i = is0Var2;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.a = uj0Var;
        uj0Var.setClipToOutline(true);
        this.a.setOutlineProvider(new fh.a(this, 9));
        this.a.D0(new gs0(this, i10));
        this.a.setCaptureSectionsDecoratorAllowed(true);
        this.a.setLegacySections(true);
        this.a.setSections(true);
        this.a.setClipToPadding(false);
        org.telegram.ui.Components.uj0 uj0Var2 = this.a;
        org.telegram.ui.Components.qy qyVar = new org.telegram.ui.Components.qy((org.telegram.messenger.g0.L(68.0f) + this.Y) - org.telegram.messenger.g0.L(16.0f), this.a);
        this.Q = qyVar;
        uj0Var2.setLayoutManager(qyVar);
        this.Q.R = true;
        this.a.setAdapter(new ms0(this));
        this.a.j(new g3(this, 25));
        this.V = new rs0(this, context);
        ug.s1 s1Var = new ug.s1(context);
        this.W = s1Var;
        s1Var.c();
        if (i12 == 1) {
            if (this.i0) {
                ug.r1 r1Var = this.W.a;
                r1Var.q = true;
                r1Var.K = false;
                r1Var.H = true;
                r1Var.J = true;
                r1Var.k = org.telegram.messenger.g0.L(-14.0f);
                ug.r1 r1Var2 = this.W.a;
                r1Var2.x = 2000L;
                r1Var2.y = 3000;
                r1Var2.r = 16;
                r1Var2.G = false;
                r1Var2.O = 28;
                r1Var2.Q = i11;
            } else {
                ug.r1 r1Var3 = this.W.a;
                r1Var3.J = true;
                r1Var3.k = org.telegram.messenger.g0.L(28.0f);
                ug.r1 r1Var4 = this.W.a;
                r1Var4.x = 2000L;
                r1Var4.y = 3000;
                r1Var4.r = 16;
                r1Var4.G = false;
                r1Var4.O = 28;
            }
        }
        this.V.d.setStarParticlesView(this.W);
        this.e0.addView(this.W, c8.ja.c(-2.0f, -1));
        this.e0.addView(this.V, c8.ja.c(-2.0f, -1));
        this.a.setOnItemClickListener(new h(this, 24));
        this.e0.addView(this.a, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 0.0f, 0.0f, 0.0f, -48.0f));
        this.L = new FrameLayout(context);
        ug.q0 q0Var = new ug.q0(context, getResourceProvider(), false);
        this.f0 = q0Var;
        q0Var.L = true;
        q0Var.setClickable(false);
        q0Var.w.setClickable(false);
        q0Var.setStateListAnimator(null);
        y0(false);
        this.K = new FrameLayout(context);
        this.L.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.L.addView(this.f0, c8.ja.c(-1.0f, -1));
        FrameLayout frameLayout = this.L;
        fh.g c10 = cVar.c(frameLayout, null, false);
        c10.p(c8.g0.j(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        frameLayout.setBackground(c10);
        c8.na.b(this.L, 0.02f, 1.5f);
        this.K.addView(this.L, c8.ja.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar = new dh.d(cVar.c(this.K, null, false));
        dVar.b(org.telegram.messenger.g0.L(40.0f), false);
        this.w0 = new dh.d(cVar.c(this.e0, null, false));
        this.K.setBackground(dVar);
        if (getUserConfig().p()) {
            this.e0.addView(this.K, c8.ja.e(-1, -2, 80));
        }
        this.fragmentView = this.e0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var == null || !((ActionBarLayout) o4Var).U0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new lx(this, 29));
        this.actionBar.setForceSkipTouches(true);
        this.e0.addView(this.actionBar, c8.ja.e(-1, -2, 48));
        z0();
        B0();
        this.V.d.m(200L);
        if (this.q0) {
            org.telegram.messenger.g0.i3(new gs0(this, i7), 400L);
        }
        org.telegram.messenger.si.b0(this.currentAccount).o1();
        w0(this.j0);
        View view = this.fragmentView;
        ni0 ni0Var = new ni0(this, 7);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view, ni0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.j5;
        int i12 = org.telegram.messenger.ns.g5;
        if (i7 == i11 || i7 == i12) {
            y0(false);
            this.V.a();
        }
        if (i7 == org.telegram.messenger.ns.f5 || i7 == i12) {
            this.V.b();
            this.V.a();
            B0();
            this.a.getAdapter().f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.ActionBar.m3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.m3.c;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        return c8.oa.a(new g6(16, this), org.telegram.ui.ActionBar.j6.Ck, org.telegram.ui.ActionBar.j6.Dk, org.telegram.ui.ActionBar.j6.Ek, org.telegram.ui.ActionBar.j6.Fk, org.telegram.ui.ActionBar.j6.Gk, org.telegram.ui.ActionBar.j6.Hk, org.telegram.ui.ActionBar.j6.Ik, org.telegram.ui.ActionBar.j6.Jk, org.telegram.ui.ActionBar.j6.Kk, org.telegram.ui.ActionBar.j6.Mk, org.telegram.ui.ActionBar.j6.Nk, org.telegram.ui.ActionBar.j6.Lk, org.telegram.ui.ActionBar.j6.Qk);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        return this.i0;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void o0() {
        dh.g gVar;
        if (Build.VERSION.SDK_INT < 31 || (gVar = this.x0) == null) {
            return;
        }
        this.C0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.p0.d) - org.telegram.messenger.g0.L(132.0f), this.fragmentView.getMeasuredWidth(), org.telegram.messenger.g0.L(48.0f) + this.fragmentView.getMeasuredHeight());
        gVar.g(1, this.B0);
        gVar.e(this.A0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        A0(false);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        if (getMessagesController().D3()) {
            return false;
        }
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.j5);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f5);
        getNotificationCenter().c(this, org.telegram.messenger.ns.g5);
        if (getMediaDataController().E != null) {
            ArrayList<TLRPC.Document> arrayList = getMediaDataController().E.videos;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                TLRPC.Document document = arrayList.get(i7);
                i7++;
                org.telegram.messenger.w7.G(this.currentAccount).W(document, getMediaDataController().E, 3, 0);
            }
        }
        if (this.h0 == 1) {
            kg.z1.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.j5);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f5);
        getNotificationCenter().n(this, org.telegram.messenger.ns.g5);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onPause() {
        di.xb xbVar;
        super.onPause();
        rs0 rs0Var = this.V;
        if (rs0Var != null && (xbVar = rs0Var.d) != null) {
            xbVar.setDialogVisible(true);
        }
        ug.s1 s1Var = this.W;
        if (s1Var != null) {
            s1Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        di.xb xbVar;
        super.onResume();
        rs0 rs0Var = this.V;
        if (rs0Var != null && (xbVar = rs0Var.d) != null) {
            xbVar.setPaused(false);
            this.V.d.setDialogVisible(false);
        }
        this.W.setPaused(false);
        setBulletinDelegate(new y8(this, 7));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.h5);
        Drawable drawable = this.J;
        if (drawable != null && (drawable != this.D0 || themedColor != this.E0)) {
            this.D0 = drawable;
            this.E0 = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        try {
            ug.s1 s1Var = this.W;
            if (s1Var == null || s1Var.a == null || this.e0 == null) {
                return;
            }
            z0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        A0(showDialog != null);
        return showDialog;
    }

    public final void x0() {
        rs0 rs0Var;
        if (this.e0.getMeasuredWidth() == 0 || this.e0.getMeasuredHeight() == 0 || (rs0Var = this.V) == null || rs0Var.d == null) {
            return;
        }
        if (!this.i0) {
            int measuredWidth = this.e0.getMeasuredWidth();
            int measuredHeight = this.e0.getMeasuredHeight();
            ug.z0 z0Var = this.n0;
            z0Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.m0;
            canvas.save();
            canvas.scale(100.0f / this.e0.getMeasuredWidth(), 100.0f / this.e0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.e0.getMeasuredWidth(), this.e0.getMeasuredHeight(), z0Var.f);
            canvas.restore();
            this.V.d.setBackgroundBitmap(this.l0);
            return;
        }
        int f10 = i0.a.f(0.5f, getThemedColor(org.telegram.ui.ActionBar.j6.Dk), getThemedColor(org.telegram.ui.ActionBar.j6.h5));
        di.xb xbVar = this.s0;
        di.xb xbVar2 = this.V.d;
        if (xbVar == xbVar2 && this.t0 == f10) {
            return;
        }
        this.s0 = xbVar2;
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
        if (!q10 || this.f == null || this.e >= arrayList.size() || ((ts0) arrayList.get(this.e)).a.months >= this.f.a.months) {
            if (org.telegram.messenger.hd.a0) {
                z10 = false;
            }
            if (!org.telegram.messenger.r2.b() && (!org.telegram.messenger.r1.i().k() || arrayList.isEmpty() || this.e >= arrayList.size() || ((ts0) arrayList.get(this.e)).f == null)) {
                this.f0.b(org.telegram.messenger.hd.M0(2131748779, null), null, z10);
                this.L.setOnClickListener(new bi.o(22));
                this.f0.setFlickerDisabled(true);
            } else {
                if (arrayList.isEmpty() || this.e >= arrayList.size()) {
                    return;
                }
                this.f0.b(t0(this.currentAccount, (ts0) arrayList.get(this.e)), null, z10);
                this.L.setOnClickListener(new g40(this, 25));
                this.f0.setFlickerDisabled(false);
            }
        }
    }

    public final void z0() {
        vg.f fVar;
        if (this.V == null || this.actionBar == null) {
            return;
        }
        boolean z10 = this.i0;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, z10 ? org.telegram.ui.ActionBar.j6.G6 : org.telegram.ui.ActionBar.j6.Kk, false);
        if (x02 != this.u0) {
            this.u0 = x02;
            this.actionBar.H(x02, true);
            this.actionBar.H(x02, false);
        }
        int i7 = org.telegram.ui.ActionBar.j6.Kk;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i7, false), 60);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar.q0 != o4) {
            kVar.F(o4, false);
        }
        this.W.a.g();
        rs0 rs0Var = this.V;
        if (rs0Var != null) {
            rs0Var.a.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, z10 ? org.telegram.ui.ActionBar.j6.G6 : i7, false));
            TextView textView = this.V.b;
            if (z10) {
                i7 = org.telegram.ui.ActionBar.j6.G6;
            }
            textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
            di.xb xbVar = this.V.d;
            if (xbVar != null && (fVar = xbVar.b) != null) {
                if (z10) {
                    fVar.z = org.telegram.ui.ActionBar.j6.Ok;
                    fVar.A = org.telegram.ui.ActionBar.j6.Pk;
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
