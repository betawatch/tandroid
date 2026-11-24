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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kn0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kn0(kl8 kl8Var, fi0 fi0Var, i8c i8cVar, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, byte b) {
        this.a = b;
        this.e = kl8Var;
        this.c = fi0Var;
        this.f = i8cVar;
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
                gl.d3(new ln0((Object) tL_error, obj6, (Object) tLObject, obj5, obj4, obj3, obj2, obj, (byte) 0));
                break;
            case 1:
                gl.d3(new ln0((Object) tL_error, obj6, (Object) tLObject, obj5, obj4, obj3, obj2, obj, (byte) 1));
                break;
            case 2:
                na7 na7Var = (na7) obj6;
                Activity activity = (Activity) obj5;
                hd hdVar = (hd) obj4;
                sc7 sc7Var = (sc7) obj3;
                d dVar = (d) obj2;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) obj;
                na7Var.getClass();
                if (tL_error != null) {
                    gl.d3(new i87((Object) na7Var, (Object) sc7Var, (Object) activity, (Object) hdVar, (Object) tL_error, (Object) dVar, (Object) tL_channels_convertToGigagroup, (byte) 1));
                    break;
                } else {
                    if (activity != null) {
                        gl.d3(new x87(activity, hdVar, (byte) 0));
                    }
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    gl.d3(new lf(sc7Var, (byte) 2));
                    break;
                }
            case 3:
                gl.d3(new ln0(tLObject, (kl8) obj6, (fi0) obj4, (i8c) obj3, (Activity) obj2, (TLRPC.InputStorePaymentPurpose) obj, (List) obj5, tL_error, (byte) 8));
                break;
            case 4:
                gl.d3(new ln0(tLObject, (kl8) obj6, (fi0) obj4, (i8c) obj3, (Activity) obj2, (TLRPC.InputStorePaymentPurpose) obj, (List) obj5, tL_error, (byte) 9));
                break;
            case 5:
                final b1c b1cVar = (b1c) obj6;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj5;
                final String str = (String) obj4;
                final z0c z0cVar = (z0c) obj3;
                final et etVar = (et) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                b1cVar.getClass();
                if (!(tLObject instanceof TLRPC.TL_messages_translateResult)) {
                    final byte b2 = 1;
                    gl.d3(new Runnable() { // from class: q0c
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            et etVar2 = etVar;
                            z0c z0cVar2 = z0cVar;
                            String str2 = str;
                            TL_stories.StoryItem storyItem2 = storyItem;
                            b1c b1cVar2 = b1cVar;
                            b1cVar2.getClass();
                            switch (b3) {
                                case 0:
                                    storyItem2.translatedLng = str2;
                                    storyItem2.translatedText = null;
                                    b1cVar2.getMessagesController().M1().k.h(storyItem2.dialogId, storyItem2);
                                    b1cVar2.K.remove(z0cVar2);
                                    etVar2.run();
                                    break;
                                default:
                                    storyItem2.translatedLng = str2;
                                    storyItem2.translatedText = null;
                                    b1cVar2.getMessagesController().M1().k.h(storyItem2.dialogId, storyItem2);
                                    b1cVar2.K.remove(z0cVar2);
                                    etVar2.run();
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() > 0) {
                        gl.d3(new i87((Object) b1cVar, (Object) storyItem, (Object) str, (Object) tL_textWithEntities, (Object) arrayList.get(0), (Object) z0cVar, (Object) etVar, (byte) 22));
                        break;
                    } else {
                        final byte b3 = 0;
                        gl.d3(new Runnable() { // from class: q0c
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b32 = b3;
                                et etVar2 = etVar;
                                z0c z0cVar2 = z0cVar;
                                String str2 = str;
                                TL_stories.StoryItem storyItem2 = storyItem;
                                b1c b1cVar2 = b1cVar;
                                b1cVar2.getClass();
                                switch (b32) {
                                    case 0:
                                        storyItem2.translatedLng = str2;
                                        storyItem2.translatedText = null;
                                        b1cVar2.getMessagesController().M1().k.h(storyItem2.dialogId, storyItem2);
                                        b1cVar2.K.remove(z0cVar2);
                                        etVar2.run();
                                        break;
                                    default:
                                        storyItem2.translatedLng = str2;
                                        storyItem2.translatedText = null;
                                        b1cVar2.getMessagesController().M1().k.h(storyItem2.dialogId, storyItem2);
                                        b1cVar2.K.remove(z0cVar2);
                                        etVar2.run();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
            default:
                gl.d3(new ln0((UserInfoActivity) obj6, tL_error, (TLObject) obj5, (TL_account.TL_birthday) obj4, (TLRPC.UserFull) obj3, tLObject, (int[]) obj2, (ArrayList) obj));
                break;
        }
    }

    public /* synthetic */ kn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.f = obj4;
        this.d = obj5;
        this.g = obj6;
    }
}
