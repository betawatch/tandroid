// default package

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class cx {
    public static TLRPC.Document a(TLRPC.WebPage webPage, long j) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Document document = webPage.document;
            if (document != null && document.id == j) {
                return document;
            }
            for (int i = 0; i < webPage.cached_page.documents.size(); i++) {
                TLRPC.Document document2 = webPage.cached_page.documents.get(i);
                if (document2.id == j) {
                    return document2;
                }
            }
        }
        return null;
    }

    public static TLRPC.Document b(TL_iv.RichMessage richMessage, long j) {
        if (richMessage == null) {
            return null;
        }
        for (int i = 0; i < richMessage.documents.size(); i++) {
            TLRPC.Document document = richMessage.documents.get(i);
            if (document.id == j) {
                return document;
            }
        }
        return null;
    }

    public static File c(TLObject tLObject) {
        ba4.G(y6c.t0);
        File J = ba4.J(tLObject, null, false, true);
        if (J != null && J.exists()) {
            return J;
        }
        File J2 = ba4.J(tLObject, null, true, true);
        return (J2 == null || !J2.exists()) ? J != null ? J : J2 : J2;
    }

    public static TLRPC.Photo d(long j, TLObject tLObject) {
        if (tLObject instanceof TL_iv.RichMessage) {
            return f((TL_iv.RichMessage) tLObject, j);
        }
        if (!(tLObject instanceof TL_iv.Page)) {
            if (tLObject instanceof TLRPC.WebPage) {
                return e((TLRPC.WebPage) tLObject, j);
            }
            return null;
        }
        TL_iv.Page page = (TL_iv.Page) tLObject;
        for (int i = 0; i < page.photos.size(); i++) {
            TLRPC.Photo photo = page.photos.get(i);
            if (photo.id == j) {
                return photo;
            }
        }
        return null;
    }

    public static TLRPC.Photo e(TLRPC.WebPage webPage, long j) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Photo photo = webPage.photo;
            if (photo != null && photo.id == j) {
                return photo;
            }
            for (int i = 0; i < webPage.cached_page.photos.size(); i++) {
                TLRPC.Photo photo2 = webPage.cached_page.photos.get(i);
                if (photo2.id == j) {
                    return photo2;
                }
            }
        }
        return null;
    }

    public static TLRPC.Photo f(TL_iv.RichMessage richMessage, long j) {
        if (richMessage == null) {
            return null;
        }
        for (int i = 0; i < richMessage.photos.size(); i++) {
            TLRPC.Photo photo = richMessage.photos.get(i);
            if (photo.id == j) {
                return photo;
            }
        }
        return null;
    }

    public static boolean g(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
        TLRPC.Document a;
        if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (a = a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
            return false;
        }
        return k27.J4(a);
    }
}
