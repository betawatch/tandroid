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
import org.telegram.ui.ie1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x21 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public static final /* synthetic */ int c0 = 0;
    public final ImageView B;
    public final FrameLayout C;
    public final n21 D;
    public long E;
    public long F;
    public final xd.a G;
    public qg.b H;
    public qg.b I;
    public float J;
    public float K;
    public org.telegram.ui.le L;
    public boolean M;
    public boolean N;
    public float O;
    public boolean P;
    public Boolean Q;
    public ValueAnimator R;
    public long S;
    public boolean T;
    public Utilities.Callback2 U;
    public Runnable V;
    public Utilities.Callback2 W;
    public final xd.a a;
    public boolean a0;
    public final int b;
    public final HashSet b0;
    public final long c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final boolean e;
    public final boolean f;
    public final org.telegram.ui.xn h;
    public final boolean n;
    public final FrameLayout r;
    public final l21 s;
    public final w21 v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;

    /* JADX WARN: Type inference failed for: r3v9, types: [org.telegram.ui.Components.k21] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.k21] */
    public x21(Activity activity, org.telegram.ui.xn xnVar, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        ViewGroup viewGroup;
        pr prVar = pr.h;
        this.a = new xd.a(0, this, prVar, 380L, true);
        this.G = new xd.a(0, new f21(this), prVar, 320L, false);
        this.O = 0.0f;
        this.b0 = new HashSet();
        this.h = xnVar;
        this.b = i10;
        this.c = j10;
        this.d = g6Var;
        long j11 = -j10;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        this.f = isBotForumWithEditableTopics;
        this.n = !org.telegram.messenger.y3.v("topics_end_reached_", j11, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.r = frameLayout;
        addView(frameLayout, k7.c6.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.C = frameLayout2;
        addView(frameLayout2, k7.c6.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        final int i11 = 0;
        l21 l21Var = new l21(this, activity, i10, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.k21
            public final /* synthetic */ x21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z4;
                int i12;
                boolean z10;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z11;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i13 = i11;
                x21 x21Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        x51 x51Var = (x51) obj2;
                        boolean z12 = x21Var.f;
                        int i14 = x21Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = x21Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z13 = x21Var.e;
                        int i15 = r21.a;
                        j51 J = j51.J(r21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z13;
                        J.K(x21Var.S == 0);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z14 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z12) {
                                    i12 = i17;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (x21Var.b0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z15 = tL_forumTopic2.pinned;
                                    if (!z15 && z14) {
                                        if (!arrayList.isEmpty()) {
                                            ((j51) l.d.i(1, arrayList)).y |= 8;
                                        }
                                        x51Var.L();
                                        z14 = false;
                                    } else if (z15 && !z14) {
                                        x51Var.M();
                                        z14 = true;
                                    }
                                    j51 J2 = j51.J(r21.class);
                                    J2.x = j17;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z13) {
                                        z10 = z14;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z10 = z14;
                                    }
                                    long j19 = x21Var.S;
                                    if (z13) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    J2.K(j12 == j13);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i12;
                                    z14 = z10;
                                }
                            }
                            z4 = z14;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            x51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && x21Var.n) {
                            j51 J3 = j51.J(r21.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            j51 J4 = j51.J(r21.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            j51 J5 = j51.J(r21.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z12 && !z13) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                j51 J6 = j51.J(r21.class);
                                J6.d = -2;
                                J6.B = -2L;
                                J6.G = null;
                                arrayList.add(J6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        x21.b(x21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        x51 x51Var2 = (x51) obj2;
                        boolean z16 = x21Var.e;
                        int i19 = x21Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = x21Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z17 = x21Var.f;
                        if (z17) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = v21.a;
                            j51 J7 = j51.J(v21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z16;
                            J7.y = z17 ? 1 : 0;
                            J7.K(x21Var.S == 0);
                            arrayList2.add(J7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z11 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z17) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (x21Var.b0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z18 = tL_forumTopic4.pinned;
                                    if (!z18 && z11) {
                                        x51Var2.L();
                                        z11 = false;
                                    } else if (z18 && !z11) {
                                        x51Var2.M();
                                        z11 = true;
                                    }
                                    int i23 = v21.a;
                                    j51 J8 = j51.J(v21.class);
                                    J8.x = j20;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z16) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = x21Var.S;
                                    if (z16) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.id;
                                    }
                                    J8.K(j15 == j16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z11) {
                            x51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && x21Var.n) {
                            int i24 = v21.a;
                            j51 J9 = j51.J(v21.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            j51 J10 = j51.J(v21.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            j51 J11 = j51.J(v21.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z17 && !z16) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = v21.a;
                                j51 J12 = j51.J(v21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.q = false;
                                arrayList2.add(J12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new f21(this), new f21(this), g6Var);
        this.s = l21Var;
        final int i12 = 1;
        l21Var.B1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.k21
            public final /* synthetic */ x21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z4;
                int i122;
                boolean z10;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z11;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i13 = i12;
                x21 x21Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        x51 x51Var = (x51) obj2;
                        boolean z12 = x21Var.f;
                        int i14 = x21Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = x21Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z13 = x21Var.e;
                        int i15 = r21.a;
                        j51 J = j51.J(r21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z13;
                        J.K(x21Var.S == 0);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z14 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z12) {
                                    i122 = i17;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i18;
                                        i16 = i122;
                                    }
                                } else {
                                    i122 = i17;
                                }
                                if (x21Var.b0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z15 = tL_forumTopic2.pinned;
                                    if (!z15 && z14) {
                                        if (!arrayList.isEmpty()) {
                                            ((j51) l.d.i(1, arrayList)).y |= 8;
                                        }
                                        x51Var.L();
                                        z14 = false;
                                    } else if (z15 && !z14) {
                                        x51Var.M();
                                        z14 = true;
                                    }
                                    j51 J2 = j51.J(r21.class);
                                    J2.x = j17;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z13) {
                                        z10 = z14;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z10 = z14;
                                    }
                                    long j19 = x21Var.S;
                                    if (z13) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    J2.K(j12 == j13);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i122;
                                    z14 = z10;
                                }
                            }
                            z4 = z14;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            x51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && x21Var.n) {
                            j51 J3 = j51.J(r21.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            j51 J4 = j51.J(r21.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            j51 J5 = j51.J(r21.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z12 && !z13) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                j51 J6 = j51.J(r21.class);
                                J6.d = -2;
                                J6.B = -2L;
                                J6.G = null;
                                arrayList.add(J6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        x21.b(x21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        x51 x51Var2 = (x51) obj2;
                        boolean z16 = x21Var.e;
                        int i19 = x21Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = x21Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z17 = x21Var.f;
                        if (z17) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = v21.a;
                            j51 J7 = j51.J(v21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z16;
                            J7.y = z17 ? 1 : 0;
                            J7.K(x21Var.S == 0);
                            arrayList2.add(J7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z11 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z17) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (x21Var.b0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z18 = tL_forumTopic4.pinned;
                                    if (!z18 && z11) {
                                        x51Var2.L();
                                        z11 = false;
                                    } else if (z18 && !z11) {
                                        x51Var2.M();
                                        z11 = true;
                                    }
                                    int i23 = v21.a;
                                    j51 J8 = j51.J(v21.class);
                                    J8.x = j20;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z16) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = x21Var.S;
                                    if (z16) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.id;
                                    }
                                    J8.K(j15 == j16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z11) {
                            x51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && x21Var.n) {
                            int i24 = v21.a;
                            j51 J9 = j51.J(v21.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            j51 J10 = j51.J(v21.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            j51 J11 = j51.J(v21.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z17 && !z16) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = v21.a;
                                j51 J12 = j51.J(v21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.q = false;
                                arrayList2.add(J12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        l21Var.setWillNotDraw(false);
        l21Var.V2.r = false;
        l21Var.getContext();
        org.telegram.ui.cr crVar = new org.telegram.ui.cr((ViewGroup) l21Var, 4);
        l21Var.U2 = crVar;
        l21Var.setLayoutManager(crVar);
        frameLayout.addView(l21Var, k7.c6.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        l21Var.j(new m21(this, 0));
        if (isBotForumWithEditableTopics) {
            w21 w21Var = new w21(activity, i10, g6Var);
            this.v = w21Var;
            w21Var.c(true, false, this.S == 0);
            final int i13 = 2;
            w21Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.i21
                public final /* synthetic */ x21 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            x21 x21Var = this.b;
                            Boolean bool = x21Var.Q;
                            boolean z4 = false;
                            if (bool == null ? !x21Var.N : !bool.booleanValue()) {
                                z4 = true;
                            }
                            x21Var.d(z4);
                            break;
                        case 1:
                            x21 x21Var2 = this.b;
                            n21 n21Var = x21Var2.D;
                            n21Var.w1(false);
                            l21 l21Var2 = x21Var2.s;
                            l21Var2.w1(false);
                            x21Var2.G.a(false, true);
                            AndroidUtilities.updateVisibleRows(n21Var);
                            AndroidUtilities.updateVisibleRows(l21Var2);
                            break;
                        default:
                            this.b.U.run(0, Boolean.FALSE);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(w21Var, k7.c6.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.v = null;
        }
        final int i14 = 2;
        ViewGroup viewGroup2 = viewGroup;
        n21 n21Var = new n21(activity, i10, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.k21
            public final /* synthetic */ x21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z4;
                int i122;
                boolean z10;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z11;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i132 = i14;
                x21 x21Var = this.b;
                switch (i132) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        x51 x51Var = (x51) obj2;
                        boolean z12 = x21Var.f;
                        int i142 = x21Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i142);
                        long j17 = x21Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i142).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i142).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z13 = x21Var.e;
                        int i15 = r21.a;
                        j51 J = j51.J(r21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z13;
                        J.K(x21Var.S == 0);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z14 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z12) {
                                    i122 = i17;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i18;
                                        i16 = i122;
                                    }
                                } else {
                                    i122 = i17;
                                }
                                if (x21Var.b0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z15 = tL_forumTopic2.pinned;
                                    if (!z15 && z14) {
                                        if (!arrayList.isEmpty()) {
                                            ((j51) l.d.i(1, arrayList)).y |= 8;
                                        }
                                        x51Var.L();
                                        z14 = false;
                                    } else if (z15 && !z14) {
                                        x51Var.M();
                                        z14 = true;
                                    }
                                    j51 J2 = j51.J(r21.class);
                                    J2.x = j17;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z13) {
                                        z10 = z14;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z10 = z14;
                                    }
                                    long j19 = x21Var.S;
                                    if (z13) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    J2.K(j12 == j13);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i122;
                                    z14 = z10;
                                }
                            }
                            z4 = z14;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            x51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && x21Var.n) {
                            j51 J3 = j51.J(r21.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            j51 J4 = j51.J(r21.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            j51 J5 = j51.J(r21.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z12 && !z13) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                j51 J6 = j51.J(r21.class);
                                J6.d = -2;
                                J6.B = -2L;
                                J6.G = null;
                                arrayList.add(J6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        x21.b(x21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        x51 x51Var2 = (x51) obj2;
                        boolean z16 = x21Var.e;
                        int i19 = x21Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = x21Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z17 = x21Var.f;
                        if (z17) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = v21.a;
                            j51 J7 = j51.J(v21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z16;
                            J7.y = z17 ? 1 : 0;
                            J7.K(x21Var.S == 0);
                            arrayList2.add(J7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z11 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z17) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (x21Var.b0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z18 = tL_forumTopic4.pinned;
                                    if (!z18 && z11) {
                                        x51Var2.L();
                                        z11 = false;
                                    } else if (z18 && !z11) {
                                        x51Var2.M();
                                        z11 = true;
                                    }
                                    int i23 = v21.a;
                                    j51 J8 = j51.J(v21.class);
                                    J8.x = j20;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z16) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = x21Var.S;
                                    if (z16) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.id;
                                    }
                                    J8.K(j15 == j16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z11) {
                            x51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && x21Var.n) {
                            int i24 = v21.a;
                            j51 J9 = j51.J(v21.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            j51 J10 = j51.J(v21.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            j51 J11 = j51.J(v21.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z17 && !z16) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = v21.a;
                                j51 J12 = j51.J(v21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.q = false;
                                arrayList2.add(J12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, new f21(this), new f21(this), g6Var);
        this.D = n21Var;
        final int i15 = 1;
        n21Var.B1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.k21
            public final /* synthetic */ x21 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                boolean z4;
                int i122;
                boolean z10;
                long j12;
                long j13;
                TopicsController topicsController;
                boolean z11;
                TLRPC.User user;
                long j14;
                long j15;
                long j16;
                int i132 = i15;
                x21 x21Var = this.b;
                switch (i132) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        x51 x51Var = (x51) obj2;
                        boolean z12 = x21Var.f;
                        int i142 = x21Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i142);
                        long j17 = x21Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i142).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i142).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z13 = x21Var.e;
                        int i152 = r21.a;
                        j51 J = j51.J(r21.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z13;
                        J.K(x21Var.S == 0);
                        arrayList.add(J);
                        if (topics != null) {
                            int size = topics.size();
                            int i16 = 0;
                            boolean z14 = false;
                            while (i16 < size) {
                                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                                int i18 = size;
                                if (z12) {
                                    i122 = i17;
                                    if (tL_forumTopic2.id == 1) {
                                        size = i18;
                                        i16 = i122;
                                    }
                                } else {
                                    i122 = i17;
                                }
                                if (x21Var.b0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z15 = tL_forumTopic2.pinned;
                                    if (!z15 && z14) {
                                        if (!arrayList.isEmpty()) {
                                            ((j51) l.d.i(1, arrayList)).y |= 8;
                                        }
                                        x51Var.L();
                                        z14 = false;
                                    } else if (z15 && !z14) {
                                        x51Var.M();
                                        z14 = true;
                                    }
                                    j51 J2 = j51.J(r21.class);
                                    J2.x = j17;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z13) {
                                        z10 = z14;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z10 = z14;
                                    }
                                    long j19 = x21Var.S;
                                    if (z13) {
                                        j12 = j19;
                                        j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                    } else {
                                        j12 = j19;
                                        j13 = tL_forumTopic2.id;
                                    }
                                    J2.K(j12 == j13);
                                    arrayList.add(J2);
                                    size = i18;
                                    i16 = i122;
                                    z14 = z10;
                                }
                            }
                            z4 = z14;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            x51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && x21Var.n) {
                            j51 J3 = j51.J(r21.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            j51 J4 = j51.J(r21.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            j51 J5 = j51.J(r21.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z12 && !z13) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                j51 J6 = j51.J(r21.class);
                                J6.d = -2;
                                J6.B = -2L;
                                J6.G = null;
                                arrayList.add(J6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ((Integer) obj).getClass();
                        x21.b(x21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        x51 x51Var2 = (x51) obj2;
                        boolean z16 = x21Var.e;
                        int i19 = x21Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = x21Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z17 = x21Var.f;
                        if (z17) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = v21.a;
                            j51 J7 = j51.J(v21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z16;
                            J7.y = z17 ? 1 : 0;
                            J7.K(x21Var.S == 0);
                            arrayList2.add(J7);
                        }
                        if (topics2 != null) {
                            int size2 = topics2.size();
                            z11 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                TLRPC.TL_forumTopic tL_forumTopic3 = topics2.get(i21);
                                i21++;
                                int i22 = size2;
                                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic3;
                                TLRPC.Chat chat3 = chat2;
                                if (z17) {
                                    user = user3;
                                    if (tL_forumTopic4.id == 1) {
                                        chat2 = chat3;
                                        size2 = i22;
                                        user3 = user;
                                    }
                                } else {
                                    user = user3;
                                }
                                if (x21Var.b0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z18 = tL_forumTopic4.pinned;
                                    if (!z18 && z11) {
                                        x51Var2.L();
                                        z11 = false;
                                    } else if (z18 && !z11) {
                                        x51Var2.M();
                                        z11 = true;
                                    }
                                    int i23 = v21.a;
                                    j51 J8 = j51.J(v21.class);
                                    J8.x = j20;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z16) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = x21Var.S;
                                    if (z16) {
                                        j15 = j22;
                                        j16 = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                    } else {
                                        j15 = j22;
                                        j16 = tL_forumTopic4.id;
                                    }
                                    J8.K(j15 == j16);
                                    arrayList2.add(J8);
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                    j20 = j14;
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z11) {
                            x51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && x21Var.n) {
                            int i24 = v21.a;
                            j51 J9 = j51.J(v21.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            j51 J10 = j51.J(v21.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            j51 J11 = j51.J(v21.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z17 && !z16) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = v21.a;
                                j51 J12 = j51.J(v21.class);
                                J12.d = -2;
                                J12.B = -2L;
                                J12.G = null;
                                J12.q = false;
                                arrayList2.add(J12);
                                break;
                            }
                        }
                        break;
                }
            }
        }, false);
        n21Var.V2.r = false;
        n21Var.setClipToPadding(false);
        n21Var.setClipChildren(false);
        viewGroup2.addView(n21Var, k7.c6.d(-1, -1.0f, 119, 0.0f, isBotForumWithEditableTopics ? 90.0f : 48.0f, 0.0f, 0.0f));
        n21Var.j(new m21(this, 1));
        final int i16 = 0;
        ImageView i17 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.i21
            public final /* synthetic */ x21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        x21 x21Var = this.b;
                        Boolean bool = x21Var.Q;
                        boolean z4 = false;
                        if (bool == null ? !x21Var.N : !bool.booleanValue()) {
                            z4 = true;
                        }
                        x21Var.d(z4);
                        break;
                    case 1:
                        x21 x21Var2 = this.b;
                        n21 n21Var2 = x21Var2.D;
                        n21Var2.w1(false);
                        l21 l21Var2 = x21Var2.s;
                        l21Var2.w1(false);
                        x21Var2.G.a(false, true);
                        AndroidUtilities.updateVisibleRows(n21Var2);
                        AndroidUtilities.updateVisibleRows(l21Var2);
                        break;
                    default:
                        this.b.U.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.y = i17;
        final int i18 = 0;
        ImageView i19 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.i21
            public final /* synthetic */ x21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        x21 x21Var = this.b;
                        Boolean bool = x21Var.Q;
                        boolean z4 = false;
                        if (bool == null ? !x21Var.N : !bool.booleanValue()) {
                            z4 = true;
                        }
                        x21Var.d(z4);
                        break;
                    case 1:
                        x21 x21Var2 = this.b;
                        n21 n21Var2 = x21Var2.D;
                        n21Var2.w1(false);
                        l21 l21Var2 = x21Var2.s;
                        l21Var2.w1(false);
                        x21Var2.G.a(false, true);
                        AndroidUtilities.updateVisibleRows(n21Var2);
                        AndroidUtilities.updateVisibleRows(l21Var2);
                        break;
                    default:
                        this.b.U.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.B = i19;
        frameLayout.addView(i17, k7.c6.e(44, 36, 51));
        viewGroup2.addView(i19, k7.c6.e(64, 48, 51));
        final int i20 = 1;
        ImageView i21 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.i21
            public final /* synthetic */ x21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        x21 x21Var = this.b;
                        Boolean bool = x21Var.Q;
                        boolean z4 = false;
                        if (bool == null ? !x21Var.N : !bool.booleanValue()) {
                            z4 = true;
                        }
                        x21Var.d(z4);
                        break;
                    case 1:
                        x21 x21Var2 = this.b;
                        n21 n21Var2 = x21Var2.D;
                        n21Var2.w1(false);
                        l21 l21Var2 = x21Var2.s;
                        l21Var2.w1(false);
                        x21Var2.G.a(false, true);
                        AndroidUtilities.updateVisibleRows(n21Var2);
                        AndroidUtilities.updateVisibleRows(l21Var2);
                        break;
                    default:
                        this.b.U.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.w = i21;
        final int i22 = 1;
        ImageView i23 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.i21
            public final /* synthetic */ x21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i22) {
                    case 0:
                        x21 x21Var = this.b;
                        Boolean bool = x21Var.Q;
                        boolean z4 = false;
                        if (bool == null ? !x21Var.N : !bool.booleanValue()) {
                            z4 = true;
                        }
                        x21Var.d(z4);
                        break;
                    case 1:
                        x21 x21Var2 = this.b;
                        n21 n21Var2 = x21Var2.D;
                        n21Var2.w1(false);
                        l21 l21Var2 = x21Var2.s;
                        l21Var2.w1(false);
                        x21Var2.G.a(false, true);
                        AndroidUtilities.updateVisibleRows(n21Var2);
                        AndroidUtilities.updateVisibleRows(l21Var2);
                        break;
                    default:
                        this.b.U.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.x = i23;
        frameLayout.addView(i21, k7.c6.e(44, 36, 51));
        viewGroup2.addView(i23, k7.c6.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j11, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.y3.v("topicssidetabs", j10, mainSettings, false)) {
            this.O = 1.0f;
            this.N = true;
        }
        boolean v = org.telegram.messenger.y3.v("topicssidetabsb", j10, mainSettings, false);
        this.M = v;
        i19.setImageResource(v ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        f(false);
        g();
        n();
        o();
    }

    public static void a(x21 x21Var, j51 j51Var) {
        if (x21Var.e) {
            Utilities.Callback2 callback2 = x21Var.W;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j51Var.B), Boolean.FALSE);
                return;
            }
            return;
        }
        if (j51Var.B == -2) {
            Runnable runnable = x21Var.V;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = x21Var.U;
        if (callback22 != null) {
            callback22.run(Integer.valueOf(j51Var.d), Boolean.FALSE);
        }
    }

    public static void b(x21 x21Var, ArrayList arrayList) {
        long j10 = x21Var.c;
        TopicsController topicsController = MessagesController.getInstance(x21Var.b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = org.telegram.ui.yh.d(((j51) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        topicsController.reorderPinnedTopics(j11, arrayList2);
        topicsController.sortTopics(j11, false);
    }

    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    public static boolean c(final x21 x21Var, j51 j51Var, View view) {
        TLRPC.Chat chat;
        final x21 x21Var2;
        org.telegram.ui.ActionBar.g6 g6Var;
        final int i10;
        ?? r11;
        byte b10;
        int i11;
        final q70 q70Var;
        q70 q70Var2;
        org.telegram.ui.ActionBar.g6 g6Var2 = x21Var.d;
        org.telegram.ui.xn xnVar = x21Var.h;
        long j10 = x21Var.c;
        int i12 = x21Var.b;
        if (x21Var.D.Z2 || x21Var.s.Z2) {
            return false;
        }
        Object obj = j51Var.G;
        if (!(obj instanceof TLRPC.TL_forumTopic)) {
            return false;
        }
        final TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
        MessagesController messagesController = MessagesController.getInstance(i12);
        TLRPC.Chat chat2 = j10 < 0 ? messagesController.getChat(Long.valueOf(-j10)) : null;
        TLRPC.User user = j10 > 0 ? messagesController.getUser(Long.valueOf(j10)) : null;
        final q70 I = q70.I(xnVar, view);
        if (ChatObject.isMonoForum(chat2)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i12, chat2)) {
                return false;
            }
            TLRPC.Chat chat3 = chat2;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new org.telegram.messenger.di(x21Var, I, peerDialogId, chat2, 4), false);
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
                q70Var2 = I;
                i11 = 8;
            } else {
                I.c(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), null, false);
                org.telegram.ui.ActionBar.g1 y10 = I.y();
                i11 = 8;
                y10.setVisibility(8);
                MessagesController messagesController2 = MessagesController.getInstance(i12);
                mh.o2 o2Var = new mh.o2(x21Var, y10, I, j11, user2, chat4);
                q70Var2 = I;
                messagesController2.checkIsInChat(true, chat4, user2, o2Var);
            }
            q70Var = q70Var2;
            g6Var = g6Var2;
            i10 = 2;
            r11 = 1;
            b10 = 0;
        } else {
            TLRPC.Chat chat5 = chat2;
            if (ChatObject.canManageTopics(chat5) || UserObject.isBotForumWithEditableTopics(user)) {
                boolean z4 = tL_forumTopic.pinned;
                int i13 = z4 ? R.drawable.msg_unpin : R.drawable.msg_pin;
                String string = LocaleController.getString(z4 ? R.string.DialogUnpin : R.string.DialogPin);
                int i14 = i13;
                chat = chat5;
                x21Var2 = x21Var;
                org.telegram.ui.ih ihVar = new org.telegram.ui.ih(x21Var2, I, messagesController, tL_forumTopic, 26);
                I = I;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                int i15 = 0;
                I.c(i14, string, ihVar, false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new g21(x21Var2, i15), false);
                }
            } else {
                x21Var2 = x21Var;
                chat = chat5;
            }
            if (ChatObject.canManageTopics(chat) || UserObject.isBotForumWithEditableTopics(user)) {
                final int i16 = 0;
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(x21Var2) { // from class: org.telegram.ui.Components.h21
                    public final /* synthetic */ x21 b;

                    {
                        this.b = x21Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10;
                        int i17 = i16;
                        x21 x21Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        q70 q70Var3 = I;
                        switch (i17) {
                            case 0:
                                q70Var3.u();
                                x21Var3.h.presentFragment(ie1.a0(-x21Var3.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                x21Var3.getClass();
                                q70Var3.u();
                                MessagesController.getInstance(x21Var3.b).getTopicsController().toggleCloseTopic(-x21Var3.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                q70Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                jc jcVar = new jc(16);
                                x21 x21Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                d2Var.O = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = x21Var4.S;
                                if (hashSet.size() == 1) {
                                    z10 = false;
                                    d2Var.Q = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(x21Var4.b).getTopicsController().findTopic(-x21Var4.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z10 = false;
                                    d2Var.Q = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mh.a3(x21Var4, arrayList, j13, hashSet, jcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh0(12));
                                d2Var.show();
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, z10));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            long j13 = x21Var2.c;
            long j14 = tL_forumTopic.id;
            int currentAccount = xnVar.getCurrentAccount();
            org.telegram.ui.ActionBar.g6 resourceProvider = xnVar.getResourceProvider();
            q70 q70Var3 = I;
            io ioVar = new io(q70Var3, currentAccount, j13, j14, xnVar, resourceProvider);
            q70 J = q70Var3.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.tt0(q70Var3, 25), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.le(q70Var3, currentAccount, j13, j14, J, xnVar, resourceProvider), false);
            org.telegram.ui.ActionBar.g1 y11 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new dg.u1(q70Var3, resourceProvider, currentAccount, ioVar, 16), false);
            g6Var = g6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new hg.s0(q70Var3, j13, j14, xnVar, resourceProvider, 8), false);
            J.c(0, "", new mh.u7(q70Var3, currentAccount, j13, j14, xnVar, resourceProvider), false);
            new org.telegram.messenger.t9(currentAccount, j13, j14, J.y(), y11).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j10, tL_forumTopic.id);
            int i17 = isDialogMuted ? R.drawable.msg_unmute : R.drawable.msg_mute;
            String string2 = LocaleController.getString(isDialogMuted ? R.string.Unmute : R.string.Mute);
            i10 = 2;
            r11 = 1;
            r11 = 1;
            b10 = 0;
            i11 = 8;
            ky0 ky0Var = new ky0(x21Var, messagesController, tL_forumTopic, q70Var3, J, 1);
            q70Var = q70Var3;
            q70Var.c(i17, string2, ky0Var, false);
            TLRPC.Chat chat6 = chat;
            if (ChatObject.canManageTopic(i12, chat6, tL_forumTopic) && !UserObject.isBotForum(user)) {
                boolean z10 = tL_forumTopic.closed;
                int i18 = z10 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close;
                String string3 = LocaleController.getString(z10 ? R.string.RestartTopic : R.string.CloseTopic);
                final int i19 = r11 == true ? 1 : 0;
                q70Var.c(i18, string3, new Runnable(x21Var) { // from class: org.telegram.ui.Components.h21
                    public final /* synthetic */ x21 b;

                    {
                        this.b = x21Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z102;
                        int i172 = i19;
                        x21 x21Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        q70 q70Var32 = q70Var;
                        switch (i172) {
                            case 0:
                                q70Var32.u();
                                x21Var3.h.presentFragment(ie1.a0(-x21Var3.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                x21Var3.getClass();
                                q70Var32.u();
                                MessagesController.getInstance(x21Var3.b).getTopicsController().toggleCloseTopic(-x21Var3.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                q70Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                jc jcVar = new jc(16);
                                x21 x21Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                d2Var.O = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = x21Var4.S;
                                if (hashSet.size() == 1) {
                                    z102 = false;
                                    d2Var.Q = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(x21Var4.b).getTopicsController().findTopic(-x21Var4.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z102 = false;
                                    d2Var.Q = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mh.a3(x21Var4, arrayList, j132, hashSet, jcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh0(12));
                                d2Var.show();
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, z102));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i12, chat6, tL_forumTopic)) {
                q70Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(x21Var) { // from class: org.telegram.ui.Components.h21
                    public final /* synthetic */ x21 b;

                    {
                        this.b = x21Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z102;
                        int i172 = i10;
                        x21 x21Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        q70 q70Var32 = q70Var;
                        switch (i172) {
                            case 0:
                                q70Var32.u();
                                x21Var3.h.presentFragment(ie1.a0(-x21Var3.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                x21Var3.getClass();
                                q70Var32.u();
                                MessagesController.getInstance(x21Var3.b).getTopicsController().toggleCloseTopic(-x21Var3.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                q70Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                jc jcVar = new jc(16);
                                x21 x21Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                d2Var.O = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = x21Var4.S;
                                if (hashSet.size() == 1) {
                                    z102 = false;
                                    d2Var.Q = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(x21Var4.b).getTopicsController().findTopic(-x21Var4.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z102 = false;
                                    d2Var.Q = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mh.a3(x21Var4, arrayList, j132, hashSet, jcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh0(12));
                                d2Var.show();
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, z102));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof s21) {
            yv yvVar = new yv(i10, b10);
            Paint paint = new Paint((int) r11);
            yvVar.c = paint;
            yvVar.b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, g6Var));
            q70Var.W(yvVar);
            q70Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var);
            float f10 = b10;
            float f11 = dp;
            float f12 = dp2;
            float[] fArr = new float[i11];
            fArr[b10] = f10;
            fArr[r11] = f10;
            fArr[i10] = f11;
            fArr[3] = f11;
            fArr[4] = f12;
            fArr[5] = f12;
            fArr[6] = f10;
            fArr[7] = f10;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(v02);
            q70Var.W(shapeDrawable);
        }
        q70Var.Z();
        return r11;
    }

    public static ImageView i(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        k7.e6.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z4) {
        if (this.T == z4) {
            return;
        }
        this.T = z4;
        long j10 = this.c;
        int i10 = this.b;
        if (z4) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentResume(-j10);
        } else {
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentPause(-j10);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        }
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        n();
    }

    public final void d(boolean z4) {
        if (this.N == z4) {
            return;
        }
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.P) {
                this.Q = Boolean.valueOf(z4);
                return;
            }
        }
        if (!z4) {
            this.M = !this.M;
        }
        this.N = z4;
        this.P = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.O, z4 ? 1.0f : 0.0f);
        this.R = ofFloat;
        ofFloat.addUpdateListener(new k70(this, 28));
        this.R.addListener(new o21(this, z4));
        this.R.setInterpolator(xh.n.V);
        this.R.setDuration(250L);
        this.R.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.topicsDidLoaded;
        long j10 = this.c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() != (-j10)) {
                return;
            }
            o();
        } else {
            if (i10 != NotificationCenter.updateInterfaces || (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) <= 0) {
                return;
            }
            MessagesController.getInstance(this.b).getTopicsController().sortTopics(-j10, false);
            o();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.C;
        if (frameLayout.getVisibility() == 0) {
            this.H.setBounds((int) frameLayout.getTranslationX(), (int) this.K, (int) (frameLayout.getTranslationX() + AndroidUtilities.dp(78.0f)), (int) (getMeasuredHeight() - this.J));
            this.H.draw(canvas);
        }
        FrameLayout frameLayout2 = this.r;
        if (frameLayout2.getVisibility() == 0) {
            this.I.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.I.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + AndroidUtilities.dp(50.0f)));
            this.I.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        canvas.save();
        if (view == this.C) {
            canvas.clipPath(this.H.h.k);
        }
        if (view == this.r) {
            canvas.clipPath(this.I.h.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        FrameLayout frameLayout = this.C;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.J + this.K);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void f(boolean z4) {
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.b).getTopicsController().getTopics(-this.c);
        this.a.a((topics == null || topics.isEmpty() || this.a0) ? false : true, z4);
    }

    public final void g() {
        xd.a aVar = this.G;
        float f10 = aVar.e;
        ImageView imageView = this.w;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView.setVisibility(f10 > 0.0f ? 0 : 8);
        ImageView imageView2 = this.x;
        imageView2.setAlpha(f10);
        imageView2.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView2.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        imageView2.setVisibility(f10 > 0.0f ? 0 : 8);
        float f11 = 1.0f - aVar.e;
        ImageView imageView3 = this.y;
        imageView3.setAlpha(f11);
        imageView3.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView3.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView3.setVisibility(f11 > 0.0f ? 0 : 8);
        ImageView imageView4 = this.B;
        imageView4.setAlpha(f11);
        imageView4.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView4.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView4.setVisibility(f11 > 0.0f ? 0 : 8);
    }

    public t21 getCurrentTabsPosition() {
        return this.N ? t21.b : this.M ? t21.c : t21.a;
    }

    public float getSideMenuT() {
        return this.O * this.a.e;
    }

    public final void h() {
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.O);
        FrameLayout frameLayout = this.r;
        frameLayout.setAlpha(lerp);
        frameLayout.setVisibility((1.0f - this.O) * this.a.e > 0.0f ? 0 : 8);
        if (this.M) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.J) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(t21.c)));
        } else {
            frameLayout.setTranslationY(this.K + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(t21.a)));
        }
    }

    public final float j(t21 t21Var) {
        float f10;
        float f11 = this.a.e;
        if (t21Var == t21.b) {
            f10 = this.O;
        } else {
            if ((t21Var != t21.a || this.M) && !(t21Var == t21.c && this.M)) {
                return 0.0f;
            }
            f10 = 1.0f - this.O;
        }
        return f10 * f11;
    }

    public final boolean k() {
        if (this.O <= 0.5f) {
            int i10 = 0;
            while (true) {
                l21 l21Var = this.s;
                if (i10 >= l21Var.getChildCount()) {
                    break;
                }
                j51 G = l21Var.V2.G(RecyclerView.R(l21Var.getChildAt(i10)));
                if (G != null && G.r) {
                    return true;
                }
                i10++;
            }
        } else {
            int i11 = 0;
            while (true) {
                n21 n21Var = this.D;
                if (i11 >= n21Var.getChildCount()) {
                    break;
                }
                j51 G2 = n21Var.V2.G(RecyclerView.R(n21Var.getChildAt(i11)));
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
        long j10 = this.c;
        if (topicsController.endIsReached(-j10)) {
            return;
        }
        topicsController.loadTopics(-j10);
    }

    public final void m(long j10, boolean z4) {
        if (this.e) {
            Utilities.Callback2 callback2 = this.W;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j10), Boolean.valueOf(z4));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.U;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j10), Boolean.valueOf(z4));
        }
    }

    public final void n() {
        org.telegram.ui.le leVar = this.L;
        if (leVar != null) {
            leVar.run();
        }
        h();
        float j10 = j(t21.b);
        float lerp = AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j10);
        FrameLayout frameLayout = this.C;
        frameLayout.setTranslationX(lerp);
        frameLayout.setVisibility(j10 <= 0.0f ? 8 : 0);
        int i10 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        int d = i0.a.d(1.0f - this.O, v02, org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.y.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.B.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.O, org.telegram.ui.ActionBar.k6.v0(i10, g6Var), org.telegram.ui.ActionBar.k6.v0(i11, g6Var)), mode));
        this.w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), mode));
        this.x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), mode));
        invalidate();
    }

    public final void o() {
        f(true);
        l21 l21Var = this.s;
        boolean canScrollHorizontally = l21Var.canScrollHorizontally(-1);
        l21Var.V2.N(true);
        if (!canScrollHorizontally) {
            l21Var.u0(0);
        }
        n21 n21Var = this.D;
        boolean canScrollVertically = n21Var.canScrollVertically(-1);
        n21Var.V2.N(true);
        if (!canScrollVertically) {
            n21Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new g21(this, 1));
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

    public void setAllTopicsHidden(boolean z4) {
        if (this.a0 != z4) {
            this.a0 = z4;
            f(true);
        }
    }

    public void setCurrentTopic(long j10) {
        this.S = j10;
        l21 l21Var = this.s;
        l21Var.V2.N(true);
        l21Var.invalidate();
        this.D.V2.N(true);
        w21 w21Var = this.v;
        if (w21Var != null) {
            w21Var.c(true, false, j10 == 0);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.W = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.V = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.U = callback2;
    }

    public void setSideMenuBackgroundDrawable(qg.b bVar) {
        this.H = bVar;
        bVar.p(AndroidUtilities.dp(16.0f));
        this.H.o(AndroidUtilities.dp(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f10) {
        this.J = f10;
        h();
        e();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f10) {
        this.K = f10;
        this.C.setTranslationY(f10);
        h();
        e();
        invalidate();
    }

    public void setTopMenuBackgroundDrawable(qg.b bVar) {
        this.I = bVar;
        bVar.p(AndroidUtilities.dp(18.0f));
        this.I.o(AndroidUtilities.dp(7.0f));
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
