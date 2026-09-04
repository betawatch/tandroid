package org.telegram.ui;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class f4 {
    public static TLRPC.Document a(TLRPC.WebPage webPage, long j3) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Document document = webPage.document;
            if (document != null && document.id == j3) {
                return document;
            }
            for (int i10 = 0; i10 < webPage.cached_page.documents.size(); i10++) {
                TLRPC.Document document2 = webPage.cached_page.documents.get(i10);
                if (document2.id == j3) {
                    return document2;
                }
            }
        }
        return null;
    }

    public static TLRPC.Document b(TL_iv.RichMessage richMessage, long j3) {
        if (richMessage == null) {
            return null;
        }
        for (int i10 = 0; i10 < richMessage.documents.size(); i10++) {
            TLRPC.Document document = richMessage.documents.get(i10);
            if (document.id == j3) {
                return document;
            }
        }
        return null;
    }

    public static File c(TLObject tLObject) {
        FileLoader fileLoader = FileLoader.getInstance(UserConfig.selectedAccount);
        File pathToAttach = fileLoader.getPathToAttach(tLObject, false);
        if (pathToAttach != null && pathToAttach.exists()) {
            return pathToAttach;
        }
        File pathToAttach2 = fileLoader.getPathToAttach(tLObject, true);
        return (pathToAttach2 == null || !pathToAttach2.exists()) ? pathToAttach != null ? pathToAttach : pathToAttach2 : pathToAttach2;
    }

    public static TLRPC.Photo d(long j3, TLObject tLObject) {
        if (tLObject instanceof TL_iv.RichMessage) {
            return f((TL_iv.RichMessage) tLObject, j3);
        }
        if (!(tLObject instanceof TL_iv.Page)) {
            if (tLObject instanceof TLRPC.WebPage) {
                return e((TLRPC.WebPage) tLObject, j3);
            }
            return null;
        }
        TL_iv.Page page = (TL_iv.Page) tLObject;
        for (int i10 = 0; i10 < page.photos.size(); i10++) {
            TLRPC.Photo photo = page.photos.get(i10);
            if (photo.id == j3) {
                return photo;
            }
        }
        return null;
    }

    public static TLRPC.Photo e(TLRPC.WebPage webPage, long j3) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Photo photo = webPage.photo;
            if (photo != null && photo.id == j3) {
                return photo;
            }
            for (int i10 = 0; i10 < webPage.cached_page.photos.size(); i10++) {
                TLRPC.Photo photo2 = webPage.cached_page.photos.get(i10);
                if (photo2.id == j3) {
                    return photo2;
                }
            }
        }
        return null;
    }

    public static TLRPC.Photo f(TL_iv.RichMessage richMessage, long j3) {
        if (richMessage == null) {
            return null;
        }
        for (int i10 = 0; i10 < richMessage.photos.size(); i10++) {
            TLRPC.Photo photo = richMessage.photos.get(i10);
            if (photo.id == j3) {
                return photo;
            }
        }
        return null;
    }

    public static boolean g(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
        TLRPC.Document a2;
        if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (a2 = a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
            return false;
        }
        return MessageObject.isVideoDocument(a2);
    }
}
