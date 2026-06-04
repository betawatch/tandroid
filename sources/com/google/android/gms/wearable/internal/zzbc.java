package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelClient;

/* loaded from: classes.dex */
public final class zzbc implements ChannelApi.ChannelListener {
    private final ChannelClient.ChannelCallback zza;

    public zzbc(ChannelClient.ChannelCallback channelCallback) {
        this.zza = channelCallback;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbc.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzbc) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onChannelClosed(Channel channel, int i, int i2) {
        zzbq zzd;
        ChannelClient.ChannelCallback channelCallback = this.zza;
        zzd = zzbd.zzd(channel);
        channelCallback.onChannelClosed(zzd, i, i2);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onChannelOpened(Channel channel) {
        zzbq zzd;
        ChannelClient.ChannelCallback channelCallback = this.zza;
        zzd = zzbd.zzd(channel);
        channelCallback.onChannelOpened(zzd);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onInputClosed(Channel channel, int i, int i2) {
        zzbq zzd;
        ChannelClient.ChannelCallback channelCallback = this.zza;
        zzd = zzbd.zzd(channel);
        channelCallback.onInputClosed(zzd, i, i2);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onOutputClosed(Channel channel, int i, int i2) {
        zzbq zzd;
        ChannelClient.ChannelCallback channelCallback = this.zza;
        zzd = zzbd.zzd(channel);
        channelCallback.onOutputClosed(zzd, i, i2);
    }
}
