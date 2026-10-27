package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.yd1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f41 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, oe.d, org.telegram.ui.ActionBar.p6 {
    public static final /* synthetic */ int i0 = 0;
    public final ImageView E;
    public final FrameLayout F;
    public final v31 G;
    public long H;
    public long I;
    public final oe.b J;
    public eh.d K;
    public eh.d L;
    public float M;
    public float N;
    public org.telegram.ui.le O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public Boolean W;
    public final oe.b a;
    public ValueAnimator a0;
    public final int b;
    public long b0;
    public final long c;
    public boolean c0;
    public final org.telegram.ui.ActionBar.u6 d;
    public Utilities.Callback2 d0;
    public final boolean e;
    public Runnable e0;
    public final boolean f;
    public Utilities.Callback2 f0;
    public boolean g0;
    public final org.telegram.ui.wn h;
    public final HashSet h0;
    public final boolean n;
    public final FrameLayout r;
    public final t31 s;
    public final e41 v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;

    /* JADX WARN: Type inference failed for: r3v9, types: [org.telegram.ui.Components.s31] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.s31] */
    public f41(Activity activity, org.telegram.ui.wn wnVar, int i10, long j10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity);
        ViewGroup viewGroup;
        ds dsVar = ds.h;
        this.a = new oe.b(0, this, dsVar, 380L, true);
        this.J = new oe.b(0, new n31(this), dsVar, 320L, false);
        this.R = 0.0f;
        this.h0 = new HashSet();
        this.h = wnVar;
        this.b = i10;
        this.c = j10;
        this.d = u6Var;
        long j11 = -j10;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        this.f = isBotForumWithEditableTopics;
        this.n = !org.telegram.messenger.t.x("topics_end_reached_", j11, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.r = frameLayout;
        addView(frameLayout, kb1.h(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.F = frameLayout2;
        addView(frameLayout2, kb1.h(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        final int i11 = 0;
        t31 t31Var = new t31(this, activity, i10, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.s31
            public final /* synthetic */ f41 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i12;
                boolean z11;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i13 = i11;
                f41 f41Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k71 k71Var = (k71) obj2;
                        boolean z13 = f41Var.f;
                        int i14 = f41Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = f41Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = f41Var.e;
                        int i15 = z31.a;
                        u61 K = u61.K(z31.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z14;
                        K.L(f41Var.b0 == 0);
                        arrayList.add(K);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z15 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z13) {
                                    i12 = i17;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (f41Var.h0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((u61) ic.a.g(1, arrayList)).y |= 8;
                                        }
                                        k71Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        k71Var.M();
                                        z15 = true;
                                    }
                                    u61 K2 = u61.K(z31.class);
                                    K2.x = j17;
                                    K2.d = tL_forumTopic2.id;
                                    K2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        K2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        K2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j19 = f41Var.b0;
                                    if (z14) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    K2.L(j12 == j13);
                                    arrayList.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            k71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && f41Var.n) {
                            u61 K3 = u61.K(z31.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList.add(K3);
                            u61 K4 = u61.K(z31.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList.add(K4);
                            u61 K5 = u61.K(z31.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList.add(K5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                u61 K6 = u61.K(z31.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        f41.b(f41Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        k71 k71Var2 = (k71) obj2;
                        boolean z17 = f41Var.e;
                        int i19 = f41Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = f41Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = f41Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = d41.a;
                            u61 K7 = u61.K(d41.class);
                            K7.d = 0;
                            topicsController = topicsController3;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z17;
                            K7.y = z18 ? 1 : 0;
                            K7.L(f41Var.b0 == 0);
                            arrayList2.add(K7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z12 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z18) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (f41Var.h0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        k71Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        k71Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = d41.a;
                                    u61 K8 = u61.K(d41.class);
                                    K8.x = j20;
                                    K8.d = tL_forumTopic4.id;
                                    K8.G = tL_forumTopic4;
                                    if (z17) {
                                        j14 = j20;
                                        K8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        K8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = f41Var.b0;
                                    if (z17) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.id;
                                    }
                                    K8.L(j15 == j16);
                                    arrayList2.add(K8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            k71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && f41Var.n) {
                            int i24 = d41.a;
                            u61 K9 = u61.K(d41.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList2.add(K9);
                            u61 K10 = u61.K(d41.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList2.add(K10);
                            u61 K11 = u61.K(d41.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList2.add(K11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = d41.a;
                                u61 K12 = u61.K(d41.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.q = false;
                                arrayList2.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new n31(this), new n31(this), u6Var);
        this.s = t31Var;
        final int i12 = 1;
        t31Var.H1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.s31
            public final /* synthetic */ f41 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i122;
                boolean z11;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i13 = i12;
                f41 f41Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k71 k71Var = (k71) obj2;
                        boolean z13 = f41Var.f;
                        int i14 = f41Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = f41Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = f41Var.e;
                        int i15 = z31.a;
                        u61 K = u61.K(z31.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z14;
                        K.L(f41Var.b0 == 0);
                        arrayList.add(K);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z15 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z13) {
                                    i122 = i17;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i18;
                                        i16 = i122;
                                    }
                                } else {
                                    i122 = i17;
                                }
                                if (f41Var.h0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((u61) ic.a.g(1, arrayList)).y |= 8;
                                        }
                                        k71Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        k71Var.M();
                                        z15 = true;
                                    }
                                    u61 K2 = u61.K(z31.class);
                                    K2.x = j17;
                                    K2.d = tL_forumTopic2.id;
                                    K2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        K2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        K2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j19 = f41Var.b0;
                                    if (z14) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    K2.L(j12 == j13);
                                    arrayList.add(K2);
                                    size = i18;
                                    i16 = i122;
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            k71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && f41Var.n) {
                            u61 K3 = u61.K(z31.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList.add(K3);
                            u61 K4 = u61.K(z31.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList.add(K4);
                            u61 K5 = u61.K(z31.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList.add(K5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                u61 K6 = u61.K(z31.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        f41.b(f41Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        k71 k71Var2 = (k71) obj2;
                        boolean z17 = f41Var.e;
                        int i19 = f41Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = f41Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = f41Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = d41.a;
                            u61 K7 = u61.K(d41.class);
                            K7.d = 0;
                            topicsController = topicsController3;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z17;
                            K7.y = z18 ? 1 : 0;
                            K7.L(f41Var.b0 == 0);
                            arrayList2.add(K7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z12 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z18) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (f41Var.h0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        k71Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        k71Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = d41.a;
                                    u61 K8 = u61.K(d41.class);
                                    K8.x = j20;
                                    K8.d = tL_forumTopic4.id;
                                    K8.G = tL_forumTopic4;
                                    if (z17) {
                                        j14 = j20;
                                        K8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        K8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = f41Var.b0;
                                    if (z17) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.id;
                                    }
                                    K8.L(j15 == j16);
                                    arrayList2.add(K8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            k71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && f41Var.n) {
                            int i24 = d41.a;
                            u61 K9 = u61.K(d41.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList2.add(K9);
                            u61 K10 = u61.K(d41.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList2.add(K10);
                            u61 K11 = u61.K(d41.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList2.add(K11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = d41.a;
                                u61 K12 = u61.K(d41.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.q = false;
                                arrayList2.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        t31Var.setWillNotDraw(false);
        t31Var.g3.r = false;
        t31Var.getContext();
        ig.j0 j0Var = new ig.j0((ViewGroup) t31Var, 6);
        t31Var.f3 = j0Var;
        t31Var.setLayoutManager(j0Var);
        frameLayout.addView(t31Var, kb1.h(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        t31Var.j(new u31(this, 0));
        if (isBotForumWithEditableTopics) {
            e41 e41Var = new e41(activity, i10, u6Var);
            this.v = e41Var;
            e41Var.c(true, false, this.b0 == 0);
            final int i13 = 2;
            e41Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q31
                public final /* synthetic */ f41 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            f41 f41Var = this.b;
                            Boolean bool = f41Var.W;
                            boolean z10 = false;
                            if (bool == null ? !f41Var.Q : !bool.booleanValue()) {
                                z10 = true;
                            }
                            f41Var.d(z10);
                            break;
                        case 1:
                            f41 f41Var2 = this.b;
                            v31 v31Var = f41Var2.G;
                            v31Var.C1(false);
                            t31 t31Var2 = f41Var2.s;
                            t31Var2.C1(false);
                            f41Var2.J.a(false, true);
                            AndroidUtilities.updateVisibleRows(v31Var);
                            AndroidUtilities.updateVisibleRows(t31Var2);
                            break;
                        default:
                            this.b.d0.run(0, Boolean.FALSE);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(e41Var, kb1.h(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.v = null;
        }
        final int i14 = 2;
        ViewGroup viewGroup2 = viewGroup;
        v31 v31Var = new v31(activity, i10, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.s31
            public final /* synthetic */ f41 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i122;
                boolean z11;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i132 = i14;
                f41 f41Var = this.b;
                switch (i132) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k71 k71Var = (k71) obj2;
                        boolean z13 = f41Var.f;
                        int i142 = f41Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i142);
                        long j17 = f41Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i142).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i142).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = f41Var.e;
                        int i15 = z31.a;
                        u61 K = u61.K(z31.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z14;
                        K.L(f41Var.b0 == 0);
                        arrayList.add(K);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z15 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z13) {
                                    i122 = i17;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i18;
                                        i16 = i122;
                                    }
                                } else {
                                    i122 = i17;
                                }
                                if (f41Var.h0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((u61) ic.a.g(1, arrayList)).y |= 8;
                                        }
                                        k71Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        k71Var.M();
                                        z15 = true;
                                    }
                                    u61 K2 = u61.K(z31.class);
                                    K2.x = j17;
                                    K2.d = tL_forumTopic2.id;
                                    K2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        K2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        K2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j19 = f41Var.b0;
                                    if (z14) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    K2.L(j12 == j13);
                                    arrayList.add(K2);
                                    size = i18;
                                    i16 = i122;
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            k71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && f41Var.n) {
                            u61 K3 = u61.K(z31.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList.add(K3);
                            u61 K4 = u61.K(z31.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList.add(K4);
                            u61 K5 = u61.K(z31.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList.add(K5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                u61 K6 = u61.K(z31.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        f41.b(f41Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        k71 k71Var2 = (k71) obj2;
                        boolean z17 = f41Var.e;
                        int i19 = f41Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = f41Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = f41Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = d41.a;
                            u61 K7 = u61.K(d41.class);
                            K7.d = 0;
                            topicsController = topicsController3;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z17;
                            K7.y = z18 ? 1 : 0;
                            K7.L(f41Var.b0 == 0);
                            arrayList2.add(K7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z12 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z18) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (f41Var.h0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        k71Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        k71Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = d41.a;
                                    u61 K8 = u61.K(d41.class);
                                    K8.x = j20;
                                    K8.d = tL_forumTopic4.id;
                                    K8.G = tL_forumTopic4;
                                    if (z17) {
                                        j14 = j20;
                                        K8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        K8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = f41Var.b0;
                                    if (z17) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.id;
                                    }
                                    K8.L(j15 == j16);
                                    arrayList2.add(K8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            k71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && f41Var.n) {
                            int i24 = d41.a;
                            u61 K9 = u61.K(d41.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList2.add(K9);
                            u61 K10 = u61.K(d41.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList2.add(K10);
                            u61 K11 = u61.K(d41.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList2.add(K11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = d41.a;
                                u61 K12 = u61.K(d41.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.q = false;
                                arrayList2.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new n31(this), new n31(this), u6Var);
        this.G = v31Var;
        final int i15 = 1;
        v31Var.H1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.s31
            public final /* synthetic */ f41 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i122;
                boolean z11;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i132 = i15;
                f41 f41Var = this.b;
                switch (i132) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k71 k71Var = (k71) obj2;
                        boolean z13 = f41Var.f;
                        int i142 = f41Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i142);
                        long j17 = f41Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i142).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i142).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = f41Var.e;
                        int i152 = z31.a;
                        u61 K = u61.K(z31.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z14;
                        K.L(f41Var.b0 == 0);
                        arrayList.add(K);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z15 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z13) {
                                    i122 = i17;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i18;
                                        i16 = i122;
                                    }
                                } else {
                                    i122 = i17;
                                }
                                if (f41Var.h0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((u61) ic.a.g(1, arrayList)).y |= 8;
                                        }
                                        k71Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        k71Var.M();
                                        z15 = true;
                                    }
                                    u61 K2 = u61.K(z31.class);
                                    K2.x = j17;
                                    K2.d = tL_forumTopic2.id;
                                    K2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        K2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        K2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j19 = f41Var.b0;
                                    if (z14) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    K2.L(j12 == j13);
                                    arrayList.add(K2);
                                    size = i18;
                                    i16 = i122;
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            k71Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && f41Var.n) {
                            u61 K3 = u61.K(z31.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList.add(K3);
                            u61 K4 = u61.K(z31.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList.add(K4);
                            u61 K5 = u61.K(z31.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList.add(K5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                u61 K6 = u61.K(z31.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList.add(K6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        f41.b(f41Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        k71 k71Var2 = (k71) obj2;
                        boolean z17 = f41Var.e;
                        int i19 = f41Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = f41Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = f41Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = d41.a;
                            u61 K7 = u61.K(d41.class);
                            K7.d = 0;
                            topicsController = topicsController3;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z17;
                            K7.y = z18 ? 1 : 0;
                            K7.L(f41Var.b0 == 0);
                            arrayList2.add(K7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z12 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z18) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (f41Var.h0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        k71Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        k71Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = d41.a;
                                    u61 K8 = u61.K(d41.class);
                                    K8.x = j20;
                                    K8.d = tL_forumTopic4.id;
                                    K8.G = tL_forumTopic4;
                                    if (z17) {
                                        j14 = j20;
                                        K8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        K8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = f41Var.b0;
                                    if (z17) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.id;
                                    }
                                    K8.L(j15 == j16);
                                    arrayList2.add(K8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            k71Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && f41Var.n) {
                            int i24 = d41.a;
                            u61 K9 = u61.K(d41.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList2.add(K9);
                            u61 K10 = u61.K(d41.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList2.add(K10);
                            u61 K11 = u61.K(d41.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList2.add(K11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = d41.a;
                                u61 K12 = u61.K(d41.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.q = false;
                                arrayList2.add(K12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        v31Var.g3.r = false;
        v31Var.setClipToPadding(false);
        v31Var.setClipChildren(false);
        viewGroup2.addView(v31Var, kb1.h(-1, -1.0f, 119, 0.0f, isBotForumWithEditableTopics ? 90.0f : 48.0f, 0.0f, 0.0f));
        v31Var.j(new u31(this, 1));
        final int i16 = 0;
        ImageView j12 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q31
            public final /* synthetic */ f41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        f41 f41Var = this.b;
                        Boolean bool = f41Var.W;
                        boolean z10 = false;
                        if (bool == null ? !f41Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        f41Var.d(z10);
                        break;
                    case 1:
                        f41 f41Var2 = this.b;
                        v31 v31Var2 = f41Var2.G;
                        v31Var2.C1(false);
                        t31 t31Var2 = f41Var2.s;
                        t31Var2.C1(false);
                        f41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(v31Var2);
                        AndroidUtilities.updateVisibleRows(t31Var2);
                        break;
                    default:
                        this.b.d0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.y = j12;
        final int i17 = 0;
        ImageView j13 = j(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q31
            public final /* synthetic */ f41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        f41 f41Var = this.b;
                        Boolean bool = f41Var.W;
                        boolean z10 = false;
                        if (bool == null ? !f41Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        f41Var.d(z10);
                        break;
                    case 1:
                        f41 f41Var2 = this.b;
                        v31 v31Var2 = f41Var2.G;
                        v31Var2.C1(false);
                        t31 t31Var2 = f41Var2.s;
                        t31Var2.C1(false);
                        f41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(v31Var2);
                        AndroidUtilities.updateVisibleRows(t31Var2);
                        break;
                    default:
                        this.b.d0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.E = j13;
        frameLayout.addView(j12, kb1.i(44, 36, 51));
        viewGroup2.addView(j13, kb1.i(64, 48, 51));
        final int i18 = 1;
        ImageView j14 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q31
            public final /* synthetic */ f41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        f41 f41Var = this.b;
                        Boolean bool = f41Var.W;
                        boolean z10 = false;
                        if (bool == null ? !f41Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        f41Var.d(z10);
                        break;
                    case 1:
                        f41 f41Var2 = this.b;
                        v31 v31Var2 = f41Var2.G;
                        v31Var2.C1(false);
                        t31 t31Var2 = f41Var2.s;
                        t31Var2.C1(false);
                        f41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(v31Var2);
                        AndroidUtilities.updateVisibleRows(t31Var2);
                        break;
                    default:
                        this.b.d0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.w = j14;
        final int i19 = 1;
        ImageView j15 = j(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q31
            public final /* synthetic */ f41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        f41 f41Var = this.b;
                        Boolean bool = f41Var.W;
                        boolean z10 = false;
                        if (bool == null ? !f41Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        f41Var.d(z10);
                        break;
                    case 1:
                        f41 f41Var2 = this.b;
                        v31 v31Var2 = f41Var2.G;
                        v31Var2.C1(false);
                        t31 t31Var2 = f41Var2.s;
                        t31Var2.C1(false);
                        f41Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(v31Var2);
                        AndroidUtilities.updateVisibleRows(t31Var2);
                        break;
                    default:
                        this.b.d0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.x = j15;
        frameLayout.addView(j14, kb1.i(44, 36, 51));
        viewGroup2.addView(j15, kb1.i(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j11, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.t.x("topicssidetabs", j10, mainSettings, false)) {
            this.R = 1.0f;
            this.Q = true;
        }
        boolean x9 = org.telegram.messenger.t.x("topicssidetabsb", j10, mainSettings, false);
        this.P = x9;
        j13.setImageResource(x9 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        g(false);
        h();
        o();
        p();
    }

    public static void a(f41 f41Var, u61 u61Var) {
        if (f41Var.e) {
            Utilities.Callback2 callback2 = f41Var.f0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(u61Var.B), Boolean.FALSE);
                return;
            }
            return;
        }
        if (u61Var.B == -2) {
            Runnable runnable = f41Var.e0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = f41Var.d0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf(u61Var.d), Boolean.FALSE);
        }
    }

    public static void b(f41 f41Var, ArrayList arrayList) {
        long j10 = f41Var.c;
        TopicsController topicsController = MessagesController.getInstance(f41Var.b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = c3.h0.i(((u61) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        topicsController.reorderPinnedTopics(j11, arrayList2);
        topicsController.sortTopics(j11, false);
    }

    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    public static boolean c(final f41 f41Var, u61 u61Var, View view) {
        TLRPC.Chat chat;
        final f41 f41Var2;
        boolean z10;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i10;
        byte b10;
        final int i11;
        ?? r11;
        final l80 l80Var;
        l80 l80Var2;
        org.telegram.ui.ActionBar.u6 u6Var2 = f41Var.d;
        org.telegram.ui.wn wnVar = f41Var.h;
        long j10 = f41Var.c;
        int i12 = f41Var.b;
        if (f41Var.G.k3 || f41Var.s.k3) {
            return false;
        }
        Object obj = u61Var.G;
        if (!(obj instanceof TLRPC.TL_forumTopic)) {
            return false;
        }
        final TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
        MessagesController messagesController = MessagesController.getInstance(i12);
        TLRPC.Chat chat2 = j10 < 0 ? messagesController.getChat(Long.valueOf(-j10)) : null;
        TLRPC.User user = j10 > 0 ? messagesController.getUser(Long.valueOf(j10)) : null;
        final l80 I = l80.I(wnVar, view);
        if (ChatObject.isMonoForum(chat2)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i12, chat2)) {
                return false;
            }
            TLRPC.Chat chat3 = chat2;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new bi.y2(f41Var, I, peerDialogId, chat2, 17), false);
            long j11 = chat3.id;
            if (ChatObject.isMonoForum(chat3) && ChatObject.canManageMonoForum(i12, chat3)) {
                long j12 = chat3.linked_monoforum_id;
                if (j12 != 0) {
                    j11 = j12;
                }
            }
            TLRPC.Chat chat4 = MessagesController.getInstance(i12).getChat(Long.valueOf(j11));
            TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
            if (user2 == null || !ChatObject.canBlockUsers(chat4)) {
                l80Var2 = I;
                i10 = 8;
            } else {
                I.c(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), null, false);
                org.telegram.ui.ActionBar.g1 y3 = I.y();
                i10 = 8;
                y3.setVisibility(8);
                MessagesController messagesController2 = MessagesController.getInstance(i12);
                bi.x3 x3Var = new bi.x3(f41Var, y3, I, j11, user2, chat4);
                l80Var2 = I;
                messagesController2.checkIsInChat(true, chat4, user2, x3Var);
            }
            l80Var = l80Var2;
            u6Var = u6Var2;
            r11 = 1;
            i11 = 2;
            b10 = 0;
        } else {
            TLRPC.Chat chat5 = chat2;
            if (ChatObject.canManageTopics(chat5) || UserObject.isBotForumWithEditableTopics(user)) {
                boolean z11 = tL_forumTopic.pinned;
                int i13 = z11 ? R.drawable.msg_unpin : R.drawable.msg_pin;
                String string = LocaleController.getString(z11 ? R.string.DialogUnpin : R.string.DialogPin);
                int i14 = i13;
                chat = chat5;
                f41Var2 = f41Var;
                e10 e10Var = new e10(f41Var2, I, messagesController, tL_forumTopic, 12);
                I = I;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                int i15 = 0;
                I.c(i14, string, e10Var, false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new o31(f41Var2, i15), false);
                }
            } else {
                f41Var2 = f41Var;
                chat = chat5;
            }
            if (ChatObject.canManageTopics(chat) || UserObject.isBotForumWithEditableTopics(user)) {
                final int i16 = 0;
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(f41Var2) { // from class: org.telegram.ui.Components.p31
                    public final /* synthetic */ f41 b;

                    {
                        this.b = f41Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = i16;
                        f41 f41Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        l80 l80Var3 = I;
                        switch (i17) {
                            case 0:
                                l80Var3.u();
                                f41Var3.h.presentFragment(yd1.b0(-f41Var3.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                f41Var3.getClass();
                                l80Var3.u();
                                MessagesController.getInstance(f41Var3.b).getTopicsController().toggleCloseTopic(-f41Var3.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                l80Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                k5 k5Var = new k5(20);
                                f41 f41Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f41Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                e2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = f41Var4.b0;
                                if (hashSet.size() == 1) {
                                    e2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(f41Var4.b).getTopicsController().findTopic(-f41Var4.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bi.m4(f41Var4, arrayList, j13, hashSet, k5Var));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new rd0(25));
                                e2Var.show();
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                z10 = false;
            } else {
                z10 = false;
            }
            long j13 = f41Var2.c;
            long j14 = tL_forumTopic.id;
            int currentAccount = wnVar.getCurrentAccount();
            org.telegram.ui.ActionBar.u6 resourceProvider = wnVar.getResourceProvider();
            l80 l80Var3 = I;
            wo woVar = new wo(l80Var3, currentAccount, j13, j14, wnVar, resourceProvider);
            l80 J = l80Var3.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.bu0(l80Var3, 26), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.bb(l80Var3, currentAccount, j13, j14, J, wnVar, resourceProvider), false);
            org.telegram.ui.ActionBar.g1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ai.h1(l80Var3, resourceProvider, currentAccount, woVar, 21), false);
            u6Var = u6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new org.telegram.messenger.y2(l80Var3, j13, j14, wnVar, resourceProvider, 7), false);
            J.c(0, "", new bi.ka(l80Var3, currentAccount, j13, j14, wnVar, resourceProvider), false);
            new org.telegram.messenger.u9(currentAccount, j13, j14, J.y(), y10).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j10, tL_forumTopic.id);
            int i17 = isDialogMuted ? R.drawable.msg_unmute : R.drawable.msg_mute;
            String string2 = LocaleController.getString(isDialogMuted ? R.string.Unmute : R.string.Mute);
            i10 = 8;
            b10 = 0;
            i11 = 2;
            r11 = 1;
            r11 = 1;
            i30 i30Var = new i30(f41Var, messagesController, tL_forumTopic, l80Var3, J, 3);
            l80Var = l80Var3;
            l80Var.c(i17, string2, i30Var, false);
            TLRPC.Chat chat6 = chat;
            if (ChatObject.canManageTopic(i12, chat6, tL_forumTopic) && !UserObject.isBotForum(user)) {
                boolean z12 = tL_forumTopic.closed;
                int i18 = z12 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close;
                String string3 = LocaleController.getString(z12 ? R.string.RestartTopic : R.string.CloseTopic);
                final int i19 = r11 == true ? 1 : 0;
                l80Var.c(i18, string3, new Runnable(f41Var) { // from class: org.telegram.ui.Components.p31
                    public final /* synthetic */ f41 b;

                    {
                        this.b = f41Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i172 = i19;
                        f41 f41Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        l80 l80Var32 = l80Var;
                        switch (i172) {
                            case 0:
                                l80Var32.u();
                                f41Var3.h.presentFragment(yd1.b0(-f41Var3.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                f41Var3.getClass();
                                l80Var32.u();
                                MessagesController.getInstance(f41Var3.b).getTopicsController().toggleCloseTopic(-f41Var3.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                l80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                k5 k5Var = new k5(20);
                                f41 f41Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f41Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                e2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = f41Var4.b0;
                                if (hashSet.size() == 1) {
                                    e2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(f41Var4.b).getTopicsController().findTopic(-f41Var4.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bi.m4(f41Var4, arrayList, j132, hashSet, k5Var));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new rd0(25));
                                e2Var.show();
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i12, chat6, tL_forumTopic)) {
                l80Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(f41Var) { // from class: org.telegram.ui.Components.p31
                    public final /* synthetic */ f41 b;

                    {
                        this.b = f41Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i172 = i11;
                        f41 f41Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        l80 l80Var32 = l80Var;
                        switch (i172) {
                            case 0:
                                l80Var32.u();
                                f41Var3.h.presentFragment(yd1.b0(-f41Var3.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                f41Var3.getClass();
                                l80Var32.u();
                                MessagesController.getInstance(f41Var3.b).getTopicsController().toggleCloseTopic(-f41Var3.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                l80Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                k5 k5Var = new k5(20);
                                f41 f41Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f41Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                e2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = f41Var4.b0;
                                if (hashSet.size() == 1) {
                                    e2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(f41Var4.b).getTopicsController().findTopic(-f41Var4.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bi.m4(f41Var4, arrayList, j132, hashSet, k5Var));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new rd0(25));
                                e2Var.show();
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof a41) {
            jw jwVar = new jw(i11, b10);
            Paint paint = new Paint((int) r11);
            jwVar.c = paint;
            jwVar.b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, u6Var));
            l80Var.W(jwVar);
            l80Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var);
            float f7 = b10;
            float f10 = dp;
            float f11 = dp2;
            float[] fArr = new float[i10];
            fArr[b10] = f7;
            fArr[r11] = f7;
            fArr[i11] = f10;
            fArr[3] = f10;
            fArr[4] = f11;
            fArr[5] = f11;
            fArr[6] = f7;
            fArr[7] = f7;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(w02);
            l80Var.W(shapeDrawable);
        }
        l80Var.Z();
        return r11;
    }

    public static ImageView j(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        kb1.b(imageView);
        return imageView;
    }

    private void setAttached(boolean z10) {
        if (this.c0 == z10) {
            return;
        }
        this.c0 = z10;
        long j10 = this.c;
        int i10 = this.b;
        if (z10) {
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.updateInterfaces);
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentResume(-j10);
        } else {
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentPause(-j10);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        }
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        o();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
    }

    public final void d(boolean z10) {
        if (this.Q == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.S) {
                this.W = Boolean.valueOf(z10);
                return;
            }
        }
        if (!z10) {
            this.P = !this.P;
        }
        this.Q = z10;
        this.S = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, z10 ? 1.0f : 0.0f);
        this.a0 = ofFloat;
        ofFloat.addUpdateListener(new f80(this, 28));
        this.a0.addListener(new w31(this, z10));
        this.a0.setInterpolator(mi.m.V);
        this.a0.setDuration(250L);
        this.a0.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j10 = this.c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() != (-j10)) {
                return;
            }
            p();
        } else {
            if (i10 != NotificationCenter.updateInterfaces || (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) <= 0) {
                return;
            }
            MessagesController.getInstance(this.b).getTopicsController().sortTopics(-j10, false);
            p();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.F;
        if (frameLayout.getVisibility() == 0) {
            this.K.setBounds((int) frameLayout.getTranslationX(), (int) this.N, (int) (frameLayout.getTranslationX() + AndroidUtilities.dp(78.0f)), (int) (getMeasuredHeight() - this.M));
            this.K.draw(canvas);
        }
        FrameLayout frameLayout2 = this.r;
        if (frameLayout2.getVisibility() == 0) {
            this.L.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.L.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + AndroidUtilities.dp(50.0f)));
            this.L.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        canvas.save();
        if (view == this.F) {
            canvas.clipPath(this.K.x.k);
        }
        if (view == this.r) {
            canvas.clipPath(this.L.x.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.y6.z6;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
        int f7 = i0.a.f(1.0f - this.R, w02, w03);
        int f10 = i0.a.f(this.R, w02, w03);
        boolean z10 = this.T;
        this.T = true;
        ImageView imageView = this.y;
        if (imageView != null && (!z10 || f7 != this.U)) {
            imageView.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
        }
        this.U = f7;
        ImageView imageView2 = this.E;
        if (imageView2 != null && (!z10 || f10 != this.V)) {
            imageView2.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        }
        this.V = f10;
    }

    public final void f() {
        FrameLayout frameLayout = this.F;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.M + this.N);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void g(boolean z10) {
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.b).getTopicsController().getTopics(-this.c);
        this.a.a((topics == null || topics.isEmpty() || this.g0) ? false : true, z10);
    }

    public b41 getCurrentTabsPosition() {
        return this.Q ? b41.b : this.P ? b41.c : b41.a;
    }

    public float getSideMenuT() {
        return this.R * this.a.e;
    }

    public final void h() {
        oe.b bVar = this.J;
        float f7 = bVar.e;
        ImageView imageView = this.w;
        imageView.setAlpha(f7);
        imageView.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        imageView.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        imageView.setVisibility(f7 > 0.0f ? 0 : 8);
        ImageView imageView2 = this.x;
        imageView2.setAlpha(f7);
        imageView2.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        imageView2.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        imageView2.setVisibility(f7 > 0.0f ? 0 : 8);
        float f10 = 1.0f - bVar.e;
        ImageView imageView3 = this.y;
        imageView3.setAlpha(f10);
        imageView3.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView3.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView3.setVisibility(f10 > 0.0f ? 0 : 8);
        ImageView imageView4 = this.E;
        imageView4.setAlpha(f10);
        imageView4.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView4.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView4.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    public final void i() {
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.R);
        FrameLayout frameLayout = this.r;
        frameLayout.setAlpha(lerp);
        frameLayout.setVisibility((1.0f - this.R) * this.a.e > 0.0f ? 0 : 8);
        if (this.P) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.M) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, k(b41.c)));
        } else {
            frameLayout.setTranslationY(this.N + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, k(b41.a)));
        }
    }

    public final float k(b41 b41Var) {
        float f7;
        float f10 = this.a.e;
        if (b41Var == b41.b) {
            f7 = this.R;
        } else {
            if ((b41Var != b41.a || this.P) && !(b41Var == b41.c && this.P)) {
                return 0.0f;
            }
            f7 = 1.0f - this.R;
        }
        return f7 * f10;
    }

    public final boolean l() {
        if (this.R <= 0.5f) {
            int i10 = 0;
            while (true) {
                t31 t31Var = this.s;
                if (i10 >= t31Var.getChildCount()) {
                    break;
                }
                u61 G = t31Var.g3.G(RecyclerView.R(t31Var.getChildAt(i10)));
                if (G != null && G.r) {
                    return true;
                }
                i10++;
            }
        } else {
            int i11 = 0;
            while (true) {
                v31 v31Var = this.G;
                if (i11 >= v31Var.getChildCount()) {
                    break;
                }
                u61 G2 = v31Var.g3.G(RecyclerView.R(v31Var.getChildAt(i11)));
                if (G2 != null && G2.r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void m() {
        TopicsController topicsController = MessagesController.getInstance(this.b).getTopicsController();
        long j10 = this.c;
        if (topicsController.endIsReached(-j10)) {
            return;
        }
        topicsController.loadTopics(-j10);
    }

    public final void n(long j10, boolean z10) {
        if (this.e) {
            Utilities.Callback2 callback2 = this.f0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.d0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final void o() {
        org.telegram.ui.le leVar = this.O;
        if (leVar != null) {
            leVar.run();
        }
        i();
        float k10 = k(b41.b);
        float lerp = AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, k10);
        FrameLayout frameLayout = this.F;
        frameLayout.setTranslationX(lerp);
        frameLayout.setVisibility(k10 <= 0.0f ? 8 : 0);
        e();
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.w;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, mode);
        org.telegram.ui.ActionBar.f7.t(this.x, i10, u6Var, mode);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAttached(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        i();
    }

    public final void p() {
        g(true);
        t31 t31Var = this.s;
        boolean canScrollHorizontally = t31Var.canScrollHorizontally(-1);
        t31Var.g3.O(true);
        if (!canScrollHorizontally) {
            t31Var.v0(0);
        }
        v31 v31Var = this.G;
        boolean canScrollVertically = v31Var.canScrollVertically(-1);
        v31Var.g3.O(true);
        if (!canScrollVertically) {
            v31Var.v0(0);
        }
        AndroidUtilities.runOnUIThread(new o31(this, 1));
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.g0 != z10) {
            this.g0 = z10;
            g(true);
        }
    }

    public void setCurrentTopic(long j10) {
        this.b0 = j10;
        t31 t31Var = this.s;
        t31Var.g3.O(true);
        t31Var.invalidate();
        this.G.g3.O(true);
        e41 e41Var = this.v;
        if (e41Var != null) {
            e41Var.c(true, false, j10 == 0);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.f0 = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.e0 = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.d0 = callback2;
    }

    public void setSideMenuBackgroundDrawable(eh.d dVar) {
        this.K = dVar;
        dVar.x(AndroidUtilities.dp(16.0f));
        this.K.w(AndroidUtilities.dp(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f7) {
        this.M = f7;
        i();
        f();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f7) {
        this.N = f7;
        this.F.setTranslationY(f7);
        i();
        f();
        invalidate();
    }

    public void setTopMenuBackgroundDrawable(eh.d dVar) {
        this.L = dVar;
        dVar.x(AndroidUtilities.dp(18.0f));
        this.L.w(AndroidUtilities.dp(7.0f));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            e();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
