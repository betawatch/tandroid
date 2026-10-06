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
import org.telegram.ui.se1;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class w31 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, le.d {
    public static final /* synthetic */ int f0 = 0;
    public final ImageView E;
    public final FrameLayout F;
    public final m31 G;
    public long H;
    public long I;
    public final le.b J;
    public ch.d K;
    public ch.d L;
    public float M;
    public float N;
    public org.telegram.ui.qe O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public Boolean T;
    public ValueAnimator U;
    public long V;
    public boolean W;
    public final le.b a;
    public Utilities.Callback2 a0;
    public final int b;
    public Runnable b0;
    public final long c;
    public Utilities.Callback2 c0;
    public final org.telegram.ui.ActionBar.d6 d;
    public boolean d0;
    public final boolean e;
    public final HashSet e0;
    public final boolean f;
    public final org.telegram.ui.yn h;
    public final boolean n;
    public final FrameLayout r;
    public final k31 s;
    public final v31 v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;

    /* JADX WARN: Type inference failed for: r3v9, types: [org.telegram.ui.Components.j31] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.j31] */
    public w31(Activity activity, org.telegram.ui.yn ynVar, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        ViewGroup viewGroup;
        tr trVar = tr.h;
        this.a = new le.b(0, this, trVar, 380L, true);
        this.J = new le.b(0, new b31(this), trVar, 320L, false);
        this.R = 0.0f;
        this.e0 = new HashSet();
        this.h = ynVar;
        this.b = i10;
        this.c = j3;
        this.d = d6Var;
        long j10 = -j3;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j10)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        this.f = isBotForumWithEditableTopics;
        this.n = !org.telegram.messenger.q.w("topics_end_reached_", j10, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.r = frameLayout;
        addView(frameLayout, w7.z5.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.F = frameLayout2;
        addView(frameLayout2, w7.z5.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        final int i11 = 0;
        k31 k31Var = new k31(this, activity, i10, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.j31
            public final /* synthetic */ w31 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i12;
                boolean z11;
                long j11;
                long j12;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j13;
                long j14;
                long j15;
                int i13 = i11;
                w31 w31Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w61 w61Var = (w61) obj2;
                        boolean z13 = w31Var.f;
                        int i14 = w31Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = w31Var.c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z14 = w31Var.e;
                        int i15 = q31.a;
                        h61 K = h61.K(q31.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z14;
                        K.L(w31Var.V == 0);
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
                                if (w31Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((h61) hg.c.g(1, arrayList)).y |= 8;
                                        }
                                        w61Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        w61Var.M();
                                        z15 = true;
                                    }
                                    h61 K2 = h61.K(q31.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic2.id;
                                    K2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        K2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        K2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j18 = w31Var.V;
                                    if (z14) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.id;
                                    }
                                    K2.L(j11 == j12);
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
                            w61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && w31Var.n) {
                            h61 K3 = h61.K(q31.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList.add(K3);
                            h61 K4 = h61.K(q31.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList.add(K4);
                            h61 K5 = h61.K(q31.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList.add(K5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                h61 K6 = h61.K(q31.class);
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
                        w31.b(w31Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        w61 w61Var2 = (w61) obj2;
                        boolean z17 = w31Var.e;
                        int i19 = w31Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = w31Var.c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z18 = w31Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = u31.a;
                            h61 K7 = h61.K(u31.class);
                            K7.d = 0;
                            topicsController = topicsController3;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z17;
                            K7.y = z18 ? 1 : 0;
                            K7.L(w31Var.V == 0);
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
                                if (w31Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        w61Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        w61Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = u31.a;
                                    h61 K8 = h61.K(u31.class);
                                    K8.x = j19;
                                    K8.d = tL_forumTopic4.id;
                                    K8.G = tL_forumTopic4;
                                    if (z17) {
                                        j13 = j19;
                                        K8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        K8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = w31Var.V;
                                    if (z17) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.id;
                                    }
                                    K8.L(j14 == j15);
                                    arrayList2.add(K8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j19 = j13;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            w61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && w31Var.n) {
                            int i24 = u31.a;
                            h61 K9 = h61.K(u31.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList2.add(K9);
                            h61 K10 = h61.K(u31.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList2.add(K10);
                            h61 K11 = h61.K(u31.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList2.add(K11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = u31.a;
                                h61 K12 = h61.K(u31.class);
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
        }, new b31(this), new b31(this), d6Var);
        this.s = k31Var;
        final int i12 = 1;
        k31Var.C1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.j31
            public final /* synthetic */ w31 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i122;
                boolean z11;
                long j11;
                long j12;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j13;
                long j14;
                long j15;
                int i13 = i12;
                w31 w31Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w61 w61Var = (w61) obj2;
                        boolean z13 = w31Var.f;
                        int i14 = w31Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j16 = w31Var.c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z14 = w31Var.e;
                        int i15 = q31.a;
                        h61 K = h61.K(q31.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z14;
                        K.L(w31Var.V == 0);
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
                                if (w31Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((h61) hg.c.g(1, arrayList)).y |= 8;
                                        }
                                        w61Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        w61Var.M();
                                        z15 = true;
                                    }
                                    h61 K2 = h61.K(q31.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic2.id;
                                    K2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        K2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        K2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j18 = w31Var.V;
                                    if (z14) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.id;
                                    }
                                    K2.L(j11 == j12);
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
                            w61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && w31Var.n) {
                            h61 K3 = h61.K(q31.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList.add(K3);
                            h61 K4 = h61.K(q31.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList.add(K4);
                            h61 K5 = h61.K(q31.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList.add(K5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                h61 K6 = h61.K(q31.class);
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
                        w31.b(w31Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        w61 w61Var2 = (w61) obj2;
                        boolean z17 = w31Var.e;
                        int i19 = w31Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = w31Var.c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z18 = w31Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = u31.a;
                            h61 K7 = h61.K(u31.class);
                            K7.d = 0;
                            topicsController = topicsController3;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z17;
                            K7.y = z18 ? 1 : 0;
                            K7.L(w31Var.V == 0);
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
                                if (w31Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        w61Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        w61Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = u31.a;
                                    h61 K8 = h61.K(u31.class);
                                    K8.x = j19;
                                    K8.d = tL_forumTopic4.id;
                                    K8.G = tL_forumTopic4;
                                    if (z17) {
                                        j13 = j19;
                                        K8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        K8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = w31Var.V;
                                    if (z17) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.id;
                                    }
                                    K8.L(j14 == j15);
                                    arrayList2.add(K8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j19 = j13;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            w61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && w31Var.n) {
                            int i24 = u31.a;
                            h61 K9 = h61.K(u31.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList2.add(K9);
                            h61 K10 = h61.K(u31.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList2.add(K10);
                            h61 K11 = h61.K(u31.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList2.add(K11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = u31.a;
                                h61 K12 = h61.K(u31.class);
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
        k31Var.setWillNotDraw(false);
        k31Var.f3.r = false;
        k31Var.getContext();
        gg.j0 j0Var = new gg.j0((ViewGroup) k31Var, 6);
        k31Var.e3 = j0Var;
        k31Var.setLayoutManager(j0Var);
        frameLayout.addView(k31Var, w7.z5.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        k31Var.j(new l31(this, 0));
        if (isBotForumWithEditableTopics) {
            v31 v31Var = new v31(activity, i10, d6Var);
            this.v = v31Var;
            v31Var.c(true, false, this.V == 0);
            final int i13 = 2;
            v31Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f31
                public final /* synthetic */ w31 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            w31 w31Var = this.b;
                            Boolean bool = w31Var.T;
                            boolean z10 = false;
                            if (bool == null ? !w31Var.Q : !bool.booleanValue()) {
                                z10 = true;
                            }
                            w31Var.d(z10);
                            break;
                        case 1:
                            w31 w31Var2 = this.b;
                            m31 m31Var = w31Var2.G;
                            m31Var.x1(false);
                            k31 k31Var2 = w31Var2.s;
                            k31Var2.x1(false);
                            w31Var2.J.a(false, true);
                            AndroidUtilities.updateVisibleRows(m31Var);
                            AndroidUtilities.updateVisibleRows(k31Var2);
                            break;
                        default:
                            this.b.a0.run(0, Boolean.FALSE);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(v31Var, w7.z5.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.v = null;
        }
        final int i14 = 2;
        ViewGroup viewGroup2 = viewGroup;
        m31 m31Var = new m31(activity, i10, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.j31
            public final /* synthetic */ w31 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i122;
                boolean z11;
                long j11;
                long j12;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j13;
                long j14;
                long j15;
                int i132 = i14;
                w31 w31Var = this.b;
                switch (i132) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w61 w61Var = (w61) obj2;
                        boolean z13 = w31Var.f;
                        int i142 = w31Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i142);
                        long j16 = w31Var.c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i142).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i142).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z14 = w31Var.e;
                        int i15 = q31.a;
                        h61 K = h61.K(q31.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z14;
                        K.L(w31Var.V == 0);
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
                                if (w31Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((h61) hg.c.g(1, arrayList)).y |= 8;
                                        }
                                        w61Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        w61Var.M();
                                        z15 = true;
                                    }
                                    h61 K2 = h61.K(q31.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic2.id;
                                    K2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        K2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        K2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j18 = w31Var.V;
                                    if (z14) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.id;
                                    }
                                    K2.L(j11 == j12);
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
                            w61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && w31Var.n) {
                            h61 K3 = h61.K(q31.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList.add(K3);
                            h61 K4 = h61.K(q31.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList.add(K4);
                            h61 K5 = h61.K(q31.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList.add(K5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                h61 K6 = h61.K(q31.class);
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
                        w31.b(w31Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        w61 w61Var2 = (w61) obj2;
                        boolean z17 = w31Var.e;
                        int i19 = w31Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = w31Var.c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z18 = w31Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = u31.a;
                            h61 K7 = h61.K(u31.class);
                            K7.d = 0;
                            topicsController = topicsController3;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z17;
                            K7.y = z18 ? 1 : 0;
                            K7.L(w31Var.V == 0);
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
                                if (w31Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        w61Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        w61Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = u31.a;
                                    h61 K8 = h61.K(u31.class);
                                    K8.x = j19;
                                    K8.d = tL_forumTopic4.id;
                                    K8.G = tL_forumTopic4;
                                    if (z17) {
                                        j13 = j19;
                                        K8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        K8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = w31Var.V;
                                    if (z17) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.id;
                                    }
                                    K8.L(j14 == j15);
                                    arrayList2.add(K8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j19 = j13;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            w61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && w31Var.n) {
                            int i24 = u31.a;
                            h61 K9 = h61.K(u31.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList2.add(K9);
                            h61 K10 = h61.K(u31.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList2.add(K10);
                            h61 K11 = h61.K(u31.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList2.add(K11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = u31.a;
                                h61 K12 = h61.K(u31.class);
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
        }, new b31(this), new b31(this), d6Var);
        this.G = m31Var;
        final int i15 = 1;
        m31Var.C1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.j31
            public final /* synthetic */ w31 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i122;
                boolean z11;
                long j11;
                long j12;
                TopicsController topicsController;
                boolean z12;
                TLRPC.User user;
                long j13;
                long j14;
                long j15;
                int i132 = i15;
                w31 w31Var = this.b;
                switch (i132) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w61 w61Var = (w61) obj2;
                        boolean z13 = w31Var.f;
                        int i142 = w31Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i142);
                        long j16 = w31Var.c;
                        long j17 = -j16;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j17));
                        TLRPC.User user2 = MessagesController.getInstance(i142).getUser(Long.valueOf(j16));
                        TopicsController topicsController2 = MessagesController.getInstance(i142).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j17);
                        boolean z14 = w31Var.e;
                        int i152 = q31.a;
                        h61 K = h61.K(q31.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.q = z14;
                        K.L(w31Var.V == 0);
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
                                if (w31Var.e0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((h61) hg.c.g(1, arrayList)).y |= 8;
                                        }
                                        w61Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        w61Var.M();
                                        z15 = true;
                                    }
                                    h61 K2 = h61.K(q31.class);
                                    K2.x = j16;
                                    K2.d = tL_forumTopic2.id;
                                    K2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        K2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        K2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j18 = w31Var.V;
                                    if (z14) {
                                        j11 = j18;
                                        j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j11 = j18;
                                        j12 = tL_forumTopic2.id;
                                    }
                                    K2.L(j11 == j12);
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
                            w61Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j17) && w31Var.n) {
                            h61 K3 = h61.K(q31.class);
                            K3.d = -2;
                            K3.r = true;
                            arrayList.add(K3);
                            h61 K4 = h61.K(q31.class);
                            K4.d = -3;
                            K4.r = true;
                            arrayList.add(K4);
                            h61 K5 = h61.K(q31.class);
                            K5.d = -4;
                            K5.r = true;
                            arrayList.add(K5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                h61 K6 = h61.K(q31.class);
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
                        w31.b(w31Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        w61 w61Var2 = (w61) obj2;
                        boolean z17 = w31Var.e;
                        int i19 = w31Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j19 = w31Var.c;
                        long j20 = -j19;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j20));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j19));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j20);
                        boolean z18 = w31Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = u31.a;
                            h61 K7 = h61.K(u31.class);
                            K7.d = 0;
                            topicsController = topicsController3;
                            K7.B = 0L;
                            K7.G = null;
                            K7.q = z17;
                            K7.y = z18 ? 1 : 0;
                            K7.L(w31Var.V == 0);
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
                                if (w31Var.e0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        w61Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        w61Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = u31.a;
                                    h61 K8 = h61.K(u31.class);
                                    K8.x = j19;
                                    K8.d = tL_forumTopic4.id;
                                    K8.G = tL_forumTopic4;
                                    if (z17) {
                                        j13 = j19;
                                        K8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        K8.I = false;
                                    } else {
                                        j13 = j19;
                                    }
                                    long j21 = w31Var.V;
                                    if (z17) {
                                        j14 = j21;
                                        j15 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j14 = j21;
                                        j15 = tL_forumTopic4.id;
                                    }
                                    K8.L(j14 == j15);
                                    arrayList2.add(K8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j19 = j13;
                                }
                            }
                        } else {
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            w61Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j20) && w31Var.n) {
                            int i24 = u31.a;
                            h61 K9 = h61.K(u31.class);
                            K9.d = -2;
                            K9.r = true;
                            K9.e = false;
                            arrayList2.add(K9);
                            h61 K10 = h61.K(u31.class);
                            K10.d = -3;
                            K10.r = true;
                            K10.e = false;
                            arrayList2.add(K10);
                            h61 K11 = h61.K(u31.class);
                            K11.d = -4;
                            K11.r = true;
                            K11.e = false;
                            arrayList2.add(K11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = u31.a;
                                h61 K12 = h61.K(u31.class);
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
        m31Var.f3.r = false;
        m31Var.setClipToPadding(false);
        m31Var.setClipChildren(false);
        viewGroup2.addView(m31Var, w7.z5.d(-1, -1.0f, 119, 0.0f, isBotForumWithEditableTopics ? 90.0f : 48.0f, 0.0f, 0.0f));
        m31Var.j(new l31(this, 1));
        final int i16 = 0;
        ImageView i17 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f31
            public final /* synthetic */ w31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        w31 w31Var = this.b;
                        Boolean bool = w31Var.T;
                        boolean z10 = false;
                        if (bool == null ? !w31Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        w31Var.d(z10);
                        break;
                    case 1:
                        w31 w31Var2 = this.b;
                        m31 m31Var2 = w31Var2.G;
                        m31Var2.x1(false);
                        k31 k31Var2 = w31Var2.s;
                        k31Var2.x1(false);
                        w31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(m31Var2);
                        AndroidUtilities.updateVisibleRows(k31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.y = i17;
        final int i18 = 0;
        ImageView i19 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f31
            public final /* synthetic */ w31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        w31 w31Var = this.b;
                        Boolean bool = w31Var.T;
                        boolean z10 = false;
                        if (bool == null ? !w31Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        w31Var.d(z10);
                        break;
                    case 1:
                        w31 w31Var2 = this.b;
                        m31 m31Var2 = w31Var2.G;
                        m31Var2.x1(false);
                        k31 k31Var2 = w31Var2.s;
                        k31Var2.x1(false);
                        w31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(m31Var2);
                        AndroidUtilities.updateVisibleRows(k31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.E = i19;
        frameLayout.addView(i17, w7.z5.e(44, 36, 51));
        viewGroup2.addView(i19, w7.z5.e(64, 48, 51));
        final int i20 = 1;
        ImageView i21 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f31
            public final /* synthetic */ w31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        w31 w31Var = this.b;
                        Boolean bool = w31Var.T;
                        boolean z10 = false;
                        if (bool == null ? !w31Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        w31Var.d(z10);
                        break;
                    case 1:
                        w31 w31Var2 = this.b;
                        m31 m31Var2 = w31Var2.G;
                        m31Var2.x1(false);
                        k31 k31Var2 = w31Var2.s;
                        k31Var2.x1(false);
                        w31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(m31Var2);
                        AndroidUtilities.updateVisibleRows(k31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.w = i21;
        final int i22 = 1;
        ImageView i23 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f31
            public final /* synthetic */ w31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i22) {
                    case 0:
                        w31 w31Var = this.b;
                        Boolean bool = w31Var.T;
                        boolean z10 = false;
                        if (bool == null ? !w31Var.Q : !bool.booleanValue()) {
                            z10 = true;
                        }
                        w31Var.d(z10);
                        break;
                    case 1:
                        w31 w31Var2 = this.b;
                        m31 m31Var2 = w31Var2.G;
                        m31Var2.x1(false);
                        k31 k31Var2 = w31Var2.s;
                        k31Var2.x1(false);
                        w31Var2.J.a(false, true);
                        AndroidUtilities.updateVisibleRows(m31Var2);
                        AndroidUtilities.updateVisibleRows(k31Var2);
                        break;
                    default:
                        this.b.a0.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.x = i23;
        frameLayout.addView(i21, w7.z5.e(44, 36, 51));
        viewGroup2.addView(i23, w7.z5.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j10, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.q.w("topicssidetabs", j3, mainSettings, false)) {
            this.R = 1.0f;
            this.Q = true;
        }
        boolean w10 = org.telegram.messenger.q.w("topicssidetabsb", j3, mainSettings, false);
        this.P = w10;
        i19.setImageResource(w10 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        f(false);
        g();
        n();
        o();
    }

    public static void a(w31 w31Var, h61 h61Var) {
        if (w31Var.e) {
            Utilities.Callback2 callback2 = w31Var.c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(h61Var.B), Boolean.FALSE);
                return;
            }
            return;
        }
        if (h61Var.B == -2) {
            Runnable runnable = w31Var.b0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = w31Var.a0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf(h61Var.d), Boolean.FALSE);
        }
    }

    public static void b(w31 w31Var, ArrayList arrayList) {
        long j3 = w31Var.c;
        TopicsController topicsController = MessagesController.getInstance(w31Var.b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = com.google.android.gms.internal.vision.e2.e(((h61) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j10 = -j3;
        topicsController.reorderPinnedTopics(j10, arrayList2);
        topicsController.sortTopics(j10, false);
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    public static boolean c(final w31 w31Var, h61 h61Var, View view) {
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        final int i11;
        byte b10;
        final b80 b80Var;
        boolean z10;
        ?? r62;
        b80 b80Var2;
        org.telegram.ui.ActionBar.d6 d6Var2 = w31Var.d;
        org.telegram.ui.yn ynVar = w31Var.h;
        long j3 = w31Var.c;
        int i12 = w31Var.b;
        final int i13 = 0;
        if (w31Var.G.j3 || w31Var.s.j3) {
            return false;
        }
        Object obj = h61Var.G;
        if (!(obj instanceof TLRPC.TL_forumTopic)) {
            return false;
        }
        final TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
        MessagesController messagesController = MessagesController.getInstance(i12);
        TLRPC.Chat chat = j3 < 0 ? messagesController.getChat(Long.valueOf(-j3)) : null;
        TLRPC.User user = j3 > 0 ? messagesController.getUser(Long.valueOf(j3)) : null;
        final b80 I = b80.I(ynVar, view);
        if (ChatObject.isMonoForum(chat)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i12, chat)) {
                return false;
            }
            TLRPC.Chat chat2 = chat;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new ai.q8(w31Var, I, peerDialogId, chat2, 29), false);
            long j10 = chat2.id;
            if (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(i12, chat2)) {
                long j11 = chat2.linked_monoforum_id;
                if (j11 != 0) {
                    j10 = j11;
                }
            }
            TLRPC.Chat chat3 = MessagesController.getInstance(i12).getChat(Long.valueOf(j10));
            TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
            if (user2 == null || !ChatObject.canBlockUsers(chat3)) {
                b80Var2 = I;
                i10 = 8;
            } else {
                I.c(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), null, false);
                org.telegram.ui.ActionBar.f1 y3 = I.y();
                i10 = 8;
                y3.setVisibility(8);
                b80Var2 = I;
                MessagesController.getInstance(i12).checkIsInChat(true, chat3, user2, new c31(w31Var, y3, I, j10, user2, chat3));
            }
            b80Var = b80Var2;
            d6Var = d6Var2;
            r62 = 1;
            i11 = 2;
            b10 = 0;
        } else {
            TLRPC.Chat chat4 = chat;
            if (ChatObject.canManageTopics(chat4) || UserObject.isBotForumWithEditableTopics(user)) {
                boolean z11 = tL_forumTopic.pinned;
                I.c(z11 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z11 ? R.string.DialogUnpin : R.string.DialogPin), new bo0(w31Var, I, messagesController, tL_forumTopic), false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new d31(w31Var, i13), false);
                }
            }
            if (ChatObject.canManageTopics(chat4) || UserObject.isBotForumWithEditableTopics(user)) {
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(w31Var) { // from class: org.telegram.ui.Components.e31
                    public final /* synthetic */ w31 b;

                    {
                        this.b = w31Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z12;
                        int i14 = i13;
                        w31 w31Var2 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        b80 b80Var3 = I;
                        switch (i14) {
                            case 0:
                                b80Var3.u();
                                w31Var2.h.presentFragment(se1.Z(-w31Var2.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                w31Var2.getClass();
                                b80Var3.u();
                                MessagesController.getInstance(w31Var2.b).getTopicsController().toggleCloseTopic(-w31Var2.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                b80Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                uh uhVar = new uh(13);
                                w31 w31Var3 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w31Var3.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j12 = w31Var3.V;
                                if (hashSet.size() == 1) {
                                    z12 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(w31Var3.b).getTopicsController().findTopic(-w31Var3.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z12 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ze(w31Var3, arrayList, j12, hashSet, uhVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ru(28));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, z12));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            long j12 = w31Var.c;
            long j13 = tL_forumTopic.id;
            int currentAccount = ynVar.getCurrentAccount();
            org.telegram.ui.ActionBar.d6 resourceProvider = ynVar.getResourceProvider();
            no noVar = new no(I, currentAccount, j12, j13, ynVar, resourceProvider);
            b80 J = I.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.hu0(I, 25), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.ge(I, currentAccount, j12, j13, J, ynVar, resourceProvider), false);
            org.telegram.ui.ActionBar.f1 y10 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ai.c9(I, resourceProvider, currentAccount, noVar, 17), false);
            d6Var = d6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new org.telegram.messenger.t2(I, j12, j13, ynVar, resourceProvider, 7), false);
            J.c(0, "", new ai.p0(I, currentAccount, j12, j13, ynVar, resourceProvider), false);
            new org.telegram.messenger.n9(currentAccount, j12, j13, J.y(), y10).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j3, tL_forumTopic.id);
            i10 = 8;
            i11 = 2;
            b10 = 0;
            b80Var = I;
            b80Var.c(isDialogMuted ? R.drawable.msg_unmute : R.drawable.msg_mute, LocaleController.getString(isDialogMuted ? R.string.Unmute : R.string.Mute), new ai.m3(w31Var, messagesController, tL_forumTopic, I, J, 25), false);
            if (!ChatObject.canManageTopic(i12, chat4, tL_forumTopic) || UserObject.isBotForum(user)) {
                z10 = true;
            } else {
                boolean z12 = tL_forumTopic.closed;
                int i14 = z12 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close;
                String string = LocaleController.getString(z12 ? R.string.RestartTopic : R.string.CloseTopic);
                z10 = true;
                final boolean z13 = true ? 1 : 0;
                b80Var.c(i14, string, new Runnable(w31Var) { // from class: org.telegram.ui.Components.e31
                    public final /* synthetic */ w31 b;

                    {
                        this.b = w31Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z122;
                        int i142 = z13;
                        w31 w31Var2 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        b80 b80Var3 = b80Var;
                        switch (i142) {
                            case 0:
                                b80Var3.u();
                                w31Var2.h.presentFragment(se1.Z(-w31Var2.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                w31Var2.getClass();
                                b80Var3.u();
                                MessagesController.getInstance(w31Var2.b).getTopicsController().toggleCloseTopic(-w31Var2.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                b80Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                uh uhVar = new uh(13);
                                w31 w31Var3 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w31Var3.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = w31Var3.V;
                                if (hashSet.size() == 1) {
                                    z122 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(w31Var3.b).getTopicsController().findTopic(-w31Var3.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z122 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ze(w31Var3, arrayList, j122, hashSet, uhVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ru(28));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, z122));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            r62 = z10;
            if (ChatObject.canDeleteTopic(i12, chat4, tL_forumTopic)) {
                b80Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", z10 ? 1 : 0), new Runnable(w31Var) { // from class: org.telegram.ui.Components.e31
                    public final /* synthetic */ w31 b;

                    {
                        this.b = w31Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z122;
                        int i142 = i11;
                        w31 w31Var2 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        b80 b80Var3 = b80Var;
                        switch (i142) {
                            case 0:
                                b80Var3.u();
                                w31Var2.h.presentFragment(se1.Z(-w31Var2.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                w31Var2.getClass();
                                b80Var3.u();
                                MessagesController.getInstance(w31Var2.b).getTopicsController().toggleCloseTopic(-w31Var2.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                b80Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                uh uhVar = new uh(13);
                                w31 w31Var3 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w31Var3.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.R = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = w31Var3.V;
                                if (hashSet.size() == 1) {
                                    z122 = false;
                                    b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(w31Var3.b).getTopicsController().findTopic(-w31Var3.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z122 = false;
                                    b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ze(w31Var3, arrayList, j122, hashSet, uhVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ru(28));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, z122));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                r62 = z10;
            }
        }
        if (view instanceof r31) {
            fw fwVar = new fw(i11, b10);
            Paint paint = new Paint((int) r62);
            fwVar.c = paint;
            fwVar.b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, d6Var));
            b80Var.W(fwVar);
            b80Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, d6Var);
            float f7 = b10;
            float f10 = dp;
            float f11 = dp2;
            float[] fArr = new float[i10];
            fArr[b10] = f7;
            fArr[r62] = f7;
            fArr[i11] = f10;
            fArr[3] = f10;
            fArr[4] = f11;
            fArr[5] = f11;
            fArr[6] = f7;
            fArr[7] = f7;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(v02);
            b80Var.W(shapeDrawable);
        }
        b80Var.Z();
        return r62;
    }

    public static ImageView i(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        w7.b6.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        long j3 = this.c;
        int i10 = this.b;
        if (z10) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentResume(-j3);
        } else {
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentPause(-j3);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        }
    }

    @Override // le.d
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        n();
    }

    public final void d(boolean z10) {
        if (this.Q == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.S) {
                this.T = Boolean.valueOf(z10);
                return;
            }
        }
        if (!z10) {
            this.P = !this.P;
        }
        this.Q = z10;
        this.S = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, z10 ? 1.0f : 0.0f);
        this.U = ofFloat;
        ofFloat.addUpdateListener(new v70(this, 28));
        this.U.addListener(new n31(this, z10));
        this.U.setInterpolator(ji.n.V);
        this.U.setDuration(250L);
        this.U.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j3 = this.c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() != (-j3)) {
                return;
            }
            o();
        } else {
            if (i10 != NotificationCenter.updateInterfaces || (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) <= 0) {
                return;
            }
            MessagesController.getInstance(this.b).getTopicsController().sortTopics(-j3, false);
            o();
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        canvas.save();
        if (view == this.F) {
            canvas.clipPath(this.K.l.k);
        }
        if (view == this.r) {
            canvas.clipPath(this.L.l.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        FrameLayout frameLayout = this.F;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.M + this.N);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void f(boolean z10) {
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.b).getTopicsController().getTopics(-this.c);
        this.a.a((topics == null || topics.isEmpty() || this.d0) ? false : true, z10);
    }

    public final void g() {
        le.b bVar = this.J;
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

    public s31 getCurrentTabsPosition() {
        return this.Q ? s31.b : this.P ? s31.c : s31.a;
    }

    public float getSideMenuT() {
        return this.R * this.a.e;
    }

    public final void h() {
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.R);
        FrameLayout frameLayout = this.r;
        frameLayout.setAlpha(lerp);
        frameLayout.setVisibility((1.0f - this.R) * this.a.e > 0.0f ? 0 : 8);
        if (this.P) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.M) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(s31.c)));
        } else {
            frameLayout.setTranslationY(this.N + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(s31.a)));
        }
    }

    public final float j(s31 s31Var) {
        float f7;
        float f10 = this.a.e;
        if (s31Var == s31.b) {
            f7 = this.R;
        } else {
            if ((s31Var != s31.a || this.P) && !(s31Var == s31.c && this.P)) {
                return 0.0f;
            }
            f7 = 1.0f - this.R;
        }
        return f7 * f10;
    }

    public final boolean k() {
        if (this.R <= 0.5f) {
            int i10 = 0;
            while (true) {
                k31 k31Var = this.s;
                if (i10 >= k31Var.getChildCount()) {
                    break;
                }
                h61 G = k31Var.f3.G(RecyclerView.R(k31Var.getChildAt(i10)));
                if (G != null && G.r) {
                    return true;
                }
                i10++;
            }
        } else {
            int i11 = 0;
            while (true) {
                m31 m31Var = this.G;
                if (i11 >= m31Var.getChildCount()) {
                    break;
                }
                h61 G2 = m31Var.f3.G(RecyclerView.R(m31Var.getChildAt(i11)));
                if (G2 != null && G2.r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void l() {
        TopicsController topicsController = MessagesController.getInstance(this.b).getTopicsController();
        long j3 = this.c;
        if (topicsController.endIsReached(-j3)) {
            return;
        }
        topicsController.loadTopics(-j3);
    }

    public final void m(long j3, boolean z10) {
        if (this.e) {
            Utilities.Callback2 callback2 = this.c0;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j3), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.a0;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j3), Boolean.valueOf(z10));
        }
    }

    public final void n() {
        org.telegram.ui.qe qeVar = this.O;
        if (qeVar != null) {
            qeVar.run();
        }
        h();
        float j3 = j(s31.b);
        float lerp = AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j3);
        FrameLayout frameLayout = this.F;
        frameLayout.setTranslationX(lerp);
        frameLayout.setVisibility(j3 <= 0.0f ? 8 : 0);
        int i10 = org.telegram.ui.ActionBar.i6.z6;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        int d = i0.a.d(1.0f - this.R, v02, org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.y.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.E.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.R, org.telegram.ui.ActionBar.i6.v0(i10, d6Var), org.telegram.ui.ActionBar.i6.v0(i11, d6Var)), mode));
        this.w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, d6Var), mode));
        this.x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, d6Var), mode));
        invalidate();
    }

    public final void o() {
        f(true);
        k31 k31Var = this.s;
        boolean canScrollHorizontally = k31Var.canScrollHorizontally(-1);
        k31Var.f3.N(true);
        if (!canScrollHorizontally) {
            k31Var.v0(0);
        }
        m31 m31Var = this.G;
        boolean canScrollVertically = m31Var.canScrollVertically(-1);
        m31Var.f3.N(true);
        if (!canScrollVertically) {
            m31Var.v0(0);
        }
        AndroidUtilities.runOnUIThread(new d31(this, 1));
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
        h();
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.d0 != z10) {
            this.d0 = z10;
            f(true);
        }
    }

    public void setCurrentTopic(long j3) {
        this.V = j3;
        k31 k31Var = this.s;
        k31Var.f3.N(true);
        k31Var.invalidate();
        this.G.f3.N(true);
        v31 v31Var = this.v;
        if (v31Var != null) {
            v31Var.c(true, false, j3 == 0);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.c0 = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.b0 = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.a0 = callback2;
    }

    public void setSideMenuBackgroundDrawable(ch.d dVar) {
        this.K = dVar;
        dVar.y(AndroidUtilities.dp(16.0f));
        this.K.x(AndroidUtilities.dp(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f7) {
        this.M = f7;
        h();
        e();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f7) {
        this.N = f7;
        this.F.setTranslationY(f7);
        h();
        e();
        invalidate();
    }

    public void setTopMenuBackgroundDrawable(ch.d dVar) {
        this.L = dVar;
        dVar.y(AndroidUtilities.dp(18.0f));
        this.L.x(AndroidUtilities.dp(7.0f));
    }

    @Override // le.d
    public final /* synthetic */ void V(float f7, int i10) {
    }
}
