// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class et7 implements fn7 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ at7 d;

    public /* synthetic */ et7(String str, int i, long j, at7 at7Var) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = at7Var;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object[] objArr) {
        TLRPC.Message message;
        if (i != 1 || objArr.length < 2) {
            return;
        }
        Object obj = objArr[1];
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList.get(i3);
                i3++;
                if ((obj2 instanceof r47) && (message = ((r47) obj2).k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            String str = ((TL_stars.TL_starGiftUnique) starGift).slug;
                            String str2 = this.a;
                            if (TextUtils.equals(str2, str)) {
                                jxa v = jxa.v(this.b, false);
                                v.O(str2);
                                v.M(this.c);
                                this.d.run();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }
}
