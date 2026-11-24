// default package

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ko0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ko0(ln8 ln8Var, fj0 fj0Var, jac jacVar, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, byte b) {
        this.a = b;
        this.e = ln8Var;
        this.c = fj0Var;
        this.f = jacVar;
        this.d = activity;
        this.g = inputStorePaymentPurpose;
        this.b = list;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                gm.c3(new lo0((Object) tL_error, obj6, (Object) tLObject, obj5, obj4, obj3, obj2, obj, (byte) 0));
                break;
            case 1:
                gm.c3(new lo0((Object) tL_error, obj6, (Object) tLObject, obj5, obj4, obj3, obj2, obj, (byte) 1));
                break;
            case 2:
                oc7 oc7Var = (oc7) obj6;
                Activity activity = (Activity) obj5;
                he heVar = (he) obj4;
                ue7 ue7Var = (ue7) obj3;
                d dVar = (d) obj2;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) obj;
                oc7Var.getClass();
                if (tL_error != null) {
                    gm.c3(new ja7((Object) oc7Var, (Object) ue7Var, (Object) activity, (Object) heVar, (Object) tL_error, (Object) dVar, (Object) tL_channels_convertToGigagroup, (byte) 1));
                    break;
                } else {
                    if (activity != null) {
                        gm.c3(new ya7(activity, heVar, (byte) 0));
                    }
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    gm.c3(new kg(ue7Var, (byte) 2));
                    break;
                }
            case 3:
                gm.c3(new lo0(tLObject, (ln8) obj6, (fj0) obj4, (jac) obj3, (Activity) obj2, (TLRPC.InputStorePaymentPurpose) obj, (List) obj5, tL_error, (byte) 8));
                break;
            case 4:
                gm.c3(new lo0(tLObject, (ln8) obj6, (fj0) obj4, (jac) obj3, (Activity) obj2, (TLRPC.InputStorePaymentPurpose) obj, (List) obj5, tL_error, (byte) 9));
                break;
            case 5:
                final b3c b3cVar = (b3c) obj6;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj5;
                final String str = (String) obj4;
                final z2c z2cVar = (z2c) obj3;
                final fu fuVar = (fu) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                b3cVar.getClass();
                if (!(tLObject instanceof TLRPC.TL_messages_translateResult)) {
                    final byte b2 = 1;
                    gm.c3(new Runnable() { // from class: q2c
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            fu fuVar2 = fuVar;
                            z2c z2cVar2 = z2cVar;
                            String str2 = str;
                            TL_stories.StoryItem storyItem2 = storyItem;
                            b3c b3cVar2 = b3cVar;
                            b3cVar2.getClass();
                            switch (b3) {
                                case 0:
                                    storyItem2.translatedLng = str2;
                                    storyItem2.translatedText = null;
                                    b3cVar2.getMessagesController().N1().k.h(storyItem2.dialogId, storyItem2);
                                    b3cVar2.K.remove(z2cVar2);
                                    fuVar2.run();
                                    break;
                                default:
                                    storyItem2.translatedLng = str2;
                                    storyItem2.translatedText = null;
                                    b3cVar2.getMessagesController().N1().k.h(storyItem2.dialogId, storyItem2);
                                    b3cVar2.K.remove(z2cVar2);
                                    fuVar2.run();
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() > 0) {
                        gm.c3(new ja7((Object) b3cVar, (Object) storyItem, (Object) str, (Object) tL_textWithEntities, (Object) arrayList.get(0), (Object) z2cVar, (Object) fuVar, (byte) 22));
                        break;
                    } else {
                        final byte b3 = 0;
                        gm.c3(new Runnable() { // from class: q2c
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b32 = b3;
                                fu fuVar2 = fuVar;
                                z2c z2cVar2 = z2cVar;
                                String str2 = str;
                                TL_stories.StoryItem storyItem2 = storyItem;
                                b3c b3cVar2 = b3cVar;
                                b3cVar2.getClass();
                                switch (b32) {
                                    case 0:
                                        storyItem2.translatedLng = str2;
                                        storyItem2.translatedText = null;
                                        b3cVar2.getMessagesController().N1().k.h(storyItem2.dialogId, storyItem2);
                                        b3cVar2.K.remove(z2cVar2);
                                        fuVar2.run();
                                        break;
                                    default:
                                        storyItem2.translatedLng = str2;
                                        storyItem2.translatedText = null;
                                        b3cVar2.getMessagesController().N1().k.h(storyItem2.dialogId, storyItem2);
                                        b3cVar2.K.remove(z2cVar2);
                                        fuVar2.run();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
            default:
                gm.c3(new lo0((UserInfoActivity) obj6, tL_error, (TLObject) obj5, (TL_account.TL_birthday) obj4, (TLRPC.UserFull) obj3, tLObject, (int[]) obj2, (ArrayList) obj));
                break;
        }
    }

    public /* synthetic */ ko0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.f = obj4;
        this.d = obj5;
        this.g = obj6;
    }
}
