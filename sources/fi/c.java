package fi;

import ci.m2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Utilities.Callback5, Utilities.Callback5Return, MessagesStorage.StringCallback {
    public final /* synthetic */ f a;

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.a.getClass();
        return Boolean.FALSE;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f.U(this.a, (j51) obj);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        f fVar = this.a;
        fVar.getMessagesController().getChat(Long.valueOf(-fVar.a));
        fVar.showDialog(new hi.b(fVar.getParentActivity(), null, fVar.a, new m2(13, fVar, str)));
    }
}
