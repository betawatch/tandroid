package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SegmentTree;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class oa1 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final sg.d A0;
    public aa1 B;
    public final sg.d B0;
    public aa1 C;
    public final ng.a C0;
    public ka1 D;
    public l91 D0;
    public aa1 E;
    public final ArrayList E0;
    public aa1 F;
    public final RectF F0;
    public aa1 G;
    public final RectF G0;
    public aa1 H;
    public aa1 I;
    public aa1 J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public org.telegram.ui.Components.yn O;
    public p91 P;
    public ng.k Q;
    public f2.i0 R;
    public final LruCache S;
    public org.telegram.ui.Components.jj0 T;
    public t91 U;
    public m91 V;
    public na1 W;
    public vf.f X;
    public LinearLayout Y;
    public final boolean Z;
    public TLRPC.ChatFull a;
    public final boolean a0;
    public final long b;
    public final boolean b0;
    public boolean c;
    public long c0;
    public aa1 d;
    public long d0;
    public aa1 e;
    public final org.telegram.ui.ActionBar.d2[] e0;
    public ja1 f;
    public gk f0;
    public cc g0;
    public aa1 h;
    public me h0;
    public final boolean i0;
    public zg0 j0;
    public bh.b[] k0;
    public int l0;
    public final SparseIntArray m0;
    public aa1 n;
    public final SparseIntArray n0;
    public final ArrayList o0;
    public final ArrayList p0;
    public final ArrayList q0;
    public aa1 r;
    public final ArrayList r0;
    public aa1 s;
    public final ArrayList s0;
    public boolean t0;
    public boolean u0;
    public aa1 v;
    public ba1 v0;
    public aa1 w;
    public nh.l6 w0;
    public aa1 x;
    public int x0;
    public aa1 y;
    public final b6 y0;
    public final ng.e z0;

    public oa1(Bundle bundle) {
        super(bundle);
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.S = new LruCache(50);
        this.e0 = new org.telegram.ui.ActionBar.d2[1];
        this.l0 = -1;
        this.m0 = new SparseIntArray();
        this.n0 = new SparseIntArray();
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        this.q0 = new ArrayList();
        this.r0 = new ArrayList();
        this.s0 = new ArrayList();
        this.u0 = true;
        this.y0 = new b6(this, 13);
        ArrayList arrayList = new ArrayList();
        this.E0 = arrayList;
        RectF rectF = new RectF();
        this.F0 = rectF;
        RectF rectF2 = new RectF();
        this.G0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = bundle.getLong("chat_id");
        this.b = j10;
        this.Z = bundle.getBoolean("is_megagroup", false);
        this.a0 = bundle.getBoolean("start_from_boosts", false);
        this.b0 = bundle.getBoolean("start_from_monetization", false);
        this.i0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().getChatFull(j10);
        sg.c cVar = new sg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.z0 = null;
            this.A0 = null;
            this.B0 = null;
            this.C0 = new ng.a(cVar);
            return;
        }
        this.z0 = new ng.e(false);
        this.A0 = new sg.d(null);
        sg.d dVar = new sg.d(null);
        this.B0 = dVar;
        ng.a aVar = new ng.a(dVar);
        this.C0 = aVar;
        aVar.f = LiteMode.isEnabled(262144);
    }

    public static /* synthetic */ void U(oa1 oa1Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(oa1Var.currentAccount, arrayList2.get(i10), false, true));
            }
            oa1Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new i91(oa1Var, arrayList, 0));
    }

    public static void V(final oa1 oa1Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        ArrayList arrayList3;
        int i10;
        int i11;
        ArrayList arrayList4;
        String str4;
        ArrayList arrayList5 = oa1Var.K;
        ArrayList arrayList6 = oa1Var.L;
        ArrayList arrayList7 = oa1Var.o0;
        String str5 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final aa1[] aa1VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            aa1 aa1Var = aa1VarArr[2];
            if (aa1Var != null) {
                aa1Var.n = true;
            }
            ja1 ja1Var = new ja1();
            rf.f a2 = ja1.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            ja1Var.o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            ja1Var.p = (String) a2.b;
            ja1Var.q = (String) a2.c;
            ja1Var.r = ((Boolean) a2.d).booleanValue();
            ja1Var.s = ((Boolean) a2.e).booleanValue();
            rf.f a10 = ja1.a(tL_broadcastStats.reactions_per_story);
            ja1Var.t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            ja1Var.u = (String) a10.b;
            ja1Var.v = (String) a10.c;
            ja1Var.w = ((Boolean) a10.d).booleanValue();
            ja1Var.x = ((Boolean) a10.e).booleanValue();
            rf.f a11 = ja1.a(tL_broadcastStats.views_per_story);
            ja1Var.y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            ja1Var.z = (String) a11.b;
            ja1Var.A = (String) a11.c;
            ja1Var.B = ((Boolean) a11.d).booleanValue();
            ja1Var.C = ((Boolean) a11.e).booleanValue();
            rf.f a12 = ja1.a(tL_broadcastStats.shares_per_story);
            ja1Var.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            ja1Var.E = (String) a12.b;
            ja1Var.F = (String) a12.c;
            ja1Var.G = ((Boolean) a12.d).booleanValue();
            ja1Var.H = ((Boolean) a12.e).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i12 = (int) (d - d10);
            float abs = d10 == 0.0d ? 0.0f : Math.abs((i12 / ((float) d10)) * 100.0f);
            ja1Var.a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            ja1Var.b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i12 == 0 || abs == 0.0f) {
                i10 = i12;
                ja1Var.c = "";
            } else {
                int i13 = (int) abs;
                if (abs == i13) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i12 > 0 ? str3 : "");
                    sb.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    ja1Var.c = sb.toString() + " (" + i13 + "%)";
                    i10 = i12;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12 > 0 ? str3 : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    i10 = i12;
                    ja1Var.c = String.format(locale2, "%s (%.1f%s)", sb2.toString(), Float.valueOf(abs), "%");
                }
            }
            ja1Var.d = i10 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i14 = (int) (d11 - d12);
            float abs2 = d12 == 0.0d ? 0.0f : Math.abs((i14 / ((float) d12)) * 100.0f);
            ja1Var.i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            ja1Var.j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i14 == 0 || abs2 == 0.0f) {
                ja1Var.k = "";
            } else {
                int i15 = (int) abs2;
                if (abs2 == i15) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i14 > 0 ? str3 : "");
                    sb3.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    ja1Var.k = sb3.toString() + " (" + i15 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i14 > 0 ? str3 : "");
                    sb4.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    ja1Var.k = String.format(locale4, "%s (%.1f%s)", sb4.toString(), Float.valueOf(abs2), "%");
                }
            }
            ja1Var.l = i14 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i16 = (int) (d13 - d14);
            float abs3 = d14 == 0.0d ? 0.0f : Math.abs((i16 / ((float) d14)) * 100.0f);
            ja1Var.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            ja1Var.f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i16 == 0 || abs3 == 0.0f) {
                ja1Var.g = "";
            } else {
                int i17 = (int) abs3;
                if (abs3 == i17) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i16 > 0 ? str3 : "");
                    sb5.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    ja1Var.g = sb5.toString() + " (" + i17 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i16 > 0 ? str3 : "");
                    sb6.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    ja1Var.g = String.format(locale6, "%s (%.1f%s)", sb6.toString(), Float.valueOf(abs3), "%");
                }
            }
            ja1Var.h = i16 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            ja1Var.m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i18 = (int) f10;
            if (f10 == i18) {
                Locale locale7 = Locale.ENGLISH;
                ja1Var.n = android.support.v4.media.a.l(i18, "%");
            } else {
                ja1Var.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            oa1Var.f = ja1Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            oa1Var.c0 = tL_statsDateRangeDays.max_date * 1000;
            oa1Var.d0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i21);
                int i22 = i21 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                la1 la1Var = new la1();
                la1Var.a = postInteractionCounters2;
                int i23 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(la1Var);
                    str4 = str5;
                    i11 = i22;
                    oa1Var.m0.put(la1Var.b(), i19);
                    i19++;
                } else {
                    i11 = i22;
                    arrayList4 = arrayList8;
                    str4 = str5;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(la1Var.b()));
                    oa1Var.q0.add(la1Var);
                    oa1Var.n0.put(la1Var.b(), i20);
                    i20++;
                }
                arrayList10 = arrayList11;
                str5 = str4;
                i21 = i11;
                arrayList8 = arrayList4;
                size = i23;
            }
            ArrayList arrayList12 = arrayList8;
            str = str5;
            AndroidUtilities.runOnUIThread(new i91(oa1Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                oa1Var.getMessagesStorage().getMessages(-oa1Var.b, 0L, false, arrayList12.size(), ((la1) arrayList12.get(0)).b(), 0, 0, oa1Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            final int i24 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(oa1Var) { // from class: org.telegram.ui.h91
                public final /* synthetic */ oa1 b;

                {
                    this.b = oa1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i24) {
                        case 0:
                            oa1 oa1Var2 = this.b;
                            oa1Var2.getClass();
                            aa1[] aa1VarArr2 = aa1VarArr;
                            oa1Var2.d = aa1VarArr2[0];
                            oa1Var2.E = aa1VarArr2[1];
                            oa1Var2.F = aa1VarArr2[2];
                            oa1Var2.G = aa1VarArr2[3];
                            oa1Var2.H = aa1VarArr2[4];
                            oa1Var2.I = aa1VarArr2[5];
                            oa1Var2.e = aa1VarArr2[6];
                            oa1Var2.J = aa1VarArr2[7];
                            oa1Var2.g0(aa1VarArr2);
                            break;
                        default:
                            oa1 oa1Var3 = this.b;
                            oa1Var3.getClass();
                            aa1[] aa1VarArr3 = aa1VarArr;
                            oa1Var3.r = aa1VarArr3[0];
                            oa1Var3.h = aa1VarArr3[1];
                            oa1Var3.e = aa1VarArr3[2];
                            oa1Var3.n = aa1VarArr3[3];
                            oa1Var3.d = aa1VarArr3[4];
                            oa1Var3.s = aa1VarArr3[5];
                            oa1Var3.v = aa1VarArr3[6];
                            oa1Var3.w = aa1VarArr3[7];
                            oa1Var3.x = aa1VarArr3[8];
                            oa1Var3.y = aa1VarArr3[9];
                            oa1Var3.B = aa1VarArr3[10];
                            oa1Var3.C = aa1VarArr3[11];
                            oa1Var3.g0(aa1VarArr3);
                            break;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "%";
            str2 = "TopHoursChartTitle";
            str3 = "+";
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            final aa1[] aa1VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            aa1 aa1Var2 = aa1VarArr2[6];
            if (aa1Var2 != null) {
                aa1Var2.n = true;
            }
            aa1 aa1Var3 = aa1VarArr2[7];
            if (aa1Var3 != null) {
                aa1Var3.o = true;
            }
            ka1 ka1Var = new ka1();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i25 = (int) (d15 - d16);
            float abs4 = d16 == 0.0d ? 0.0f : Math.abs((i25 / ((float) d16)) * 100.0f);
            ka1Var.a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            ka1Var.b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i25 == 0 || abs4 == 0.0f) {
                ka1Var.c = "";
            } else {
                int i26 = (int) abs4;
                if (abs4 == i26) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(i25 > 0 ? str3 : "");
                    sb7.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    ka1Var.c = sb7.toString() + " (" + i26 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(i25 > 0 ? str3 : "");
                    sb8.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    ka1Var.c = String.format(locale9, "%s (%.1f%s)", sb8.toString(), Float.valueOf(abs4), str);
                }
            }
            ka1Var.d = i25 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i27 = (int) (d17 - d18);
            float abs5 = d18 == 0.0d ? 0.0f : Math.abs((i27 / ((float) d18)) * 100.0f);
            ka1Var.i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            ka1Var.j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i27 == 0 || abs5 == 0.0f) {
                ka1Var.k = "";
            } else {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb9 = new StringBuilder();
                sb9.append(i27 > 0 ? str3 : "");
                sb9.append(AndroidUtilities.formatWholeNumber(i27, 0));
                ka1Var.k = sb9.toString();
            }
            ka1Var.l = i27 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i28 = (int) (d19 - d20);
            float abs6 = d20 == 0.0d ? 0.0f : Math.abs((i28 / ((float) d20)) * 100.0f);
            ka1Var.m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            ka1Var.n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i28 == 0 || abs6 == 0.0f) {
                ka1Var.o = "";
            } else {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(i28 > 0 ? str3 : "");
                sb10.append(AndroidUtilities.formatWholeNumber(i28, 0));
                ka1Var.o = sb10.toString();
            }
            ka1Var.p = i28 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i29 = (int) (d21 - d22);
            float abs7 = d22 == 0.0d ? 0.0f : Math.abs((i29 / ((float) d22)) * 100.0f);
            ka1Var.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            ka1Var.f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i29 == 0 || abs7 == 0.0f) {
                ka1Var.g = "";
            } else {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(i29 > 0 ? str3 : "");
                sb11.append(AndroidUtilities.formatWholeNumber(i29, 0));
                ka1Var.g = sb11.toString();
            }
            ka1Var.h = i29 >= 0;
            oa1Var.D = ka1Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            oa1Var.c0 = tL_statsDateRangeDays2.max_date * 1000;
            oa1Var.d0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i30 = 0;
                while (i30 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i30);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ha1 ha1Var = new ha1();
                    ha1Var.a = ha1.a(tL_statsGroupTopPoster.user_id, arrayList14);
                    StringBuilder sb12 = new StringBuilder();
                    int i31 = tL_statsGroupTopPoster.messages;
                    if (i31 > 0) {
                        sb12.append(LocaleController.formatPluralString("messages", i31, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb12.length() > 0) {
                            sb12.append(", ");
                        }
                        sb12.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    ha1Var.b = sb12.toString();
                    if (arrayList2.size() < 10) {
                        arrayList3 = arrayList2;
                        arrayList3.add(ha1Var);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(ha1Var);
                    i30++;
                    arrayList2 = arrayList3;
                    arrayList = arrayList15;
                }
                ArrayList arrayList16 = arrayList;
                ArrayList arrayList17 = arrayList2;
                if (arrayList16.size() - arrayList17.size() < 2) {
                    arrayList17.clear();
                    arrayList17.addAll(arrayList16);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList18 = tL_megagroupStats.top_admins;
            if (arrayList18 != null && !arrayList18.isEmpty()) {
                for (int i32 = 0; i32 < tL_megagroupStats.top_admins.size(); i32++) {
                    ArrayList arrayList19 = oa1Var.N;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i32);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ha1 ha1Var2 = new ha1();
                    ha1Var2.a = ha1.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb13 = new StringBuilder();
                    int i33 = tL_statsGroupTopAdmin.deleted;
                    if (i33 > 0) {
                        sb13.append(LocaleController.formatPluralString("Deletions", i33, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
                    }
                    ha1Var2.b = sb13.toString();
                    arrayList19.add(ha1Var2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i34 = 0; i34 < tL_megagroupStats.top_inviters.size(); i34++) {
                    ArrayList arrayList22 = oa1Var.M;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i34);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ha1 ha1Var3 = new ha1();
                    ha1Var3.a = ha1.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i35 = tL_statsGroupTopInviter.invitations;
                    if (i35 > 0) {
                        ha1Var3.b = LocaleController.formatPluralString("Invitations", i35, new Object[0]);
                    } else {
                        ha1Var3.b = "";
                    }
                    arrayList22.add(ha1Var3);
                }
            }
            final int i36 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(oa1Var) { // from class: org.telegram.ui.h91
                public final /* synthetic */ oa1 b;

                {
                    this.b = oa1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i36) {
                        case 0:
                            oa1 oa1Var2 = this.b;
                            oa1Var2.getClass();
                            aa1[] aa1VarArr22 = aa1VarArr2;
                            oa1Var2.d = aa1VarArr22[0];
                            oa1Var2.E = aa1VarArr22[1];
                            oa1Var2.F = aa1VarArr22[2];
                            oa1Var2.G = aa1VarArr22[3];
                            oa1Var2.H = aa1VarArr22[4];
                            oa1Var2.I = aa1VarArr22[5];
                            oa1Var2.e = aa1VarArr22[6];
                            oa1Var2.J = aa1VarArr22[7];
                            oa1Var2.g0(aa1VarArr22);
                            break;
                        default:
                            oa1 oa1Var3 = this.b;
                            oa1Var3.getClass();
                            aa1[] aa1VarArr3 = aa1VarArr2;
                            oa1Var3.r = aa1VarArr3[0];
                            oa1Var3.h = aa1VarArr3[1];
                            oa1Var3.e = aa1VarArr3[2];
                            oa1Var3.n = aa1VarArr3[3];
                            oa1Var3.d = aa1VarArr3[4];
                            oa1Var3.s = aa1VarArr3[5];
                            oa1Var3.v = aa1VarArr3[6];
                            oa1Var3.w = aa1VarArr3[7];
                            oa1Var3.x = aa1VarArr3[8];
                            oa1Var3.y = aa1VarArr3[9];
                            oa1Var3.B = aa1VarArr3[10];
                            oa1Var3.C = aa1VarArr3[11];
                            oa1Var3.g0(aa1VarArr3);
                            break;
                    }
                }
            });
        }
    }

    public static void W(oa1 oa1Var) {
        RectF rectF = oa1Var.G0;
        ng.e eVar = oa1Var.z0;
        if (Build.VERSION.SDK_INT < 31 || eVar == null || oa1Var.fragmentView == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (oa1Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        oa1Var.F0.set(0.0f, -dp, oa1Var.fragmentView.getMeasuredWidth(), oa1Var.actionBar.getMeasuredHeight() + dp);
        rectF.set(0.0f, dp2, oa1Var.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(2, oa1Var.E0);
        eVar.e(oa1Var.D0, oa1Var.fragmentView.getMeasuredWidth(), oa1Var.fragmentView.getMeasuredHeight());
    }

    public static void Y(oa1 oa1Var) {
        View currentView = oa1Var.f0.getCurrentView();
        cc ccVar = oa1Var.g0;
        if (currentView == ccVar) {
            oa1Var.actionBar.setAdaptiveBackground(ccVar.C);
            return;
        }
        me meVar = oa1Var.h0;
        if (currentView == meVar) {
            oa1Var.actionBar.setAdaptiveBackground(meVar.X0);
        } else {
            oa1Var.actionBar.setAdaptiveBackground(oa1Var.P);
        }
    }

    public static void Z(oa1 oa1Var) {
        na1 na1Var = oa1Var.W;
        if (na1Var != null) {
            na1Var.b = true;
        }
        int childCount = oa1Var.P.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = oa1Var.P.getChildAt(i10);
            if (childAt instanceof z91) {
                ((z91) childAt).b.q0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.p2 d0(TLRPC.Chat chat, boolean z4) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z4);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        return (chatFull == null || !(chatFull.can_view_stats || chatFull.can_view_stars_revenue)) ? new a6(-chat.id) : new oa1(bundle);
    }

    public static wf.b e0(JSONObject jSONObject, int i10, boolean z4) {
        if (i10 == 0) {
            return new wf.b(jSONObject);
        }
        if (i10 == 1) {
            return new wf.c(jSONObject);
        }
        if (i10 == 2) {
            wf.d dVar = new wf.d(jSONObject);
            int length = ((wf.a) dVar.d.get(0)).a.length;
            int size = dVar.d.size();
            dVar.l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                dVar.l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = dVar.l;
                    jArr[i11] = jArr[i11] + ((wf.a) dVar.d.get(i12)).a[i11];
                }
            }
            dVar.m = new SegmentTree(dVar.l);
            return dVar;
        }
        if (i10 != 4) {
            return null;
        }
        wf.e eVar = new wf.e(jSONObject);
        if (z4) {
            long[] jArr2 = new long[eVar.d.size()];
            int[] iArr = new int[eVar.d.size()];
            long j10 = 0;
            for (int i13 = 0; i13 < eVar.d.size(); i13++) {
                int length2 = eVar.a.length;
                for (int i14 = 0; i14 < length2; i14++) {
                    long j11 = ((wf.a) eVar.d.get(i13)).a[i14];
                    jArr2[i13] = jArr2[i13] + j11;
                    if (j11 == 0) {
                        iArr[i13] = iArr[i13] + 1;
                    }
                }
                j10 += jArr2[i13];
            }
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < eVar.d.size(); i15++) {
                if (jArr2[i15] / j10 < 0.01d && iArr[i15] > eVar.a.length / 2.0f) {
                    arrayList.add((wf.a) eVar.d.get(i15));
                }
            }
            int size2 = arrayList.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj = arrayList.get(i16);
                i16++;
                eVar.d.remove((wf.a) obj);
            }
        }
        int length3 = ((wf.a) eVar.d.get(0)).a.length;
        int size3 = eVar.d.size();
        eVar.l = new long[length3];
        for (int i17 = 0; i17 < length3; i17++) {
            eVar.l[i17] = 0;
            for (int i18 = 0; i18 < size3; i18++) {
                long[] jArr3 = eVar.l;
                jArr3[i17] = jArr3[i17] + ((wf.a) eVar.d.get(i18)).a[i17];
            }
        }
        new SegmentTree(eVar.l);
        return eVar;
    }

    public static aa1 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z4) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        aa1 aa1Var = new aa1(str, i10);
        aa1Var.m = z4;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                wf.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z4);
                aa1Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                aa1Var.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.a) == null || jArr2.length < 2) {
                    aa1Var.l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    aa1Var.e = new wf.e(e02, j10);
                    aa1Var.c = j10;
                    return aa1Var;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            aa1Var.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return aa1Var;
    }

    public static void k0(aa1 aa1Var, ArrayList arrayList, org.telegram.ui.ActionBar.k6 k6Var) {
        wf.b bVar;
        if (aa1Var == null || (bVar = aa1Var.d) == null) {
            return;
        }
        ArrayList arrayList2 = bVar.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            wf.a aVar = (wf.a) obj;
            int i11 = aVar.g;
            if (i11 >= 0) {
                if (!org.telegram.ui.ActionBar.j6.c1(i11)) {
                    org.telegram.ui.ActionBar.j6.u1(aVar.g, org.telegram.ui.ActionBar.j6.I == org.telegram.ui.ActionBar.j6.J ? aVar.i : aVar.h, false);
                    org.telegram.ui.ActionBar.j6.nl[aVar.g] = aVar.h;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, aVar.g));
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof z91) {
            ((z91) view).d();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.y6) {
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false)), org.telegram.ui.ActionBar.j6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7), 0, 0);
            mqVar.w = true;
            view.setBackground(mqVar);
            return;
        }
        if (view instanceof xf.c) {
            ((xf.c) view).a();
        } else if (view instanceof ia1) {
            int i10 = ia1.d;
            ((ia1) view).b();
        }
    }

    public final void c0() {
        int i10 = AndroidUtilities.navigationBarHeight;
        int i11 = AndroidUtilities.statusBarHeight;
        zg0 zg0Var = this.j0;
        if (zg0Var != null) {
            zg0Var.setTranslationY(-i10);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11;
        int dp = (this.c ? AndroidUtilities.dp(72.0f) : 0) + i10;
        p91 p91Var = this.P;
        if (p91Var != null) {
            p91Var.setPadding(0, currentActionBarHeight, 0, dp);
        }
        cc ccVar = this.g0;
        if (ccVar != null) {
            ccVar.C.setPadding(0, currentActionBarHeight, 0, dp);
        }
        me meVar = this.h0;
        if (meVar != null) {
            meVar.X0.setPadding(0, currentActionBarHeight, 0, dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        oa1 oa1Var = this;
        oa1Var.X = new vf.f(null);
        MessagesController messagesController = MessagesController.getInstance(oa1Var.currentAccount);
        long j10 = oa1Var.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(oa1Var.currentAccount).getChatFull(j10);
        boolean z4 = chatFull != null && chatFull.can_view_stats;
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        boolean z10 = chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z4) {
            arrayList.add(bh.b.b(context, oa1Var.resourceProvider, bh.a.F, R.string.Statistics));
        }
        arrayList.add(bh.b.b(context, oa1Var.resourceProvider, bh.a.K, R.string.Boosts));
        if (z10) {
            arrayList.add(bh.b.b(context, oa1Var.resourceProvider, bh.a.L, R.string.Monetization));
        }
        oa1Var.k0 = (bh.b[]) arrayList.toArray(new bh.b[0]);
        zg0 zg0Var = new zg0(context, oa1Var.resourceProvider);
        oa1Var.j0 = zg0Var;
        zg0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i10 = 0;
        while (true) {
            bh.b[] bVarArr = oa1Var.k0;
            if (i10 >= bVarArr.length) {
                break;
            }
            bh.b bVar = bVarArr[i10];
            bVar.setOnClickListener(new lh.y0(oa1Var, i10, 22));
            oa1Var.j0.addView(oa1Var.k0[i10]);
            oa1Var.j0.i(bVar, true, false);
            i10++;
        }
        oa1Var.f0 = new gk(oa1Var, oa1Var.getParentActivity(), 4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            oa1Var.g0 = new cc(oa1Var, -j10, oa1Var.getResourceProvider());
        }
        if (z10) {
            frameLayout = frameLayout2;
            me meVar = new me(oa1Var.getParentActivity(), this, oa1Var.currentAccount, -j10, getResourceProvider(), ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue, chatFull.can_view_stars_revenue);
            oa1Var = this;
            oa1Var.h0 = meVar;
            meVar.setActionBar(oa1Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z11 = z4;
        FrameLayout frameLayout3 = frameLayout;
        oa1Var.f0.setAdapter(new o91(oa1Var, z11, isBoostSupported, z10, frameLayout3));
        boolean z12 = oa1Var.i0;
        boolean z13 = isBoostSupported && !z12;
        oa1Var.c = z13;
        if (z13 && oa1Var.a0) {
            oa1Var.f0.setPosition(z11 ? 1 : 0);
        } else if (z13 && oa1Var.b0) {
            oa1Var.f0.setPosition((z11 ? 1 : 0) + ((z12 || !isBoostSupported) ? 0 : 1));
        }
        oa1Var.m0(oa1Var.f0.getCurrentPosition(), false);
        kh.i4 i4Var = new kh.i4(oa1Var, oa1Var.getParentActivity(), 9);
        oa1Var.actionBar.setDrawBlurBackground(i4Var);
        i4Var.setBackgroundColor(oa1Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        ug.i iVar = new ug.i(i4Var);
        ng.a aVar = oa1Var.C0;
        aVar.d = iVar;
        aVar.e = i4Var;
        i4Var.addView(oa1Var.f0, k7.b6.g());
        i4Var.addView(oa1Var.actionBar);
        if (oa1Var.c) {
            i4Var.addView(oa1Var.j0, k7.b6.e(344, 72, 81));
            oa1Var.setBulletinDelegate(new gg.w(11));
        }
        oa1Var.fragmentView = i4Var;
        p91 p91Var = new p91(oa1Var, context);
        oa1Var.P = p91Var;
        p91Var.setSections(true);
        oa1Var.P.setClipToPadding(false);
        p91 p91Var2 = oa1Var.P;
        Objects.requireNonNull(p91Var2);
        oa1Var.Q = new ng.k(p91Var2, i4Var, new vs(p91Var2, 1));
        cc ccVar = oa1Var.g0;
        if (ccVar != null) {
            org.telegram.ui.Components.rl0 rl0Var = ccVar.C;
            Objects.requireNonNull(rl0Var);
            ccVar.D = new ng.k(rl0Var, i4Var, new vs(rl0Var, 0));
            oa1Var.g0.C.j(new n91(oa1Var, 1));
        }
        me meVar2 = oa1Var.h0;
        if (meVar2 != null) {
            org.telegram.ui.Components.g61 g61Var = meVar2.X0;
            Objects.requireNonNull(g61Var);
            meVar2.Y0 = new ng.k(g61Var, i4Var, new z8(g61Var, 0));
            oa1Var.h0.X0.j(new n91(oa1Var, 2));
        }
        oa1Var.D0 = new l91(oa1Var, i4Var);
        oa1Var.P.o1();
        LinearLayout linearLayout = new LinearLayout(context);
        oa1Var.Y = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context);
        oa1Var.T = jj0Var;
        jj0Var.setAutoRepeat(true);
        oa1Var.T.f(R.raw.statistic_preload, 120, 120, null);
        oa1Var.T.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView.setTag(Integer.valueOf(i11));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.j6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        textView2.setTag(Integer.valueOf(i12));
        org.telegram.messenger.y3.r(R.string.LoadingStatsDescription, textView2, 1);
        oa1Var.Y.addView(oa1Var.T, k7.b6.t(120, 120, 1, 0, 0, 0, 20));
        oa1Var.Y.addView(textView, k7.b6.t(-2, -2, 1, 0, 0, 0, 10));
        oa1Var.Y.addView(textView2, k7.b6.q(-2, -2, 1));
        frameLayout3.addView(oa1Var.Y, k7.b6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (oa1Var.U == null) {
            oa1Var.U = new t91(oa1Var);
        }
        oa1Var.P.setAdapter(oa1Var.U);
        f2.i0 i0Var = new f2.i0();
        oa1Var.R = i0Var;
        oa1Var.P.setLayoutManager(i0Var);
        oa1Var.V = new m91();
        oa1Var.P.setItemAnimator(null);
        oa1Var.P.j(new n91(oa1Var, 0));
        oa1Var.P.setOnItemClickListener(new p21(oa1Var, 6));
        oa1Var.P.setOnItemLongClickListener(new kl0(oa1Var, 18));
        frameLayout3.addView(oa1Var.P);
        org.telegram.ui.Components.yn ynVar = new org.telegram.ui.Components.yn(context, null, false, null);
        oa1Var.O = ynVar;
        ynVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        oa1Var.O.getAvatarImageView().setScaleX(0.9f);
        oa1Var.O.getAvatarImageView().setScaleY(0.9f);
        oa1Var.O.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        oa1Var.actionBar.addView(oa1Var.O, 0, k7.b6.d(-2, -1.0f, 51, !oa1Var.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = oa1Var.getMessagesController().getChat(Long.valueOf(j10));
        oa1Var.O.setChatAvatar(chat2);
        oa1Var.O.setTitle(chat2 == null ? "" : chat2.title);
        org.telegram.ui.Components.yn ynVar2 = oa1Var.O;
        if (ynVar2.getSubtitleTextView() != null) {
            ynVar2.getSubtitleTextView().setVisibility(8);
        }
        ai.z(false, oa1Var.actionBar);
        oa1Var.actionBar.setActionBarMenuOnItemClick(new ll0(oa1Var, 18));
        oa1Var.O.i(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        oa1Var.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i11, false), false);
        oa1Var.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i11, false), true);
        oa1Var.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z8, false), false);
        oa1Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        boolean z14 = oa1Var.u0;
        b6 b6Var = oa1Var.y0;
        if (z14) {
            oa1Var.Y.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(b6Var, 500L);
            oa1Var.Y.setVisibility(0);
            oa1Var.P.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(b6Var);
            oa1Var.Y.setVisibility(8);
            oa1Var.P.setVisibility(0);
        }
        pg.b c3 = aVar.c(oa1Var.j0, rg.b.f(oa1Var.resourceProvider), false);
        c3.p(AndroidUtilities.dp(28.0f));
        c3.o(AndroidUtilities.dp(7.666f));
        oa1Var.j0.setBackground(c3);
        oa1Var.c0();
        oa1Var.v0 = new ba1(oa1Var.U, oa1Var.R);
        return oa1Var.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((nh.l6) objArr[0]) == this.w0) {
                j0();
                o0();
                if (this.U != null) {
                    this.P.setItemAnimator(null);
                    this.v0.f();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() == null) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.p2 p2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.p2) ai.j(2, fragmentStack) : null;
            if (p2Var instanceof ro) {
                ((ActionBarLayout) getParentLayout()).a0(p2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.p2 p2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.p2) ai.j(2, fragmentStack2) : null;
            if (!booleanValue) {
                finishFragment();
                if (p2Var2 instanceof ProfileActivity) {
                    gg.r.f(p2Var2, chat, false);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.p2 p2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.p2) ai.j(3, fragmentStack2) : null;
            if (p2Var2 instanceof ProfileActivity) {
                ((ActionBarLayout) getParentLayout()).a0(p2Var2, false);
            }
            finishFragment();
            if (p2Var3 instanceof zn) {
                gg.r.f(p2Var3, chat, true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.messagesDidLoad) {
            if (i10 == NotificationCenter.chatInfoDidLoad) {
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                if (chatFull.id == this.b && this.a == null) {
                    this.a = chatFull;
                    i0();
                    return;
                }
                return;
            }
            return;
        }
        if (((Integer) objArr[10]).intValue() == this.classGuid) {
            ArrayList arrayList2 = (ArrayList) objArr[2];
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i13 = 0;
            while (true) {
                arrayList = this.o0;
                if (i13 >= size) {
                    break;
                }
                MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                int i14 = this.m0.get(messageObject.getId(), -1);
                if (i14 >= 0 && ((la1) arrayList.get(i14)).b() == messageObject.getId()) {
                    if (messageObject.deleted) {
                        arrayList3.add((la1) arrayList.get(i14));
                    } else {
                        ((la1) arrayList.get(i14)).b = messageObject;
                    }
                }
                i13++;
            }
            arrayList.removeAll(arrayList3);
            ArrayList arrayList4 = this.p0;
            arrayList4.clear();
            int size2 = arrayList.size();
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                la1 la1Var = (la1) arrayList.get(i12);
                if (la1Var.b == null) {
                    this.l0 = la1Var.b();
                    break;
                } else {
                    arrayList4.add(la1Var);
                    i12++;
                }
            }
            if (arrayList4.size() < 20) {
                h0();
            }
            o0();
            if (this.U != null) {
                this.P.setItemAnimator(null);
                this.v0.f();
            }
        }
    }

    public final void g0(aa1[] aa1VarArr) {
        t91 t91Var = this.U;
        if (t91Var != null) {
            t91Var.E();
            this.P.setItemAnimator(null);
            this.U.l();
        }
        this.u0 = false;
        LinearLayout linearLayout = this.Y;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.y0);
        this.Y.animate().alpha(0.0f).setDuration(230L).setListener(new ss0(this, 20));
        this.P.setVisibility(0);
        this.P.setAlpha(0.0f);
        this.P.animate().alpha(1.0f).setDuration(230L).start();
        for (aa1 aa1Var : aa1VarArr) {
            if (aa1Var != null && aa1Var.d == null && aa1Var.f != null) {
                aa1Var.a(this.currentAccount, this.classGuid, this.a.stats_dc, new org.telegram.ui.Components.s51(1, this, aa1Var));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        jy0 jy0Var = new jy0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 0, new Class[]{org.telegram.ui.Cells.z7.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 0, new Class[]{org.telegram.ui.Cells.z7.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 0, new Class[]{org.telegram.ui.Cells.z7.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 0, new Class[]{org.telegram.ui.Cells.z7.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 0, new Class[]{org.telegram.ui.Cells.z7.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 0, new Class[]{xf.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.x6));
        int i13 = org.telegram.ui.ActionBar.j6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, i13));
        org.telegram.ui.Components.yn ynVar = this.O;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ynVar != null ? ynVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Oi));
        org.telegram.ui.Components.yn ynVar2 = this.O;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ynVar2 != null ? ynVar2.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.Z) {
            int i14 = 0;
            while (i14 < 6) {
                k0(i14 == 0 ? this.d : i14 == 1 ? this.E : i14 == 2 ? this.F : i14 == 3 ? this.G : i14 == 4 ? this.H : this.I, arrayList, jy0Var);
                i14++;
            }
        } else {
            int i15 = 0;
            while (i15 < 12) {
                k0(i15 == 0 ? this.d : i15 == 1 ? this.h : i15 == 2 ? this.n : i15 == 3 ? this.r : i15 == 4 ? this.s : i15 == 5 ? this.v : i15 == 6 ? this.x : i15 == 7 ? this.e : i15 == 8 ? this.w : i15 == 9 ? this.y : i15 == 10 ? this.B : this.C, arrayList, jy0Var);
                i15++;
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.m0.get(this.l0); i11 < size; i11++) {
            if (((la1) arrayList.get(i11)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((la1) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.b);
        this.t0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new k91(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.i0) {
            return;
        }
        boolean z4 = this.Z;
        long j10 = this.b;
        if (z4) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new k91(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        gk gkVar = this.f0;
        if (gkVar == null || (gkVar.b == 0 && gkVar.c == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0() {
        ArrayList arrayList = this.r0;
        arrayList.clear();
        ArrayList arrayList2 = this.q0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            la1 la1Var = (la1) obj;
            MessageObject f10 = this.w0.f(la1Var.b());
            if (f10 != null) {
                la1Var.b = f10;
                arrayList.add(la1Var);
            }
        }
        this.n0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z4) {
        int i11 = 0;
        while (true) {
            bh.b[] bVarArr = this.k0;
            if (i11 >= bVarArr.length) {
                return;
            }
            bVarArr[i11].e(i11 == i10, z4);
            i11++;
        }
    }

    public final void n0(float f10, boolean z4) {
        for (int i10 = 0; i10 < this.k0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f10));
            bh.b bVar = this.k0[i10];
            bVar.G = max;
            bVar.F = z4;
            bVar.invalidate();
        }
        this.j0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.s0;
        arrayList.clear();
        arrayList.addAll(this.p0);
        arrayList.addAll(this.r0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new org.telegram.ui.Components.x0(1))));
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        nh.t6 storiesController = getMessagesController().getStoriesController();
        long j10 = this.b;
        nh.l6 A = storiesController.A(-j10, 2, -1, true);
        this.w0 = A;
        if (A != null) {
            this.x0 = A.o();
        }
        if (this.a != null) {
            i0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j10, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesListUpdated);
        org.telegram.ui.ActionBar.d2[] d2VarArr = this.e0;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            d2Var.dismiss();
            d2VarArr[0] = null;
        }
        nh.l6 l6Var = this.w0;
        if (l6Var != null) {
            l6Var.z(this.x0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }
}
