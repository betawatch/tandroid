package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.SparseArray;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebProxyTransport;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FileLoader.2.lambda$didPreFinishLoading$0((FileLoadOperation) this.b, (FileLoaderPriorityQueue) this.c);
                break;
            case 1:
                ((ImageLoader) this.b).lambda$runHttpFileLoadTasks$13((ImageLoader.HttpFileTask) this.c);
                break;
            case 2:
                ((ImageLoader.ArtworkLoadTask) this.b).lambda$onPostExecute$0((String) this.c);
                break;
            case 3:
                ((ImageLoader.CacheOutTask) this.b).lambda$onPostExecute$1((Drawable) this.c);
                break;
            case 4:
                ((ImageLoader.ThumbGenerateTask) this.b).lambda$removeTask$0((String) this.c);
                break;
            case 5:
                ((MediaController.2) this.b).lambda$run$0((ByteBuffer) this.c);
                break;
            case 6:
                ((MediaController.5) this.b).lambda$run$1((MessageObject) this.c);
                break;
            case 7:
                ((MediaController.MediaLoader) this.b).lambda$addMessageToLoad$7((MessageObject) this.c);
                break;
            case 8:
                ((MediaDataController.2) this.b).lambda$run$0((ArrayList) this.c);
                break;
            case 9:
                ((MediaDataController.3) this.b).lambda$run$0((ArrayList) this.c);
                break;
            case 10:
                ((SendMessagesHelper.ImportingHistory.2) this.b).lambda$run$0((String) this.c);
                break;
            case 11:
                ((WebProxyTransport) this.b).lambda$acceptLoop$1((WebProxyTransport.Stream) this.c);
                break;
            case 12:
                ((BetaUpdaterController) this.b).lambda$downloadUpdate$4((File) this.c);
                break;
            case 13:
                ((BirthdayController) this.b).lambda$check$2((TLObject) this.c);
                break;
            case 14:
                ((ChatMessagesMetadataController) this.b).lambda$loadStoriesForMessages$0((ArrayList) this.c);
                break;
            case 15:
                ChatThemeController.lambda$getWallpaperBitmap$7((File) this.b, (ResultCallback) this.c);
                break;
            case 16:
                ((ResultCallback) this.b).onComplete((Bitmap) this.c);
                break;
            case 17:
                ((ChatThemeController) this.b).lambda$processUpdate$14((TLRPC.ChatFull) this.c);
                break;
            case 18:
                ChatThemeController.lambda$loadWallpaperPatternBitmap$11((File) this.b, (Utilities.Callback) this.c);
                break;
            case 19:
                ((Utilities.Callback) this.b).run((qf.a) this.c);
                break;
            case 20:
                ((ChatThemeController) this.b).lambda$requestNextChatThemes$20((ResultCallback) this.c);
                break;
            case 21:
                ChatThemeController.lambda$saveWallpaperBitmap$8((File) this.b, (Bitmap) this.c);
                break;
            case 22:
                CodeHighlighting.lambda$highlight$4((ArrayList) this.b, (Spannable) this.c);
                break;
            case 23:
                ((ContactsController) this.b).lambda$addContact$50((TLRPC.User) this.c);
                break;
            case 24:
                ((ContactsController) this.b).lambda$deleteAllContacts$8((Runnable) this.c);
                break;
            case 25:
                ((ContactsController) this.b).lambda$checkInviteText$2((TLRPC.TL_help_inviteText) this.c);
                break;
            case 26:
                ((ContactsController) this.b).lambda$applyContactsUpdates$46((Long) this.c);
                break;
            case 27:
                ((ContactsController) this.b).lambda$migratePhoneBookToV7$12((SparseArray) this.c);
                break;
            case 28:
                ((ContactsController) this.b).lambda$deleteContactsUndoable$53((HashMap) this.c);
                break;
            default:
                ((DispatchQueuePoolBackground) this.b).lambda$execute$0((DispatchQueue) this.c);
                break;
        }
    }
}
