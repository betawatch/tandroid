package kg;

import android.text.TextUtils;
import org.telegram.messenger.ri;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class u {
    public TL_account.TL_businessChatLink a;

    public final boolean equals(Object obj) {
        TL_account.TL_businessChatLink tL_businessChatLink = this.a;
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            TL_account.TL_businessChatLink tL_businessChatLink2 = ((u) obj).a;
            if (tL_businessChatLink.views == tL_businessChatLink2.views && TextUtils.equals(tL_businessChatLink.link, tL_businessChatLink2.link) && TextUtils.equals(tL_businessChatLink.title, tL_businessChatLink2.title) && TextUtils.equals(tL_businessChatLink.message, tL_businessChatLink2.message) && ri.M(tL_businessChatLink.entities, tL_businessChatLink2.entities)) {
                return true;
            }
        }
        return false;
    }
}
