package androidx.car.app;

import android.os.IInterface;
import android.util.Log;
import androidx.car.app.IAppHost;
import androidx.car.app.constraints.IConstraintHost;
import androidx.car.app.media.IMediaPlaybackHost;
import androidx.car.app.navigation.INavigationHost;
import androidx.car.app.suggestion.ISuggestionHost;
import androidx.car.app.utils.RemoteUtils;
import androidx.car.app.utils.ThreadUtils;
import j$.util.Objects;
import java.security.InvalidParameterException;

/* loaded from: classes.dex */
public final class HostDispatcher {
    private IAppHost mAppHost;
    private ICarHost mCarHost;
    private IConstraintHost mConstraintHost;
    private INavigationHost mNavigationHost;
    private IMediaPlaybackHost mPlaybackMediaHost;
    private ISuggestionHost mSuggestionHost;

    public Object dispatchForResult(final String str, final String str2, final HostCall hostCall) {
        return RemoteUtils.dispatchCallToHostForResult(str2, new RemoteUtils.RemoteCall() { // from class: androidx.car.app.HostDispatcher$$ExternalSyntheticLambda1
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                Object lambda$dispatchForResult$0;
                lambda$dispatchForResult$0 = HostDispatcher.this.lambda$dispatchForResult$0(str, str2, hostCall);
                return lambda$dispatchForResult$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$dispatchForResult$0(String str, String str2, HostCall hostCall) {
        IInterface host = getHost(str);
        if (host == null) {
            Log.e("CarApp.Dispatch", "Could not retrieve host while dispatching call " + str2);
            return null;
        }
        return hostCall.dispatch(host);
    }

    public void dispatch(final String str, final String str2, final HostCall hostCall) {
        RemoteUtils.dispatchCallToHost(str2, new RemoteUtils.RemoteCall() { // from class: androidx.car.app.HostDispatcher$$ExternalSyntheticLambda0
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                Object lambda$dispatch$1;
                lambda$dispatch$1 = HostDispatcher.this.lambda$dispatch$1(str, str2, hostCall);
                return lambda$dispatch$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$dispatch$1(String str, String str2, HostCall hostCall) {
        IInterface host = getHost(str);
        if (host == null) {
            Log.e("CarApp.Dispatch", "Could not retrieve host while dispatching call " + str2);
            return null;
        }
        hostCall.dispatch(host);
        return null;
    }

    public void setCarHost(ICarHost iCarHost) {
        ThreadUtils.checkMainThread();
        resetHosts();
        this.mCarHost = iCarHost;
    }

    void resetHosts() {
        ThreadUtils.checkMainThread();
        this.mCarHost = null;
        this.mAppHost = null;
        this.mNavigationHost = null;
    }

    IInterface getHost(String str) {
        if (this.mCarHost == null) {
            Log.e("CarApp.Dispatch", "Host is not bound when attempting to retrieve host service");
            return null;
        }
        str.hashCode();
        switch (str) {
            case "constraints":
                if (this.mConstraintHost == null) {
                    this.mConstraintHost = (IConstraintHost) RemoteUtils.dispatchCallToHostForResult("getHost(Constraints)", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.HostDispatcher$$ExternalSyntheticLambda3
                        @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                        public final Object call() {
                            IConstraintHost lambda$getHost$3;
                            lambda$getHost$3 = HostDispatcher.this.lambda$getHost$3();
                            return lambda$getHost$3;
                        }
                    });
                }
                return this.mConstraintHost;
            case "app":
                if (this.mAppHost == null) {
                    this.mAppHost = (IAppHost) RemoteUtils.dispatchCallToHostForResult("getHost(App)", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.HostDispatcher$$ExternalSyntheticLambda2
                        @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                        public final Object call() {
                            IAppHost lambda$getHost$2;
                            lambda$getHost$2 = HostDispatcher.this.lambda$getHost$2();
                            return lambda$getHost$2;
                        }
                    });
                }
                return this.mAppHost;
            case "car":
                return this.mCarHost;
            case "suggestion":
                if (this.mSuggestionHost == null) {
                    this.mSuggestionHost = (ISuggestionHost) RemoteUtils.dispatchCallToHostForResult("getHost(Suggestion)", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.HostDispatcher$$ExternalSyntheticLambda4
                        @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                        public final Object call() {
                            ISuggestionHost lambda$getHost$4;
                            lambda$getHost$4 = HostDispatcher.this.lambda$getHost$4();
                            return lambda$getHost$4;
                        }
                    });
                }
                return this.mSuggestionHost;
            case "media_playback":
                if (this.mPlaybackMediaHost == null) {
                    this.mPlaybackMediaHost = (IMediaPlaybackHost) RemoteUtils.dispatchCallToHostForResult("getHost(Media)", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.HostDispatcher$$ExternalSyntheticLambda5
                        @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                        public final Object call() {
                            IMediaPlaybackHost lambda$getHost$5;
                            lambda$getHost$5 = HostDispatcher.this.lambda$getHost$5();
                            return lambda$getHost$5;
                        }
                    });
                }
                return this.mPlaybackMediaHost;
            case "navigation":
                if (this.mNavigationHost == null) {
                    this.mNavigationHost = (INavigationHost) RemoteUtils.dispatchCallToHostForResult("getHost(Navigation)", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.HostDispatcher$$ExternalSyntheticLambda6
                        @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                        public final Object call() {
                            INavigationHost lambda$getHost$6;
                            lambda$getHost$6 = HostDispatcher.this.lambda$getHost$6();
                            return lambda$getHost$6;
                        }
                    });
                }
                return this.mNavigationHost;
            default:
                throw new InvalidParameterException("Invalid host type: " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IAppHost lambda$getHost$2() {
        ICarHost iCarHost = this.mCarHost;
        Objects.requireNonNull(iCarHost);
        return IAppHost.Stub.asInterface(iCarHost.getHost("app"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IConstraintHost lambda$getHost$3() {
        ICarHost iCarHost = this.mCarHost;
        Objects.requireNonNull(iCarHost);
        return IConstraintHost.Stub.asInterface(iCarHost.getHost("constraints"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ISuggestionHost lambda$getHost$4() {
        ICarHost iCarHost = this.mCarHost;
        Objects.requireNonNull(iCarHost);
        return ISuggestionHost.Stub.asInterface(iCarHost.getHost("suggestion"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IMediaPlaybackHost lambda$getHost$5() {
        ICarHost iCarHost = this.mCarHost;
        Objects.requireNonNull(iCarHost);
        return IMediaPlaybackHost.Stub.asInterface(iCarHost.getHost("media_playback"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ INavigationHost lambda$getHost$6() {
        ICarHost iCarHost = this.mCarHost;
        Objects.requireNonNull(iCarHost);
        return INavigationHost.Stub.asInterface(iCarHost.getHost("navigation"));
    }
}
