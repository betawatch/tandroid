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
import org.telegram.ui.sd1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d21 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ud.b {
    public static final /* synthetic */ int b0 = 0;
    public final ImageView A;
    public final FrameLayout B;
    public final t11 C;
    public long D;
    public long E;
    public final ud.a F;
    public lg.d G;
    public lg.d H;
    public float I;
    public float J;
    public org.telegram.ui.ge K;
    public boolean L;
    public boolean M;
    public float N;
    public boolean O;
    public Boolean P;
    public ValueAnimator Q;
    public long R;
    public boolean S;
    public Utilities.Callback2 T;
    public Runnable U;
    public Utilities.Callback2 V;
    public boolean W;
    public final ud.a a;
    public final HashSet a0;
    public final int b;
    public final long c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final boolean e;
    public final boolean f;
    public final org.telegram.ui.rn h;
    public final boolean n;
    public final FrameLayout r;
    public final r11 s;
    public final c21 v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;

    /* JADX WARN: Type inference failed for: r3v9, types: [org.telegram.ui.Components.q11] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.telegram.ui.Components.q11] */
    public d21(Activity activity, org.telegram.ui.rn rnVar, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        ViewGroup viewGroup;
        er erVar = er.h;
        this.a = new ud.a(0, this, erVar, 380L, true);
        this.F = new ud.a(0, new k11(this), erVar, 320L, false);
        this.N = 0.0f;
        this.a0 = new HashSet();
        this.h = rnVar;
        this.b = i10;
        this.c = j10;
        this.d = c6Var;
        long j11 = -j10;
        this.e = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)));
        boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        this.f = isBotForumWithEditableTopics;
        this.n = !org.telegram.messenger.y1.w("topics_end_reached_", j11, UserConfig.getInstance(i10).getPreferences(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.r = frameLayout;
        addView(frameLayout, h7.z5.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.B = frameLayout2;
        addView(frameLayout2, h7.z5.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        final int i11 = 0;
        r11 r11Var = new r11(this, activity, i10, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.q11
            public final /* synthetic */ d21 b;

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
                d21 d21Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b51 b51Var = (b51) obj2;
                        boolean z13 = d21Var.f;
                        int i14 = d21Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = d21Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = d21Var.e;
                        int i15 = x11.a;
                        n41 J = n41.J(x11.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(d21Var.R == 0);
                        arrayList.add(J);
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
                                if (d21Var.a0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((n41) i0.a.i(1, arrayList)).y |= 8;
                                        }
                                        b51Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        b51Var.M();
                                        z15 = true;
                                    }
                                    n41 J2 = n41.J(x11.class);
                                    J2.x = j17;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j19 = d21Var.R;
                                    if (z14) {
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
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            b51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && d21Var.n) {
                            n41 J3 = n41.J(x11.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            n41 J4 = n41.J(x11.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            n41 J5 = n41.J(x11.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                n41 J6 = n41.J(x11.class);
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
                        d21.b(d21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        b51 b51Var2 = (b51) obj2;
                        boolean z17 = d21Var.e;
                        int i19 = d21Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = d21Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = d21Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = b21.a;
                            n41 J7 = n41.J(b21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(d21Var.R == 0);
                            arrayList2.add(J7);
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
                                if (d21Var.a0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        b51Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        b51Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = b21.a;
                                    n41 J8 = n41.J(b21.class);
                                    J8.x = j20;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z17) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = d21Var.R;
                                    if (z17) {
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
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            b51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && d21Var.n) {
                            int i24 = b21.a;
                            n41 J9 = n41.J(b21.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            n41 J10 = n41.J(b21.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            n41 J11 = n41.J(b21.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = b21.a;
                                n41 J12 = n41.J(b21.class);
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
        }, new k11(this), new k11(this), c6Var);
        this.s = r11Var;
        final int i12 = 1;
        r11Var.B1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.q11
            public final /* synthetic */ d21 b;

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
                d21 d21Var = this.b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b51 b51Var = (b51) obj2;
                        boolean z13 = d21Var.f;
                        int i14 = d21Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i14);
                        long j17 = d21Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i14).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = d21Var.e;
                        int i15 = x11.a;
                        n41 J = n41.J(x11.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(d21Var.R == 0);
                        arrayList.add(J);
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
                                if (d21Var.a0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((n41) i0.a.i(1, arrayList)).y |= 8;
                                        }
                                        b51Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        b51Var.M();
                                        z15 = true;
                                    }
                                    n41 J2 = n41.J(x11.class);
                                    J2.x = j17;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j19 = d21Var.R;
                                    if (z14) {
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
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            b51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && d21Var.n) {
                            n41 J3 = n41.J(x11.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            n41 J4 = n41.J(x11.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            n41 J5 = n41.J(x11.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                n41 J6 = n41.J(x11.class);
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
                        d21.b(d21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        b51 b51Var2 = (b51) obj2;
                        boolean z17 = d21Var.e;
                        int i19 = d21Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = d21Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = d21Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = b21.a;
                            n41 J7 = n41.J(b21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(d21Var.R == 0);
                            arrayList2.add(J7);
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
                                if (d21Var.a0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        b51Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        b51Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = b21.a;
                                    n41 J8 = n41.J(b21.class);
                                    J8.x = j20;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z17) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = d21Var.R;
                                    if (z17) {
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
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            b51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && d21Var.n) {
                            int i24 = b21.a;
                            n41 J9 = n41.J(b21.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            n41 J10 = n41.J(b21.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            n41 J11 = n41.J(b21.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = b21.a;
                                n41 J12 = n41.J(b21.class);
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
        r11Var.setWillNotDraw(false);
        r11Var.U2.r = false;
        r11Var.getContext();
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((ViewGroup) r11Var, 4);
        r11Var.T2 = vqVar;
        r11Var.setLayoutManager(vqVar);
        frameLayout.addView(r11Var, h7.z5.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        r11Var.j(new s11(this, 0));
        if (isBotForumWithEditableTopics) {
            c21 c21Var = new c21(activity, i10, c6Var);
            this.v = c21Var;
            c21Var.c(true, false, this.R == 0);
            final int i13 = 2;
            c21Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o11
                public final /* synthetic */ d21 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            d21 d21Var = this.b;
                            Boolean bool = d21Var.P;
                            boolean z10 = false;
                            if (bool == null ? !d21Var.M : !bool.booleanValue()) {
                                z10 = true;
                            }
                            d21Var.d(z10);
                            break;
                        case 1:
                            d21 d21Var2 = this.b;
                            t11 t11Var = d21Var2.C;
                            t11Var.w1(false);
                            r11 r11Var2 = d21Var2.s;
                            r11Var2.w1(false);
                            d21Var2.F.a(false, true);
                            AndroidUtilities.updateVisibleRows(t11Var);
                            AndroidUtilities.updateVisibleRows(r11Var2);
                            break;
                        default:
                            this.b.T.run(0, Boolean.FALSE);
                            break;
                    }
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(c21Var, h7.z5.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.v = null;
        }
        final int i14 = 2;
        ViewGroup viewGroup2 = viewGroup;
        t11 t11Var = new t11(activity, i10, new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.q11
            public final /* synthetic */ d21 b;

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
                d21 d21Var = this.b;
                switch (i132) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b51 b51Var = (b51) obj2;
                        boolean z13 = d21Var.f;
                        int i142 = d21Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i142);
                        long j17 = d21Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i142).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i142).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = d21Var.e;
                        int i15 = x11.a;
                        n41 J = n41.J(x11.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(d21Var.R == 0);
                        arrayList.add(J);
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
                                if (d21Var.a0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((n41) i0.a.i(1, arrayList)).y |= 8;
                                        }
                                        b51Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        b51Var.M();
                                        z15 = true;
                                    }
                                    n41 J2 = n41.J(x11.class);
                                    J2.x = j17;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j19 = d21Var.R;
                                    if (z14) {
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
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            b51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && d21Var.n) {
                            n41 J3 = n41.J(x11.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            n41 J4 = n41.J(x11.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            n41 J5 = n41.J(x11.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                n41 J6 = n41.J(x11.class);
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
                        d21.b(d21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        b51 b51Var2 = (b51) obj2;
                        boolean z17 = d21Var.e;
                        int i19 = d21Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = d21Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = d21Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = b21.a;
                            n41 J7 = n41.J(b21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(d21Var.R == 0);
                            arrayList2.add(J7);
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
                                if (d21Var.a0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        b51Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        b51Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = b21.a;
                                    n41 J8 = n41.J(b21.class);
                                    J8.x = j20;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z17) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = d21Var.R;
                                    if (z17) {
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
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            b51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && d21Var.n) {
                            int i24 = b21.a;
                            n41 J9 = n41.J(b21.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            n41 J10 = n41.J(b21.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            n41 J11 = n41.J(b21.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = b21.a;
                                n41 J12 = n41.J(b21.class);
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
        }, new k11(this), new k11(this), c6Var);
        this.C = t11Var;
        final int i15 = 1;
        t11Var.B1(new Utilities.Callback2(this) { // from class: org.telegram.ui.Components.q11
            public final /* synthetic */ d21 b;

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
                d21 d21Var = this.b;
                switch (i132) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b51 b51Var = (b51) obj2;
                        boolean z13 = d21Var.f;
                        int i142 = d21Var.b;
                        MessagesController messagesController = MessagesController.getInstance(i142);
                        long j17 = d21Var.c;
                        long j18 = -j17;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j18));
                        TLRPC.User user2 = MessagesController.getInstance(i142).getUser(Long.valueOf(j17));
                        TopicsController topicsController2 = MessagesController.getInstance(i142).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics = topicsController2.getTopics(j18);
                        boolean z14 = d21Var.e;
                        int i152 = x11.a;
                        n41 J = n41.J(x11.class);
                        J.d = 0;
                        J.B = 0L;
                        J.G = null;
                        J.q = z14;
                        J.K(d21Var.R == 0);
                        arrayList.add(J);
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
                                if (d21Var.a0.contains(Integer.valueOf(tL_forumTopic2.id))) {
                                    size = i18;
                                    i16 = i122;
                                } else {
                                    boolean z16 = tL_forumTopic2.pinned;
                                    if (!z16 && z15) {
                                        if (!arrayList.isEmpty()) {
                                            ((n41) i0.a.i(1, arrayList)).y |= 8;
                                        }
                                        b51Var.L();
                                        z15 = false;
                                    } else if (z16 && !z15) {
                                        b51Var.M();
                                        z15 = true;
                                    }
                                    n41 J2 = n41.J(x11.class);
                                    J2.x = j17;
                                    J2.d = tL_forumTopic2.id;
                                    J2.G = tL_forumTopic2;
                                    if (z14) {
                                        z11 = z15;
                                        J2.B = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                                        J2.I = false;
                                    } else {
                                        z11 = z15;
                                    }
                                    long j19 = d21Var.R;
                                    if (z14) {
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
                                    z15 = z11;
                                }
                            }
                            z10 = z15;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            b51Var.L();
                        }
                        if (topics != null && !topics.isEmpty() && !topicsController2.endIsReached(j18) && d21Var.n) {
                            n41 J3 = n41.J(x11.class);
                            J3.d = -2;
                            J3.r = true;
                            arrayList.add(J3);
                            n41 J4 = n41.J(x11.class);
                            J4.d = -3;
                            J4.r = true;
                            arrayList.add(J4);
                            n41 J5 = n41.J(x11.class);
                            J5.d = -4;
                            J5.r = true;
                            arrayList.add(J5);
                        }
                        if (!z13 && !z14) {
                            if ((chat != null && ChatObject.canCreateTopic(chat)) || UserObject.isBotForumWithEditableTopics(user2)) {
                                n41 J6 = n41.J(x11.class);
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
                        d21.b(d21Var, (ArrayList) obj2);
                        break;
                    default:
                        ArrayList arrayList2 = (ArrayList) obj;
                        b51 b51Var2 = (b51) obj2;
                        boolean z17 = d21Var.e;
                        int i19 = d21Var.b;
                        MessagesController messagesController2 = MessagesController.getInstance(i19);
                        long j20 = d21Var.c;
                        long j21 = -j20;
                        TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j21));
                        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j20));
                        TopicsController topicsController3 = MessagesController.getInstance(i19).getTopicsController();
                        ArrayList<TLRPC.TL_forumTopic> topics2 = topicsController3.getTopics(j21);
                        boolean z18 = d21Var.f;
                        if (z18) {
                            topicsController = topicsController3;
                        } else {
                            int i20 = b21.a;
                            n41 J7 = n41.J(b21.class);
                            J7.d = 0;
                            topicsController = topicsController3;
                            J7.B = 0L;
                            J7.G = null;
                            J7.q = z17;
                            J7.y = z18 ? 1 : 0;
                            J7.K(d21Var.R == 0);
                            arrayList2.add(J7);
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
                                if (d21Var.a0.contains(Integer.valueOf(tL_forumTopic4.id))) {
                                    chat2 = chat3;
                                    size2 = i22;
                                    user3 = user;
                                } else {
                                    boolean z19 = tL_forumTopic4.pinned;
                                    if (!z19 && z12) {
                                        b51Var2.L();
                                        z12 = false;
                                    } else if (z19 && !z12) {
                                        b51Var2.M();
                                        z12 = true;
                                    }
                                    int i23 = b21.a;
                                    n41 J8 = n41.J(b21.class);
                                    J8.x = j20;
                                    J8.d = tL_forumTopic4.id;
                                    J8.G = tL_forumTopic4;
                                    if (z17) {
                                        j14 = j20;
                                        J8.B = DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                                        J8.I = false;
                                    } else {
                                        j14 = j20;
                                    }
                                    long j22 = d21Var.R;
                                    if (z17) {
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
                            z12 = false;
                        }
                        TLRPC.Chat chat4 = chat2;
                        TLRPC.User user4 = user3;
                        if (z12) {
                            b51Var2.L();
                        }
                        if (topics2 != null && !topics2.isEmpty() && !topicsController.endIsReached(j21) && d21Var.n) {
                            int i24 = b21.a;
                            n41 J9 = n41.J(b21.class);
                            J9.d = -2;
                            J9.r = true;
                            J9.e = false;
                            arrayList2.add(J9);
                            n41 J10 = n41.J(b21.class);
                            J10.d = -3;
                            J10.r = true;
                            J10.e = false;
                            arrayList2.add(J10);
                            n41 J11 = n41.J(b21.class);
                            J11.d = -4;
                            J11.r = true;
                            J11.e = false;
                            arrayList2.add(J11);
                        }
                        if (!z18 && !z17) {
                            if ((chat4 != null && ChatObject.canCreateTopic(chat4)) || UserObject.isBotForumWithEditableTopics(user4)) {
                                int i25 = b21.a;
                                n41 J12 = n41.J(b21.class);
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
        t11Var.U2.r = false;
        t11Var.setClipToPadding(false);
        t11Var.setClipChildren(false);
        viewGroup2.addView(t11Var, h7.z5.d(-1, -1.0f, 119, 0.0f, isBotForumWithEditableTopics ? 90.0f : 48.0f, 0.0f, 0.0f));
        t11Var.j(new s11(this, 1));
        final int i16 = 0;
        ImageView i17 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o11
            public final /* synthetic */ d21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        d21 d21Var = this.b;
                        Boolean bool = d21Var.P;
                        boolean z10 = false;
                        if (bool == null ? !d21Var.M : !bool.booleanValue()) {
                            z10 = true;
                        }
                        d21Var.d(z10);
                        break;
                    case 1:
                        d21 d21Var2 = this.b;
                        t11 t11Var2 = d21Var2.C;
                        t11Var2.w1(false);
                        r11 r11Var2 = d21Var2.s;
                        r11Var2.w1(false);
                        d21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(t11Var2);
                        AndroidUtilities.updateVisibleRows(r11Var2);
                        break;
                    default:
                        this.b.T.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.y = i17;
        final int i18 = 0;
        ImageView i19 = i(activity, R.drawable.menu_sidebar_left, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o11
            public final /* synthetic */ d21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        d21 d21Var = this.b;
                        Boolean bool = d21Var.P;
                        boolean z10 = false;
                        if (bool == null ? !d21Var.M : !bool.booleanValue()) {
                            z10 = true;
                        }
                        d21Var.d(z10);
                        break;
                    case 1:
                        d21 d21Var2 = this.b;
                        t11 t11Var2 = d21Var2.C;
                        t11Var2.w1(false);
                        r11 r11Var2 = d21Var2.s;
                        r11Var2.w1(false);
                        d21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(t11Var2);
                        AndroidUtilities.updateVisibleRows(r11Var2);
                        break;
                    default:
                        this.b.T.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.A = i19;
        frameLayout.addView(i17, h7.z5.e(44, 36, 51));
        viewGroup2.addView(i19, h7.z5.e(64, 48, 51));
        final int i20 = 1;
        ImageView i21 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o11
            public final /* synthetic */ d21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        d21 d21Var = this.b;
                        Boolean bool = d21Var.P;
                        boolean z10 = false;
                        if (bool == null ? !d21Var.M : !bool.booleanValue()) {
                            z10 = true;
                        }
                        d21Var.d(z10);
                        break;
                    case 1:
                        d21 d21Var2 = this.b;
                        t11 t11Var2 = d21Var2.C;
                        t11Var2.w1(false);
                        r11 r11Var2 = d21Var2.s;
                        r11Var2.w1(false);
                        d21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(t11Var2);
                        AndroidUtilities.updateVisibleRows(r11Var2);
                        break;
                    default:
                        this.b.T.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.w = i21;
        final int i22 = 1;
        ImageView i23 = i(activity, R.drawable.msg_select, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o11
            public final /* synthetic */ d21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i22) {
                    case 0:
                        d21 d21Var = this.b;
                        Boolean bool = d21Var.P;
                        boolean z10 = false;
                        if (bool == null ? !d21Var.M : !bool.booleanValue()) {
                            z10 = true;
                        }
                        d21Var.d(z10);
                        break;
                    case 1:
                        d21 d21Var2 = this.b;
                        t11 t11Var2 = d21Var2.C;
                        t11Var2.w1(false);
                        r11 r11Var2 = d21Var2.s;
                        r11Var2.w1(false);
                        d21Var2.F.a(false, true);
                        AndroidUtilities.updateVisibleRows(t11Var2);
                        AndroidUtilities.updateVisibleRows(r11Var2);
                        break;
                    default:
                        this.b.T.run(0, Boolean.FALSE);
                        break;
                }
            }
        });
        this.x = i23;
        frameLayout.addView(i21, h7.z5.e(44, 36, 51));
        viewGroup2.addView(i23, h7.z5.e(64, 48, 51));
        MessagesController.getInstance(i10).getTopicsController().loadTopics(j11, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        if (org.telegram.messenger.y1.w("topicssidetabs", j10, mainSettings, false)) {
            this.N = 1.0f;
            this.M = true;
        }
        boolean w10 = org.telegram.messenger.y1.w("topicssidetabsb", j10, mainSettings, false);
        this.L = w10;
        i19.setImageResource(w10 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        f(false);
        g();
        n();
        p();
    }

    public static void a(d21 d21Var, n41 n41Var) {
        if (d21Var.e) {
            Utilities.Callback2 callback2 = d21Var.V;
            if (callback2 != null) {
                callback2.run(Long.valueOf(n41Var.B), Boolean.FALSE);
                return;
            }
            return;
        }
        if (n41Var.B == -2) {
            Runnable runnable = d21Var.U;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = d21Var.T;
        if (callback22 != null) {
            callback22.run(Integer.valueOf(n41Var.d), Boolean.FALSE);
        }
    }

    public static void b(d21 d21Var, ArrayList arrayList) {
        long j10 = d21Var.c;
        TopicsController topicsController = MessagesController.getInstance(d21Var.b).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = i0.a.f(((n41) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        topicsController.reorderPinnedTopics(j11, arrayList2);
        topicsController.sortTopics(j11, false);
    }

    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    public static boolean c(final d21 d21Var, n41 n41Var, View view) {
        TLRPC.Chat chat;
        final d21 d21Var2;
        org.telegram.ui.ActionBar.c6 c6Var;
        final int i10;
        ?? r11;
        byte b10;
        int i11;
        final b70 b70Var;
        b70 b70Var2;
        org.telegram.ui.ActionBar.c6 c6Var2 = d21Var.d;
        org.telegram.ui.rn rnVar = d21Var.h;
        long j10 = d21Var.c;
        int i12 = d21Var.b;
        if (d21Var.C.Y2 || d21Var.s.Y2) {
            return false;
        }
        Object obj = n41Var.G;
        if (!(obj instanceof TLRPC.TL_forumTopic)) {
            return false;
        }
        final TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
        MessagesController messagesController = MessagesController.getInstance(i12);
        TLRPC.Chat chat2 = j10 < 0 ? messagesController.getChat(Long.valueOf(-j10)) : null;
        TLRPC.User user = j10 > 0 ? messagesController.getUser(Long.valueOf(j10)) : null;
        final b70 I = b70.I(rnVar, view);
        if (ChatObject.isMonoForum(chat2)) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(i12, chat2)) {
                return false;
            }
            TLRPC.Chat chat3 = chat2;
            I.c(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new org.telegram.messenger.pg(d21Var, I, peerDialogId, chat2, 5), false);
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
                b70Var2 = I;
                i11 = 8;
            } else {
                I.c(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), null, false);
                org.telegram.ui.ActionBar.f1 y10 = I.y();
                i11 = 8;
                y10.setVisibility(8);
                MessagesController messagesController2 = MessagesController.getInstance(i12);
                hh.q2 q2Var = new hh.q2(d21Var, y10, I, j11, user2, chat4);
                b70Var2 = I;
                messagesController2.checkIsInChat(true, chat4, user2, q2Var);
            }
            b70Var = b70Var2;
            c6Var = c6Var2;
            i10 = 2;
            r11 = 1;
            b10 = 0;
        } else {
            TLRPC.Chat chat5 = chat2;
            if (ChatObject.canManageTopics(chat5) || UserObject.isBotForumWithEditableTopics(user)) {
                boolean z10 = tL_forumTopic.pinned;
                int i13 = z10 ? R.drawable.msg_unpin : R.drawable.msg_pin;
                String string = LocaleController.getString(z10 ? R.string.DialogUnpin : R.string.DialogPin);
                int i14 = i13;
                chat = chat5;
                d21Var2 = d21Var;
                l11 l11Var = new l11(d21Var2, I, messagesController, tL_forumTopic, 0);
                I = I;
                messagesController = messagesController;
                tL_forumTopic = tL_forumTopic;
                int i15 = 0;
                I.c(i14, string, l11Var, false);
                if (tL_forumTopic.pinned) {
                    I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new m11(d21Var2, i15), false);
                }
            } else {
                d21Var2 = d21Var;
                chat = chat5;
            }
            if (ChatObject.canManageTopics(chat) || UserObject.isBotForumWithEditableTopics(user)) {
                final int i16 = 0;
                I.c(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable(d21Var2) { // from class: org.telegram.ui.Components.n11
                    public final /* synthetic */ d21 b;

                    {
                        this.b = d21Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z11;
                        int i17 = i16;
                        d21 d21Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        b70 b70Var3 = I;
                        switch (i17) {
                            case 0:
                                b70Var3.u();
                                d21Var3.h.presentFragment(sd1.a0(-d21Var3.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                d21Var3.getClass();
                                b70Var3.u();
                                MessagesController.getInstance(d21Var3.b).getTopicsController().toggleCloseTopic(-d21Var3.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                b70Var3.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                gc gcVar = new gc(15);
                                d21 d21Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.N = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = d21Var4.R;
                                if (hashSet.size() == 1) {
                                    z11 = false;
                                    b2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(d21Var4.b).getTopicsController().findTopic(-d21Var4.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z11 = false;
                                    b2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hh.c3(d21Var4, arrayList, j13, hashSet, gcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(18));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, z11));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            long j13 = d21Var2.c;
            long j14 = tL_forumTopic.id;
            int currentAccount = rnVar.getCurrentAccount();
            org.telegram.ui.ActionBar.c6 resourceProvider = rnVar.getResourceProvider();
            b70 b70Var3 = I;
            xn xnVar = new xn(b70Var3, currentAccount, j13, j14, rnVar, resourceProvider);
            b70 J = b70Var3.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new org.telegram.ui.lt0(b70Var3, 25), false);
            J.c(R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), new org.telegram.messenger.ge(b70Var3, currentAccount, j13, j14, J, rnVar, resourceProvider), false);
            org.telegram.ui.ActionBar.f1 y11 = J.y();
            J.c(R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), new ag.k0(b70Var3, resourceProvider, currentAccount, xnVar, 16), false);
            c6Var = c6Var2;
            J.c(R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), new cg.t0(b70Var3, j13, j14, rnVar, resourceProvider, 8), false);
            J.c(0, "", new hh.v7(b70Var3, currentAccount, j13, j14, rnVar, resourceProvider), false);
            new org.telegram.messenger.q9(currentAccount, j13, j14, J.y(), y11).run();
            boolean isDialogMuted = messagesController.isDialogMuted(j10, tL_forumTopic.id);
            int i17 = isDialogMuted ? R.drawable.msg_unmute : R.drawable.msg_mute;
            String string2 = LocaleController.getString(isDialogMuted ? R.string.Unmute : R.string.Mute);
            i10 = 2;
            r11 = 1;
            r11 = 1;
            b10 = 0;
            i11 = 8;
            l20 l20Var = new l20(d21Var, messagesController, tL_forumTopic, b70Var3, J, 3);
            b70Var = b70Var3;
            b70Var.c(i17, string2, l20Var, false);
            TLRPC.Chat chat6 = chat;
            if (ChatObject.canManageTopic(i12, chat6, tL_forumTopic) && !UserObject.isBotForum(user)) {
                boolean z11 = tL_forumTopic.closed;
                int i18 = z11 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close;
                String string3 = LocaleController.getString(z11 ? R.string.RestartTopic : R.string.CloseTopic);
                final int i19 = r11 == true ? 1 : 0;
                b70Var.c(i18, string3, new Runnable(d21Var) { // from class: org.telegram.ui.Components.n11
                    public final /* synthetic */ d21 b;

                    {
                        this.b = d21Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z112;
                        int i172 = i19;
                        d21 d21Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        b70 b70Var32 = b70Var;
                        switch (i172) {
                            case 0:
                                b70Var32.u();
                                d21Var3.h.presentFragment(sd1.a0(-d21Var3.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                d21Var3.getClass();
                                b70Var32.u();
                                MessagesController.getInstance(d21Var3.b).getTopicsController().toggleCloseTopic(-d21Var3.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                b70Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                gc gcVar = new gc(15);
                                d21 d21Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.N = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = d21Var4.R;
                                if (hashSet.size() == 1) {
                                    z112 = false;
                                    b2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(d21Var4.b).getTopicsController().findTopic(-d21Var4.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z112 = false;
                                    b2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hh.c3(d21Var4, arrayList, j132, hashSet, gcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(18));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, z112));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
            if (ChatObject.canDeleteTopic(i12, chat6, tL_forumTopic)) {
                b70Var.c(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable(d21Var) { // from class: org.telegram.ui.Components.n11
                    public final /* synthetic */ d21 b;

                    {
                        this.b = d21Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z112;
                        int i172 = i10;
                        d21 d21Var3 = this.b;
                        TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                        b70 b70Var32 = b70Var;
                        switch (i172) {
                            case 0:
                                b70Var32.u();
                                d21Var3.h.presentFragment(sd1.a0(-d21Var3.c, tL_forumTopic2.id));
                                break;
                            case 1:
                                d21Var3.getClass();
                                b70Var32.u();
                                MessagesController.getInstance(d21Var3.b).getTopicsController().toggleCloseTopic(-d21Var3.c, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                                break;
                            default:
                                b70Var32.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                                gc gcVar = new gc(15);
                                d21 d21Var4 = this.b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d21Var4.getContext());
                                String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.N = pluralString;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = d21Var4.R;
                                if (hashSet.size() == 1) {
                                    z112 = false;
                                    b2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(d21Var4.b).getTopicsController().findTopic(-d21Var4.c, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    z112 = false;
                                    b2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
                                }
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hh.c3(d21Var4, arrayList, j132, hashSet, gcVar));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(18));
                                b2Var.show();
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, z112));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
            }
        }
        if (view instanceof y11) {
            lv lvVar = new lv(i10, b10);
            Paint paint = new Paint((int) r11);
            lvVar.c = paint;
            lvVar.b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
            b70Var.W(lvVar);
            b70Var.a0(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            int dp = AndroidUtilities.dp(5.0f);
            int dp2 = AndroidUtilities.dp(5.0f);
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var);
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
            b70Var.W(shapeDrawable);
        }
        b70Var.Z();
        return r11;
    }

    public static ImageView i(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        h7.b6.a(imageView);
        return imageView;
    }

    private void setAttached(boolean z10) {
        if (this.S == z10) {
            return;
        }
        this.S = z10;
        long j10 = this.c;
        int i10 = this.b;
        if (z10) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentResume(-j10);
        } else {
            MessagesController.getInstance(i10).getTopicsController().onTopicFragmentPause(-j10);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        }
    }

    public final void d(boolean z10) {
        if (this.M == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.O) {
                this.P = Boolean.valueOf(z10);
                return;
            }
        }
        if (!z10) {
            this.L = !this.L;
        }
        this.M = z10;
        this.O = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N, z10 ? 1.0f : 0.0f);
        this.Q = ofFloat;
        ofFloat.addUpdateListener(new v60(this, 28));
        this.Q.addListener(new u11(this, z10));
        this.Q.setInterpolator(sh.m.V);
        this.Q.setDuration(250L);
        this.Q.start();
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
        FrameLayout frameLayout = this.B;
        if (frameLayout.getVisibility() == 0) {
            this.G.setBounds((int) frameLayout.getTranslationX(), (int) this.J, (int) (frameLayout.getTranslationX() + AndroidUtilities.dp(78.0f)), (int) (getMeasuredHeight() - this.I));
            this.G.draw(canvas);
        }
        FrameLayout frameLayout2 = this.r;
        if (frameLayout2.getVisibility() == 0) {
            this.H.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.H.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + AndroidUtilities.dp(50.0f)));
            this.H.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        canvas.save();
        if (view == this.B) {
            canvas.clipPath(this.G.h.k);
        }
        if (view == this.r) {
            canvas.clipPath(this.H.h.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        FrameLayout frameLayout = this.B;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.I + this.J);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void f(boolean z10) {
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.b).getTopicsController().getTopics(-this.c);
        this.a.a((topics == null || topics.isEmpty() || this.W) ? false : true, z10);
    }

    public final void g() {
        ud.a aVar = this.F;
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
        ImageView imageView4 = this.A;
        imageView4.setAlpha(f11);
        imageView4.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView4.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
        imageView4.setVisibility(f11 > 0.0f ? 0 : 8);
    }

    public z11 getCurrentTabsPosition() {
        return this.M ? z11.b : this.L ? z11.c : z11.a;
    }

    public float getSideMenuT() {
        return this.N * this.a.e;
    }

    public final void h() {
        float lerp = AndroidUtilities.lerp(1.0f, 0.0f, this.N);
        FrameLayout frameLayout = this.r;
        frameLayout.setAlpha(lerp);
        frameLayout.setVisibility((1.0f - this.N) * this.a.e > 0.0f ? 0 : 8);
        if (this.L) {
            frameLayout.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.I) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, j(z11.c)));
        } else {
            frameLayout.setTranslationY(this.J + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, j(z11.a)));
        }
    }

    public final float j(z11 z11Var) {
        float f10;
        float f11 = this.a.e;
        if (z11Var == z11.b) {
            f10 = this.N;
        } else {
            if ((z11Var != z11.a || this.L) && !(z11Var == z11.c && this.L)) {
                return 0.0f;
            }
            f10 = 1.0f - this.N;
        }
        return f10 * f11;
    }

    public final boolean k() {
        if (this.N <= 0.5f) {
            int i10 = 0;
            while (true) {
                r11 r11Var = this.s;
                if (i10 >= r11Var.getChildCount()) {
                    break;
                }
                n41 G = r11Var.U2.G(RecyclerView.R(r11Var.getChildAt(i10)));
                if (G != null && G.r) {
                    return true;
                }
                i10++;
            }
        } else {
            int i11 = 0;
            while (true) {
                t11 t11Var = this.C;
                if (i11 >= t11Var.getChildCount()) {
                    break;
                }
                n41 G2 = t11Var.U2.G(RecyclerView.R(t11Var.getChildAt(i11)));
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

    public final void m(long j10, boolean z10) {
        if (this.e) {
            Utilities.Callback2 callback2 = this.V;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.T;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final void n() {
        org.telegram.ui.ge geVar = this.K;
        if (geVar != null) {
            geVar.run();
        }
        h();
        float j10 = j(z11.b);
        float lerp = AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, j10);
        FrameLayout frameLayout = this.B;
        frameLayout.setTranslationX(lerp);
        frameLayout.setVisibility(j10 <= 0.0f ? 8 : 0);
        int i10 = org.telegram.ui.ActionBar.g6.z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        int d = i0.b.d(1.0f - this.N, v02, org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.y.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.A.setColorFilter(new PorterDuffColorFilter(i0.b.d(this.N, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)), mode));
        this.w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), mode));
        this.x.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), mode));
        invalidate();
    }

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        n();
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

    public final void p() {
        f(true);
        r11 r11Var = this.s;
        boolean canScrollHorizontally = r11Var.canScrollHorizontally(-1);
        r11Var.U2.N(true);
        if (!canScrollHorizontally) {
            r11Var.u0(0);
        }
        t11 t11Var = this.C;
        boolean canScrollVertically = t11Var.canScrollVertically(-1);
        t11Var.U2.N(true);
        if (!canScrollVertically) {
            t11Var.u0(0);
        }
        AndroidUtilities.runOnUIThread(new m11(this, 1));
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            f(true);
        }
    }

    public void setCurrentTopic(long j10) {
        this.R = j10;
        r11 r11Var = this.s;
        r11Var.U2.N(true);
        r11Var.invalidate();
        this.C.U2.N(true);
        c21 c21Var = this.v;
        if (c21Var != null) {
            c21Var.c(true, false, j10 == 0);
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.V = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.U = runnable;
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.T = callback2;
    }

    public void setSideMenuBackgroundDrawable(lg.d dVar) {
        this.G = dVar;
        dVar.p(AndroidUtilities.dp(16.0f));
        this.G.o(AndroidUtilities.dp(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f10) {
        this.I = f10;
        h();
        e();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f10) {
        this.J = f10;
        this.B.setTranslationY(f10);
        h();
        e();
        invalidate();
    }

    public void setTopMenuBackgroundDrawable(lg.d dVar) {
        this.H = dVar;
        dVar.p(AndroidUtilities.dp(18.0f));
        this.H.o(AndroidUtilities.dp(7.0f));
    }

    @Override // ud.b
    public final /* synthetic */ void A(float f10, int i10) {
    }
}
