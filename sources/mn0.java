// default package

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mn0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ mn0(wo8 wo8Var, gi0 gi0Var, icc iccVar, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, byte b) {
        this.a = b;
        this.e = wo8Var;
        this.c = gi0Var;
        this.f = iccVar;
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
                hl.c3(new nn0((Object) tL_error, obj6, (Object) tLObject, obj5, obj4, obj3, obj2, obj, (byte) 0));
                break;
            case 1:
                hl.c3(new nn0((Object) tL_error, obj6, (Object) tLObject, obj5, obj4, obj3, obj2, obj, (byte) 1));
                break;
            case 2:
                uc7 uc7Var = (uc7) obj6;
                Activity activity = (Activity) obj5;
                id idVar = (id) obj4;
                bf7 bf7Var = (bf7) obj3;
                e eVar = (e) obj2;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) obj;
                uc7Var.getClass();
                if (tL_error != null) {
                    hl.c3(new ra7((Object) uc7Var, (Object) bf7Var, (Object) activity, (Object) idVar, (Object) tL_error, (Object) eVar, (Object) tL_channels_convertToGigagroup, (byte) 1));
                    break;
                } else {
                    if (activity != null) {
                        hl.c3(new gb7(activity, idVar, (byte) 0));
                    }
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new ue(bf7Var, (byte) 2));
                    break;
                }
            case 3:
                hl.c3(new nn0(tLObject, (wo8) obj6, (gi0) obj4, (icc) obj3, (Activity) obj2, (TLRPC.InputStorePaymentPurpose) obj, (List) obj5, tL_error, (byte) 8));
                break;
            case 4:
                hl.c3(new nn0(tLObject, (wo8) obj6, (gi0) obj4, (icc) obj3, (Activity) obj2, (TLRPC.InputStorePaymentPurpose) obj, (List) obj5, tL_error, (byte) 9));
                break;
            case 5:
                final a5c a5cVar = (a5c) obj6;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj5;
                final String str = (String) obj4;
                final y4c y4cVar = (y4c) obj3;
                final kt ktVar = (kt) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                a5cVar.getClass();
                if (!(tLObject instanceof TLRPC.TL_messages_translateResult)) {
                    final byte b2 = 1;
                    hl.c3(new Runnable() { // from class: j4c
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            kt ktVar2 = ktVar;
                            y4c y4cVar2 = y4cVar;
                            String str2 = str;
                            TL_stories.StoryItem storyItem2 = storyItem;
                            a5c a5cVar2 = a5cVar;
                            a5cVar2.getClass();
                            switch (b3) {
                                case 0:
                                    storyItem2.translatedLng = str2;
                                    storyItem2.translatedText = null;
                                    a5cVar2.getMessagesController().O1().k.h(storyItem2.dialogId, storyItem2);
                                    a5cVar2.K.remove(y4cVar2);
                                    ktVar2.run();
                                    break;
                                default:
                                    storyItem2.translatedLng = str2;
                                    storyItem2.translatedText = null;
                                    a5cVar2.getMessagesController().O1().k.h(storyItem2.dialogId, storyItem2);
                                    a5cVar2.K.remove(y4cVar2);
                                    ktVar2.run();
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() > 0) {
                        hl.c3(new ra7((Object) a5cVar, (Object) storyItem, (Object) str, (Object) tL_textWithEntities, (Object) arrayList.get(0), (Object) y4cVar, (Object) ktVar, (byte) 22));
                        break;
                    } else {
                        final byte b3 = 0;
                        hl.c3(new Runnable() { // from class: j4c
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b32 = b3;
                                kt ktVar2 = ktVar;
                                y4c y4cVar2 = y4cVar;
                                String str2 = str;
                                TL_stories.StoryItem storyItem2 = storyItem;
                                a5c a5cVar2 = a5cVar;
                                a5cVar2.getClass();
                                switch (b32) {
                                    case 0:
                                        storyItem2.translatedLng = str2;
                                        storyItem2.translatedText = null;
                                        a5cVar2.getMessagesController().O1().k.h(storyItem2.dialogId, storyItem2);
                                        a5cVar2.K.remove(y4cVar2);
                                        ktVar2.run();
                                        break;
                                    default:
                                        storyItem2.translatedLng = str2;
                                        storyItem2.translatedText = null;
                                        a5cVar2.getMessagesController().O1().k.h(storyItem2.dialogId, storyItem2);
                                        a5cVar2.K.remove(y4cVar2);
                                        ktVar2.run();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
            default:
                hl.c3(new nn0((UserInfoActivity) obj6, tL_error, (TLObject) obj5, (TL_account.TL_birthday) obj4, (TLRPC.UserFull) obj3, tLObject, (int[]) obj2, (ArrayList) obj));
                break;
        }
    }

    public /* synthetic */ mn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.f = obj4;
        this.d = obj5;
        this.g = obj6;
    }
}
