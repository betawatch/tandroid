package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ff1 extends org.telegram.ui.ActionBar.o2 {
    public df1 a;
    public org.telegram.ui.Components.jl0 b;
    public long c;
    public ArrayList d;
    public HashSet e;

    public static void U(ff1 ff1Var, int i10) {
        ff1Var.getNotificationsController().getNotificationsSettingsFacade().clearPreference(ff1Var.c, i10);
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = ff1Var.getMessagesController().getInputPeer(ff1Var.c);
        tL_inputNotifyForumTopic.top_msg_id = i10;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        ff1Var.getConnectionsManager().sendRequest(updatenotifysettings, new lh.o5(5));
    }

    public final void V() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (this.isPaused || this.a == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        arrayList2.add(new ef1(1, null));
        ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(-this.c);
        int i10 = 0;
        if (topics != null) {
            int i11 = 0;
            while (i10 < topics.size()) {
                if (this.e.contains(Integer.valueOf(topics.get(i10).id))) {
                    arrayList2.add(new ef1(2, topics.get(i10)));
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            arrayList2.add(new ef1(3, null));
            arrayList2.add(new ef1(4, null));
        }
        arrayList2.add(new ef1(3, null));
        df1 df1Var = this.a;
        if (df1Var != null) {
            df1Var.E(arrayList, arrayList2);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        th.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 22));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.b = new org.telegram.ui.Components.jl0(context, null);
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.m = false;
        this.b.setItemAnimator(lVar);
        this.b.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.jl0 jl0Var = this.b;
        df1 df1Var = new df1(this);
        this.a = df1Var;
        jl0Var.setAdapter(df1Var);
        this.b.setOnItemClickListener(new cf1(this));
        frameLayout.addView(this.b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.c = this.arguments.getLong("dialog_id");
        V();
        return super.onFragmentCreate();
    }
}
