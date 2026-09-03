package org.telegram.messenger;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((CompoundEmoji.DrawableInfo) this.b).lambda$load$0();
                break;
            case 1:
                ((FeedRemoteViewsFactory) this.b).lambda$onDataSetChanged$0();
                break;
            case 2:
                ((FilesMigrationService.1) this.b).lambda$run$0();
                break;
            case 3:
                ((ImageLoader.6) this.b).lambda$onReceive$0();
                break;
            case 4:
                ((LocaleController.TimeZoneChangedReceiver) this.b).lambda$onReceive$0();
                break;
            case 5:
                ((MediaController.7) this.b).lambda$onSurfaceDestroyed$0();
                break;
            case 6:
                ((MediaController.9) this.b).lambda$onSurfaceDestroyed$0();
                break;
            case 7:
                ((MediaController.GalleryObserverInternal) this.b).lambda$scheduleReloadRunnable$0();
                break;
            case 8:
                ((MediaController.MusicListenReporter) this.b).report();
                break;
            case 9:
                MediaController.VideoConvertRunnable.lambda$runConversion$0((MediaController.VideoConvertMessage) this.b);
                break;
            case 10:
                ((TelegramMediaSession.SessionCallback) this.b).lambda$notifyPlayStateForNotificationRefresh$0();
                break;
            case 11:
                ((ANRDetector) this.b).run();
                break;
            case 12:
                AndroidUtilities.lambda$notifyDataSetChanged$26((RecyclerView) this.b);
                break;
            case 13:
                ((BotFullscreenButtons) this.b).lambda$new$0();
                break;
            case 14:
                ((BotFullscreenButtons.OptionsIcon) this.b).invalidateSelf();
                break;
            case 15:
                CodeHighlighting.lambda$highlight$3((CodeHighlighting.LockedSpannableString) this.b);
                break;
            case 16:
                ((CompoundEmoji.CompoundEmojiDrawable) this.b).invalidate();
                break;
            case 17:
                ((ContactsLoadingObserver) this.b).lambda$new$1();
                break;
            case 18:
                ((DispatchQueueMainThreadSync) this.b).lambda$recycle$0();
                break;
            case 19:
                ((FactCheckController) this.b).loadMissing();
                break;
            case 20:
                ((FileLoaderPriorityQueue) this.b).lambda$new$0();
                break;
            case 21:
                ((FilePathDatabase) this.b).lambda$clear$3();
                break;
            case 22:
                FileRefController.lambda$onRequestComplete$46((TLRPC.TL_theme) this.b);
                break;
            case 23:
                ((ImageReceiver) this.b).invalidate();
                break;
            case 24:
                MediaController.lambda$saveFile$46((org.telegram.ui.ActionBar.d2) this.b);
                break;
            case 25:
                ((org.telegram.ui.Components.gc) this.b).f();
                break;
            case 26:
                MediaDataController.lambda$addRecentGif$27((TLRPC.Document) this.b);
                break;
            case 27:
                MessagesController.lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.b);
                break;
            case 28:
                MessagesController.lambda$performLogout$321((TLObject) this.b);
                break;
            default:
                MessagesController.lambda$setContentSettings$503((TLRPC.TL_error) this.b);
                break;
        }
    }
}
