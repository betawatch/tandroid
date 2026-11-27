// default package

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.c;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class jf implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jf(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object[] objArr = 0;
        int i = this.b;
        final byte b2 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                int[] iArr = (int[]) obj3;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj2;
                lp7 lp7Var = (lp7) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = uc7.s1(yac.t0).W3.edit();
                if (i == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.a.M0.run();
                lp7Var.run();
                break;
            case 1:
                ((wf1) obj3).S0(i, (ArrayList) obj2, (Integer) obj);
                break;
            case 2:
                c cVar = (c) obj3;
                final pnc pncVar = (pnc) obj2;
                ArrayList arrayList = pncVar.b;
                ae8 ae8Var = (ae8) obj;
                cVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                final int i2 = 0;
                while (i2 < arrayList.size()) {
                    Context context = cVar.a.getContext();
                    CharSequence charSequence = (CharSequence) arrayList.get(i2);
                    boolean z = i2 == pncVar.c;
                    k43 k43Var = bn3.J0;
                    arrayList2.add(new l7(context, charSequence, null, this.b, z));
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    arrayList3.add(new Runnable() { // from class: cy1
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = objArr2;
                            int i3 = i2;
                            pnc pncVar2 = pncVar;
                            switch (b3) {
                                case 0:
                                    pncVar2.d.a(Integer.valueOf(i3));
                                    break;
                                default:
                                    pncVar2.d.a(Integer.valueOf(i3));
                                    break;
                            }
                        }
                    });
                    i2++;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ae8Var.s;
                Activity activity = ae8Var.a;
                vnb vnbVar = ae8Var.r;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, vnbVar, activity);
                s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, ob6.M0(2131753749, null), false, ae8Var.r).setOnClickListener(new am7(ae8Var, (byte) 19));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(new k8(activity, vnbVar), tre.o(-1, 8));
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    View view2 = (View) arrayList2.get(i3);
                    Runnable runnable = (Runnable) arrayList3.get(i3);
                    view2.setBackground(aob.f0(aob.p1(0.12f, aob.v0(aob.E8, vnbVar)), 2, -1));
                    view2.setMinimumWidth(hl.L(220.0f));
                    view2.setOnClickListener(new zd8(ae8Var, runnable, (byte) 1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(view2, tre.o(-1, 44));
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(actionBarPopupWindow$ActionBarPopupWindowLayout.b(actionBarPopupWindow$ActionBarPopupWindowLayout2));
                break;
            case 3:
                c cVar2 = (c) obj3;
                final pnc pncVar2 = (pnc) obj2;
                ArrayList arrayList4 = pncVar2.b;
                zv4 zv4Var = (zv4) obj;
                cVar2.getClass();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                final int i4 = 0;
                while (i4 < arrayList4.size()) {
                    Context context2 = cVar2.a.getContext();
                    CharSequence charSequence2 = (CharSequence) arrayList4.get(i4);
                    boolean z2 = i4 == pncVar2.c;
                    k43 k43Var2 = bn3.J0;
                    arrayList5.add(new l7(context2, charSequence2, null, this.b, z2));
                    arrayList6.add(new Runnable() { // from class: cy1
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            int i32 = i4;
                            pnc pncVar22 = pncVar2;
                            switch (b3) {
                                case 0:
                                    pncVar22.d.a(Integer.valueOf(i32));
                                    break;
                                default:
                                    pncVar22.d.a(Integer.valueOf(i32));
                                    break;
                            }
                        }
                    });
                    i4++;
                }
                zv4Var.h(arrayList5, arrayList6);
                break;
            case 4:
                j95 j95Var = (j95) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i < arrayList7.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) j95Var.T2.d.f(r47.B1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    j95Var.s1(groupCallParticipant, r47.B1(groupCallParticipant.peer), ((Integer) arrayList7.get(i)).intValue());
                    o85 o85Var = j95Var.U4;
                    if (o85Var != null) {
                        o85Var.dismiss();
                        break;
                    } else if (((Integer) arrayList7.get(i)).intValue() != 9 && ((Integer) arrayList7.get(i)).intValue() != 10 && ((Integer) arrayList7.get(i)).intValue() != 11) {
                        j95Var.U0(true);
                        break;
                    }
                }
                break;
            case 5:
                c51 c51Var = (c51) obj3;
                Context context3 = (Context) obj2;
                nx0 nx0Var = (nx0) obj;
                if (!c51Var.R) {
                    c51Var.setLoading(true);
                    int i5 = this.b;
                    qz7.a(context3, i5, new f((Object) c51Var, (Object) context3, (Object) nx0Var, i5, (byte) 8));
                    break;
                }
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                RectF rectF = ProfileActivity.Z6;
                ((n8) ((AtomicReference) obj2).get()).dismiss();
                try {
                    hl.g(str);
                    if (i == profileActivity.P3) {
                        d31.b0(profileActivity).i(ob6.M0(2131752742, null)).j();
                    } else {
                        d31.b0(profileActivity).i(ob6.M0(2131752674, null)).j();
                    }
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                tzb tzbVar = (tzb) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                uc7 messagesController = tzbVar.getMessagesController();
                long j = -tzbVar.a;
                if (messagesController.p2(j, tL_forumTopic.id, null)) {
                    tzbVar.getNotificationsController().G(j, tL_forumTopic.id, false);
                    tzbVar.finishPreviewFragment();
                    if (d31.a(tzbVar)) {
                        d31.z(tzbVar, 4, 0, tzbVar.getResourceProvider()).j();
                        break;
                    }
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jf(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public /* synthetic */ jf(e eVar, Object obj, Serializable serializable, int i, byte b) {
        this.a = b;
        this.c = eVar;
        this.d = obj;
        this.e = serializable;
        this.b = i;
    }
}
