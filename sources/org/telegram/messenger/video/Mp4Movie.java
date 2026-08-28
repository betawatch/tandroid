package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class Mp4Movie {
    private File cacheFile;
    private int height;
    private yb.d matrix = yb.d.j;
    private ArrayList<Track> tracks = new ArrayList<>();
    private int width;

    public void addSample(int i9, long j10, MediaCodec.BufferInfo bufferInfo) {
        if (i9 < 0 || i9 >= this.tracks.size()) {
            return;
        }
        this.tracks.get(i9).addSample(j10, bufferInfo);
    }

    public int addTrack(MediaFormat mediaFormat, boolean z10) {
        this.tracks.add(new Track(this.tracks.size(), mediaFormat, z10));
        return this.tracks.size() - 1;
    }

    public File getCacheFile() {
        return this.cacheFile;
    }

    public int getHeight() {
        return this.height;
    }

    public long getLastFrameTimestamp(int i9) {
        if (i9 < 0 || i9 >= this.tracks.size()) {
            return 0L;
        }
        return this.tracks.get(i9).getLastFrameTimestamp();
    }

    public yb.d getMatrix() {
        return this.matrix;
    }

    public ArrayList<Track> getTracks() {
        return this.tracks;
    }

    public int getWidth() {
        return this.width;
    }

    public void setCacheFile(File file) {
        this.cacheFile = file;
    }

    public void setRotation(int i9) {
        if (i9 == 0) {
            this.matrix = yb.d.j;
            return;
        }
        if (i9 == 90) {
            this.matrix = yb.d.k;
        } else if (i9 == 180) {
            this.matrix = yb.d.l;
        } else if (i9 == 270) {
            this.matrix = yb.d.m;
        }
    }

    public void setSize(int i9, int i10) {
        this.width = i9;
        this.height = i10;
    }
}
